package iterativedeepeningdepthfirstsearch;

import java.util.Stack;

public class Algorithm {
    private Node targetNode;
    private boolean isTargetFound;

    Algorithm(Node targetNode){
        this.targetNode = targetNode;
    }

    public void runDeepeningSearch(Node startNode){
        int depth = 0;
        while (!isTargetFound){
            System.out.println();
            dfs(startNode, depth);
            depth++;
        }
    }

    private void dfs(Node startNode, int depth){
        Stack<Node> stack = new Stack<>();
        startNode.setDepthLevel(0);
        stack.push(startNode);
        while (!stack.isEmpty()){
            Node actualNode = stack.pop();
            System.out.print(actualNode.getData() + "-");
            if(actualNode.getData().equals(this.targetNode.getData())){
                System.out.println("Target Node has been found");
                this.isTargetFound = true;
                return;
            }
            if(actualNode.getDepthLevel() >= depth){
                continue;
            }
            for(Node node : actualNode.getNeighboursList()){
                node.setDepthLevel(actualNode.getDepthLevel() + 1);
                stack.push(node);
            }
        }
    }
}
