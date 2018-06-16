package breadthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int data;
    private boolean visited;
    private List<Vertex> neighboursList;

    public Vertex(int data){
        this.data = data;
        this.neighboursList = new ArrayList<>();
    }

    public void addNeighbour(Vertex v){
        this.neighboursList.add(v);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
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
}
