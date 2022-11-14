package com.learning.graph;

public class Node {
    String val;
    private boolean isVisited;

    public Node(String val) {
        this.val = val;
        this.isVisited = false;
    }

    public void markVisited() {
        this.isVisited = true;
    }

    public boolean isVisited() {
        return this.isVisited;
    }

    @Override
    public boolean equals(Object obj) {
        Node anotherNode = (Node) obj;
        return this.val.equals(anotherNode.val);
    }

    @Override
    public String toString() {
        return "Node{" +
                "val='" + val + '\'' +
                ", isVisited=" + isVisited +
                '}';
    }
}
