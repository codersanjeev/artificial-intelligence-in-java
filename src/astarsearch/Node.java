package astarsearch;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node>{
    private String value;
    private double gScore;
    private double fScore;
    private double x;
    private double y;
    private List<Edge> adjacencyList;
    private Node parentNode;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public double getgScore() {
        return gScore;
    }

    public void setgScore(double gScore) {
        this.gScore = gScore;
    }

    public double getfScore() {
        return fScore;
    }

    public void setfScore(double fScore) {
        this.fScore = fScore;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public List<Edge> getAdjacencyList() {
        return adjacencyList;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    public void addNeighbour(Edge edge){
        this.adjacencyList.add(edge);
    }

    Node(String value){
        this.value = value;
        adjacencyList = new ArrayList<>();
    }

    @Override
    public int compareTo(Node o) {
        return Double.compare(this.fScore, o.getfScore());
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
