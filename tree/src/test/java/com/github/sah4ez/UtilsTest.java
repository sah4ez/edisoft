package com.github.sah4ez;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sah4ez on 01.04.17.
 */
public class UtilsTest {
    private Node<Integer> root;
    @Before
    public void setUp() throws Exception {
        root = new Node<Integer>(1);
        Node<Integer> child1 = new Node<Integer>(1);
        Node<Integer> child2 = new Node<Integer>(1);
        Node<Integer> child3 = new Node<Integer>(1);
        Node<Integer> child4 = new Node<Integer>(1);
        Node<Integer> child5 = new Node<Integer>(1);
        Node<Integer> child6 = new Node<Integer>(1);
        Node<Integer> child7 = new Node<Integer>(1);


        root.addChild(child1);
        root.addChild(child2);

        child1.addChild(child3);
        child1.addChild(child4);

        child2.addChild(child5);
        child2.addChild(child6);

        child6.addChild(child7);
    }

    @Test
    public void testZeroHeight() throws Exception {
        Node<Integer> empty = new Node<Integer>(0);
        assertEquals(0, Utils.height(empty));
    }

    @Test
    public void testHeight() throws Exception {
        assertEquals(3, Utils.height(root));
    }
}