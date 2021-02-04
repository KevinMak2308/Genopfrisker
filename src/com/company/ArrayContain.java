package com.company;

import java.util.ArrayList;

public class ArrayContain {


    public boolean containArrayString(ArrayList<String> a, String s) {
        if (a.contains(s)) {
            System.out.println("The String has been found");
            return true;

        } else {
            return false;

        }

    }
}



