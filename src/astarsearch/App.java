package astarsearch;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");
        Node node4 = new Node("D");

        node1.addNeighbour(new Edge(node2, 10));
        node2.addNeighbour(new Edge(node3, 10000));
        node3.addNeighbour(new Edge(node4, 10));
        node1.addNeighbour(new Edge(node4, 1));

        Algorithm algorithm = new Algorithm();
        algorithm.aStarSearch(node1, node4);
        List<Node> path = algorithm.printPath(node4);
        System.out.println(path);
    }

}
