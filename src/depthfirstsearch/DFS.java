package depthfirstsearch;

import java.util.Stack;

public class DFS {

    private Stack<Vertex> stack;

    DFS(){
        this.stack = new Stack<>();
    }

    public void dfs(Vertex root){
        stack.add(root);
        root.setVisited(true);
        while(!stack.isEmpty()){
            Vertex actualVertex = stack.pop();
            System.out.print(actualVertex.getData() + "-");
            for(Vertex v : actualVertex.getNeighboursList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    v.setPredecessor(actualVertex);
                    stack.push(v);
                }
            }
        }
    }

}
