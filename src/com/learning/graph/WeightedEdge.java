package com.learning.graph;

public class WeightedEdge {
    Node node1;
    Node node2;
    Integer distance;

    public WeightedEdge(Node node1, Node node2, Integer distance) {
        this.node1 = node1;
        this.node2 = node2;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "WeightedEdge{" +
                "node1='" + node1 + '\'' +
                ", node2='" + node2 + '\'' +
                ", distance=" + distance +
                '}';
    }
}