package com.github.sah4ez;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class NodeTest {

    private Node<Integer> node;

    @Before
    public void setUp() throws Exception {
        node = new Node<Integer>(1);
    }

    @Test
    public void initNode() throws Exception {
        assertNull(node.getParent());
        assertFalse(node.hasChildren());
    }

    @Test
    public void nodeHasChildAndParent() throws Exception {
        Node<Integer> parent = new Node<Integer>(1);
        Node<Integer> child1 = new Node<Integer>(1);
        Node<Integer> child2 = new Node<Integer>(1);

        node.setParent(parent);
        node.addChild(child1);
        node.addChild(child2);

        assertNotNull(node.getParent());
        assertEquals(2, node.countChildren());
    }
}
