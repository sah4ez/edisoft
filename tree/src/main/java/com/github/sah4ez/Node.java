package com.github.sah4ez;

import java.util.*;

public class Node<T> implements Iterable<Node<T>>
{
    private Node<T> parent = null;
    private T data = null;
    private Set<Node<T>> children;

    public Node(T data) {
        this.data = data;
        children = new HashSet<Node<T>>();
    }

    public boolean hasChildren(){
        return !children.isEmpty();
    }

    public int countChildren() {
        return children.size();
    }

    public Set<Node<T>> getChildren() {
        return children;
    }

    public boolean addChild(Node<T> child){
        return children.add(child);
    }

    public boolean removeChildren(Node<T> node){
        return children.remove(node);
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    @Override
    public Iterator<Node<T>> iterator() {
        return children.iterator();
    }
}
