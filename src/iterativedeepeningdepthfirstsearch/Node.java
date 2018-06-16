package iterativedeepeningdepthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String data;
    private int depthLevel = 0;
    private List<Node> neighboursList;

    Node(String data){
        this.data = data;
        neighboursList = new ArrayList<>();
    }

    public void addNeighbour(Node node){
        this.neighboursList.add(node);
    }

    public String getData() {
        return data;
    }

    public int getDepthLevel() {
        return depthLevel;
    }

    public void setDepthLevel(int depthLevel) {
        this.depthLevel = depthLevel;
    }

    public List<Node> getNeighboursList() {
        return neighboursList;
    }

}
