package com.company;



public class SearchArray {


    public int searchArrayForString(String[] arr, String sd) {
        if (arr.length == 0) {
            return -1;

        } else {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(sd)) {
                    return i;
                } else {
                    return -1;
                }
            }
        }
    }
}

