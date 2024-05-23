import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class JumpingBall extends JPanel {

    public static final int NUM_BALLS = 25; // Initial number of balls to display
    public static final int PANEL_WIDTH = 1920; // Width of the panel
    public static final int PANEL_HEIGHT = 1080; // Height of the panel

    private List<Ball> balls; // List to store the balls

    public JumpingBall() {
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT)); // Set preferred size for the panel
        initBalls(); // Initialize the balls
        Timer timer = new Timer(50, e -> update()); // Timer to update the animation
        timer.start(); // Start the timer

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    addBall(e.getX(), e.getY());
                } else if (SwingUtilities.isRightMouseButton(e)) {
                    removeBall(e.getX(), e.getY());
                }
            }
        });
    }

    private void initBalls() {
        balls = new ArrayList<>(); // Initialize the list of balls
        // Create and add the initial balls to the list
        for (int i = 0; i < NUM_BALLS; i++) {
            int x = (int) (Math.random() * (PANEL_WIDTH - Ball.RADIUS * 2));
            int y = (int) (Math.random() * (PANEL_HEIGHT - Ball.RADIUS * 2));
            int velocityX = (int) (Math.random() * 10) + 1; // Random horizontal velocity
            int velocityY = (int) (Math.random() * 10) + 1; // Random vertical velocity
            Color color = Color.getHSBColor((float) Math.random(), 1.0f, 1.0f); // Random rainbow color
            balls.add(new Ball(x, y, velocityX, velocityY, color)); // Add a new ball to the list
        }
    }

    private void addBall(int x, int y) {
        int velocityX = (int) (Math.random() * 10) + 1; // Random horizontal velocity
        int velocityY = (int) (Math.random() * 10) + 1; // Random vertical velocity
        Color color = Color.getHSBColor((float) Math.random(), 1.0f, 1.0f); // Random rainbow color
        balls.add(new Ball(x, y, velocityX, velocityY, color)); // Add a new ball to the list
    }

    private void removeBall(int x, int y) {
        balls.removeIf(ball -> ball.contains(x, y));
    }

    private void update() {
        // Update each ball's position
        for (int i = 0; i < balls.size(); i++) {
            Ball ball = balls.get(i);
            ball.update();
            // Check for collisions with other balls
            for (int j = i + 1; j < balls.size(); j++) {
                Ball other = balls.get(j);
                if (ball.collidesWith(other)) {
                    ball.resolveCollision(other);
                }
            }
        }
        repaint(); // Repaint the panel
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        // Draw each ball
        for (Ball ball : balls) {
            ball.draw(g2d);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Jumping Balls");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JumpingBall jumpingBall = new JumpingBall();
            frame.add(jumpingBall);
            frame.pack(); // Pack the frame to fit the preferred size of the panel
            frame.setVisible(true);
        });
    }
}

class Ball {
    public static final int RADIUS = 50;
    private int x;
    private int y;
    private int velocityX;
    private int velocityY;
    private Color color;

    public Ball(int x, int y, int velocityX, int velocityY, Color color) {
        this.x = x;
        this.y = y;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.color = color;
    }

    public void update() {
        // Update position
        x += velocityX;
        y += velocityY;
        // Check for collision with walls
        if (x <= 0 || x >= JumpingBall.PANEL_WIDTH - 2 * RADIUS) {
            velocityX = -velocityX; // Reverse horizontal velocity
        }
        if (y <= 0 || y >= JumpingBall.PANEL_HEIGHT - 2 * RADIUS) {
            velocityY = -velocityY; // Reverse vertical velocity
        }
    }

    public boolean collidesWith(Ball other) {
        int dx = other.x - this.x;
        int dy = other.y - this.y;
        int distanceSquared = dx * dx + dy * dy;
        int radiusSum = 2 * RADIUS;
        return distanceSquared < radiusSum * radiusSum;
    }

    public void resolveCollision(Ball other) {
        int dx = other.x - this.x;
        int dy = other.y - this.y;
        int distanceSquared = dx * dx + dy * dy;
        int distance = (int) Math.sqrt(distanceSquared);

        if (distance == 0) {
            // If distance is zero, adjust position slightly to avoid division by zero
            distance = 1;
        }

        int overlap = 2 * RADIUS - distance;

        // Separate the balls to prevent them from sticking together
        int separationX = dx * overlap / distance / 2;
        int separationY = dy * overlap / distance / 2;

        this.x -= separationX;
        this.y -= separationY;
        other.x += separationX;
        other.y += separationY;

        // Swap velocities for a simple collision response
        int tempVelocityX = this.velocityX;
        int tempVelocityY = this.velocityY;
        this.velocityX = other.velocityX;
        this.velocityY = other.velocityY;
        other.velocityX = tempVelocityX;
        other.velocityY = tempVelocityY;
    }

    public boolean contains(int mouseX, int mouseY) {
        int dx = mouseX - (x + RADIUS);
        int dy = mouseY - (y + RADIUS);
        return dx * dx + dy * dy <= RADIUS * RADIUS;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillOval(x, y, RADIUS * 2, RADIUS * 2);
    }
}
