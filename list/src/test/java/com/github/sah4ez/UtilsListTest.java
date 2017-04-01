package com.github.sah4ez;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UtilsListTest
{
    private List<Integer> list = new ArrayList<Integer>();

    @Test
    public void removedThreeNumberWithOrder() throws Exception {
        list.add(1);
        list.add(1);
        list.add(1);

        assertEquals(3, list.size());

        list = UtilsList.removeWithOrder(list);
        assertEquals(0, list.size());
    }

    @Test
    public void threeTheSameAndLastOther() throws Exception {
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);


        list = UtilsList.removeWithOrder(list);
        assertEquals(1, list.size());
    }

    @Test
    public void firstOneAndThreeTheSameLast() throws Exception {
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);


        list = UtilsList.removeWithOrder(list);
        assertEquals(1, list.size());
    }

    @Test
    public void threeTheSameWithOneBetween() throws Exception {
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);


        list = UtilsList.removeWithOrder(list);
        assertEquals(4, list.size());
    }

    @Test
    public void twoGroupForRemoval() throws Exception {
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(5);


        list = UtilsList.removeWithOrder(list);
        assertEquals(4, list.size());
    }

}
