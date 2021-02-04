package com.company;



public class SearchArray {


    public int searchArrayForString(String[] arr, String sd) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(sd)) {
                return i;
            }
        }
        return -1;

    }
}

