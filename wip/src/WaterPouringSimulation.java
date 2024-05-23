import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class WaterPouringSimulation extends JPanel {

    private static final int PANEL_WIDTH = 800;
    private static final int PANEL_HEIGHT = 600;
    private static final int TIMER_DELAY = 16; // ~60 FPS
    private static final int PARTICLE_SIZE = 5;

    private List<Particle> particles;
    private Timer timer;

    public WaterPouringSimulation() {
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        particles = new ArrayList<>();
        timer = new Timer(TIMER_DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateParticles();
                repaint();
            }
        });
        timer.start();
    }

    private void updateParticles() {
        // Add new particles
        if (Math.random() < 0.5) {
            particles.add(new Particle(400, 50)); // Pouring from (400, 50)
        }

        // Update existing particles
        Iterator<Particle> iterator = particles.iterator();
        while (iterator.hasNext()) {
            Particle particle = iterator.next();
            particle.update();
            // Remove particles that fall below the bottom of the panel
            if (particle.getY() > PANEL_HEIGHT) {
                iterator.remove();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLUE);

        // Draw particles
        for (Particle particle : particles) {
            g2d.fillOval(particle.getX(), particle.getY(), PARTICLE_SIZE, PARTICLE_SIZE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Water Pouring Simulation");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            WaterPouringSimulation panel = new WaterPouringSimulation();
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    }
}

class Particle {
    private int x, y;
    private int velocityX, velocityY;
    private static final int GRAVITY = 1;

    public Particle(int startX, int startY) {
        x = startX;
        y = startY;
        Random rand = new Random();
        velocityX = rand.nextInt(3) - 1; // Random horizontal speed between -1 and 1
        velocityY = rand.nextInt(3) + 2; // Random vertical speed between 2 and 4
    }

    public void update() {
        x += velocityX;
        y += velocityY;
        velocityY += GRAVITY; // Apply gravity to vertical velocity
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
