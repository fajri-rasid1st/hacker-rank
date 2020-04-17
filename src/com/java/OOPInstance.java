package com.java;

import java.util.*;

class Students {

}

class Rockstar {

}

class Hacker {

}

public class OOPInstance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Object> mylist = new ArrayList<Object>();
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String s = sc.next();

            if (s.equals("Student")) {
                mylist.add(new Students());
            }

            if (s.equals("Rockstar")) {
                mylist.add(new Rockstar());
            }

            if (s.equals("Hacker")) {
                mylist.add(new Hacker());
            }
        }
        System.out.println(count(mylist));
        sc.close();
    }

    static String count(ArrayList<Object> mylist) {

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < mylist.size(); i++) {

            Object element = mylist.get(i);

            if (element instanceof Students) {
                a++;
            }

            if (element instanceof Rockstar) {
                b++;
            }

            if (element instanceof Hacker) {
                c++;
            }
        }
        String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
        return ret;
    }
}