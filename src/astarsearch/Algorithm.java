package astarsearch;

import java.util.*;

public class Algorithm {

    private Set<Node> exploredNodes = new HashSet<>();

    void aStarSearch(Node sourceNode, Node goalNode){
        PriorityQueue<Node> unexploredNodes = new PriorityQueue<>();
        sourceNode.setgScore(0);
        unexploredNodes.add(sourceNode);
        boolean isFound = false;
        while(!unexploredNodes.isEmpty() && !isFound){
            Node currentNode = unexploredNodes.poll();
            exploredNodes.add(currentNode);
            if(currentNode.getValue().equals(goalNode.getValue())){
                isFound = true;
            }
            for(Edge e : currentNode.getAdjacencyList()){
                Node childNode = e.getTargetNode();
                double cost = e.getCost();
                double tempGScore = currentNode.getfScore() + cost;
                double tempFScore = tempGScore + heuristic(childNode, goalNode);
                if(exploredNodes.contains(childNode) && (tempFScore >= childNode.getfScore())){
                    continue;
                }
                else if(!unexploredNodes.contains(childNode) || tempFScore < childNode.getfScore()){
                    childNode.setParentNode(currentNode);
                    childNode.setgScore(tempGScore);
                    childNode.setfScore(tempFScore);
                    if(unexploredNodes.contains(childNode)){
                        unexploredNodes.remove(childNode);
                    }
                    unexploredNodes.add(childNode);
                }
            }
        }
    }

    private double heuristic(Node node1, Node node2) {
        return Math.abs(node1.getX()-node2.getX()) + Math.abs(node1.getY()-node2.getY());
    }

    List<Node> printPath(Node target){
        List<Node> pathList = new ArrayList<>();
        for(Node node = target; node != null; node = node.getParentNode()){
            pathList.add(node);
        }
        Collections.reverse(pathList);
        return pathList;
    }

}
