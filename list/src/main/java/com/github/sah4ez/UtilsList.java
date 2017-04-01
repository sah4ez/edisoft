package com.github.sah4ez;

import java.util.*;

public class UtilsList {

    public static List<Integer> removeSequence(List<Integer> list) {
        List<Integer> copied = null;
        if (list instanceof ArrayList) {
            copied = new ArrayList<Integer>(list.size());
        }
        if (list instanceof LinkedList) {
            copied = new LinkedList<Integer>();
        }

        if (copied == null) return Collections.emptyList();

        Integer current = list.get(0);
        Integer count = 0;

        for (Integer i : list) {
            if (current == i) {
                count++;
            } else {
                copied = trim(count, copied);
                current = i;
                count = 1;
            }

            copied.add(i);
        }
        copied = trim(count, copied);

        if (copied instanceof ArrayList) {
            ((ArrayList) copied).trimToSize();
        }

        list.clear();

        return copied;
    }

    private static List<Integer> trim(Integer count, List<Integer> list) {
        if (count >= 3) {
            list = list.subList(0, list.size() - count);
        }
        return list;
    }

    public static List<Integer> removeDuplicate(List<Integer> list) {
        int countDuplicate = 3;
        HashMap<Integer, Integer> countNumbers = new HashMap<Integer, Integer>();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();

            Integer count = countNumbers.get(i);
            if (count != null && count == countDuplicate){
                iterator.remove();
            }else {
                countNumbers.put(i, count == null ? 0 : ++count);
            }
        }

        iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if (countNumbers.get(i) == countDuplicate){
                iterator.remove();
            }
        }
        countNumbers.clear();

        return list;
    }
}
