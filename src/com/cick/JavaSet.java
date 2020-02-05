package com.cick;

import java.util.*;

public class JavaSet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String [t];
        String[] pair_right = new String [t];

        for (int i = 0 ; i < t ; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> number = new HashSet<>();
        String[] name = new String [t];

        for (int i = 0 ; i < t ; i++) {
            name[i] = pair_left[i] + " " + pair_right[i];
            number.add(name[i]);
            System.out.println(number.size());
        }
        
        s.close();
    }
}