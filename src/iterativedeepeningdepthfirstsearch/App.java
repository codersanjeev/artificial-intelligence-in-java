package iterativedeepeningdepthfirstsearch;

public class App {

    public static void main(String[] args){
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");

        node1.addNeighbour(node2);
        node2.addNeighbour(node3);

        Algorithm algorithm = new Algorithm(node3);
        algorithm.runDeepeningSearch(node1);
    }

}
