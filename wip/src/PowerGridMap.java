import java.util.*;

class PowerCable {
    int startNode;
    int endNode;
    int length;

    public PowerCable(int startNode, int endNode, int length) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.length = length;
    }
}

class PowerGrid {
    List<PowerCable> cables;

    public PowerGrid() {
        cables = new ArrayList<>();
    }

    public void addCable(int startNode, int endNode, int length) {
        cables.add(new PowerCable(startNode, endNode, length));
    }

    public void findOptimalRoutes() {
        // Sort cables by length
        Collections.sort(cables, Comparator.comparingInt(c -> c.length));

        // Initialize parent array for Union-Find
        int[] parent = new int[cables.size()];
        for (int i = 0; i < cables.size(); i++) {
            parent[i] = i;
        }

        List<PowerCable> mst = new ArrayList<>();
        int mstSize = 0;
        int index = 0;

        while (mstSize < cables.size() - 1 && index < cables.size()) {
            PowerCable cable = cables.get(index++);
            int startParent = find(parent, cable.startNode);
            int endParent = find(parent, cable.endNode);

            if (startParent != endParent) {
                mst.add(cable);
                mstSize++;
                union(parent, startParent, endParent);
            }
        }

        // Print the MST
        System.out.println("Minimal Spanning Tree:");
        for (PowerCable cable : mst) {
            System.out.println("Node " + cable.startNode + " -- " + cable.endNode + ": " + cable.length);
        }

        // Draw the grid with cables and optimal routes
        drawGrid(mst);
    }

    private void drawGrid(List<PowerCable> mst) {
        int maxX = 0, maxY = 0;
        for (PowerCable cable : mst) {
            maxX = Math.max(maxX, Math.max(cable.startNode, cable.endNode));
            maxY = Math.max(maxY, cable.length);
        }

        char[][] grid = new char[maxY + 1][maxX + 1];

        for (int y = 0; y <= maxY; y++) {
            for (int x = 0; x <= maxX; x++) {
                grid[y][x] = '.';
            }
        }

        for (PowerCable cable : mst) {
            int startX = Math.min(cable.startNode, cable.endNode);
            int startY = cable.length;
            int endX = Math.max(cable.startNode, cable.endNode);
            int endY = cable.length;

            if (cable.startNode == cable.endNode) {
                grid[startY][startX] = 'o';
            } else {
                grid[startY][startX] = 'S';
                grid[endY][endX] = 'E';
            }

            for (int x = Math.min(startX, endX) + 1; x < Math.max(startX, endX); x++) {
                grid[startY][x] = '-';
            }
            for (int y = Math.min(startY, endY) + 1; y < Math.max(startY, endY); y++) {
                grid[y][startX] = '|';
            }
        }

        System.out.println("\nPower Grid Map:");
        for (int y = 0; y <= maxY; y++) {
            for (int x = 0; x <= maxX; x++) {
                System.out.print(grid[y][x]);
            }
            System.out.println();
        }
    }

    private int find(int[] parent, int node) {
        if (parent[node] != node) {
            parent[node] = find(parent, parent[node]);
        }
        return parent[node];
    }

    private void union(int[] parent, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        parent[rootX] = rootY;
    }
}

public class PowerGridMap {
    public static void main(String[] args) {
        PowerGrid grid = new PowerGrid();
        grid.addCable(1, 2, 10);
        grid.addCable(2, 3, 5);
        grid.addCable(1, 3, 15);
        grid.addCable(2, 4, 20);
        grid.addCable(3, 4, 25);
        grid.addCable(4, 5, 30);

        grid.findOptimalRoutes();
    }
}
