package com.github.sah4ez;

import java.util.*;

public class UtilsList {

    public static List<Integer> removeWithOrder(List<Integer> list) {

        List<Integer> copied = null;
        if (list instanceof ArrayList){
            copied = new ArrayList<Integer>(list.size());
        }
        if (list instanceof LinkedList){
            copied = new LinkedList<Integer>();
        }

        if (copied == null) return Collections.emptyList();

        Integer current = list.get(0);
        Integer count = 0;
        Integer position = 0;
        Integer positionWrite = 0;

        for (Integer i : list){
            if (current == i){
                count++;
            }else {
                copied = trim(count, copied);
                current = i;
                count = 1;
            }

            copied.add(i);
        }
        copied = trim(count, copied);

        return copied;
    }

    private static List<Integer> trim(Integer count,List<Integer> list){
        if (count >= 3){
            list = list.subList(0, list.size() - count);
        }
        return list;
    }
}
