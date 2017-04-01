package com.github.sah4ez;

import java.util.Iterator;

/**
 * Created by sah4ez on 01.04.17.
 */
public class Utils {
    public static int height(Node root){
        int height = 0;
        if (root.hasChildren()){
            Iterator iterator = root.iterator();
            while (iterator.hasNext()){
                Node child = (Node) iterator.next();
                int cur = height(child);
                height = height > cur ? height : ++cur;
            }
        }
        return height;
    }
}
