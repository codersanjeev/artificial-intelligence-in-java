package depthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int data;
    private boolean visited;
    private List<Vertex> neighboursList;
    private Vertex predecessor;

    public Vertex(int data){
        this.data = data;
        this.neighboursList = new ArrayList<>();
    }

    public void addNeighbour(Vertex vertex){
        this.neighboursList.add(vertex);
    }

    public int getData() {
        return data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighboursList() {
        return neighboursList;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }
}
