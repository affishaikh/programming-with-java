package com.learning.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    List<WeightedEdge> weightedEdges = new ArrayList<>();

    Graph add(WeightedEdge weightedEdge) {
        this.weightedEdges.add(weightedEdge);
        return this;
    }

    private ArrayList<Node> dfs(Node node) {
        ArrayList<Node> visitedNodes = new ArrayList();
        node.markVisited();
        visitedNodes.add(node);
        List<Node> adjacentNodes = getNonVisitedAdjacentOf(node);
        for (Node adjacentNode : adjacentNodes) {
            if (!adjacentNode.isVisited()) {
                visitedNodes.addAll(dfs(adjacentNode));
            }
        }
        return visitedNodes;
    }

    public ArrayList<Node> dfs() {
        return this.dfs(this.weightedEdges.get(0).node1);
    }

    private ArrayList<Node> bfs(Node node) {
        LinkedList nodesToBeExplored = new LinkedList<Node>();
        ArrayList<Node> exploredNodes = new ArrayList();
        node.markVisited();
        nodesToBeExplored.add(node);
        while (!nodesToBeExplored.isEmpty()) {
            Node firstNodeInQueue = (Node) nodesToBeExplored.peek();
            List<Node> adjacentNodes = getNonVisitedAdjacentOf(firstNodeInQueue);
            for (Node adjacentNode : adjacentNodes) {
                adjacentNode.markVisited();
                nodesToBeExplored.add(adjacentNode);
            }
            exploredNodes.add(firstNodeInQueue);
            nodesToBeExplored.remove();
        }
        return exploredNodes;
    }

    public ArrayList<Node> bfs() {
        return this.bfs(this.weightedEdges.get(0).node1);
    }

    private List<Node> getNonVisitedAdjacentOf(Node node) {
        ArrayList<Node> adjacentNodes = new ArrayList();

        for (WeightedEdge weightedEdge : this.weightedEdges) {
            if (weightedEdge.node1.equals(node) && !weightedEdge.node2.isVisited()) {
                adjacentNodes.add(weightedEdge.node2);
            }
            if (weightedEdge.node2.equals(node) && !weightedEdge.node1.isVisited()) {
                adjacentNodes.add(weightedEdge.node1);
            }
        }

        return adjacentNodes;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "weightedEdges=" + weightedEdges +
                '}';
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");
        Node node6 = new Node("6");
        Node node7 = new Node("7");
        Node node8 = new Node("8");
        Node node9 = new Node("9");
        Node node10 = new Node("10");
        graph.add(new WeightedEdge(node1, node4, 0))
                .add(new WeightedEdge(node1, node2, 0))
                .add(new WeightedEdge(node4, node3, 0))
                .add(new WeightedEdge(node2, node3, 0))
                .add(new WeightedEdge(node2, node5, 0))
                .add(new WeightedEdge(node2, node7, 0))
                .add(new WeightedEdge(node2, node8, 0))
                .add(new WeightedEdge(node5, node8, 0))
                .add(new WeightedEdge(node5, node7, 0))
                .add(new WeightedEdge(node5, node6, 0))
                .add(new WeightedEdge(node7, node8, 0))
                .add(new WeightedEdge(node3, node10, 0))
                .add(new WeightedEdge(node3, node9, 0));

        System.out.println(graph.dfs());
        System.out.println(graph.bfs());
    }
}

/***
 * (A, C, 2), (A, E, 15), (B, C, 4), (B, D, 2), (B, E, 3), (D, E, 1)
 *
 * 1. Keep the node in stack, when you are going for exploring other nodes
 * 2. Create a class called, so that we can know if the node was visited
 * 3. When you visit a node, mark it as visited and move on to it's next adjacent node
 */
