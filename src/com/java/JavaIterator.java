package com.java;

import java.util.*;

class Example {
    public static void main(String[] args) {

        ArrayList<String> mylist = new ArrayList<String>();

        mylist.add("Hello");
        mylist.add("Java");
        mylist.add("4");

        Iterator<?> it = mylist.iterator();

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}