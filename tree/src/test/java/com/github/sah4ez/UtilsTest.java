package com.github.sah4ez;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sah4ez on 01.04.17.
 */
public class UtilsTest {
    Node<Integer> root = new Node<Integer>(1);
    Node<Integer> child1 = new Node<Integer>(1);
    Node<Integer> child2 = new Node<Integer>(1);
    Node<Integer> child3 = new Node<Integer>(1);
    Node<Integer> child4 = new Node<Integer>(1);
    Node<Integer> child5 = new Node<Integer>(1);
    Node<Integer> child6 = new Node<Integer>(1);
    Node<Integer> child7 = new Node<Integer>(1);

    @Test
    public void testZeroHeight() throws Exception {
        Node<Integer> empty = new Node<Integer>(0);
        assertEquals(0, Utils.height(empty));
    }

    @Test
    public void heightRootWithTwoNodes() throws Exception {
        root.addChild(child1);
        root.addChild(child2);

        child1.addChild(child3);
        child1.addChild(child4);

        child2.addChild(child5);
        child2.addChild(child6);

        child6.addChild(child7);
        assertEquals(3, Utils.height(root));
    }

    @Test
    public void heightRootWithOneNode() throws Exception {
        root.addChild(child1);
        child1.addChild(child2);
        child2.addChild(child3);
        child3.addChild(child4);
        child4.addChild(child5);
        child5.addChild(child6);
        child6.addChild(child7);

        assertEquals(7, Utils.height(root));
    }

    @Test
    public void heightWithSixNodes() throws Exception {
        root.addChild(child1);
        root.addChild(child2);
        root.addChild(child3);
        root.addChild(child4);
        root.addChild(child5);
        root.addChild(child6);
        child6.addChild(child7);

        assertEquals(2, Utils.height(root));
    }
}