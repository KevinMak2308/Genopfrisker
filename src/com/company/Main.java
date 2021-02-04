package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Opg 1.

        ArrayContain array = new ArrayContain();

        ArrayList<String> a = new ArrayList<>();
        String s = "";

        System.out.println(array.containArrayString(a,s));

        a.add(s);

        System.out.println(array.containArrayString(a,s));

        //Opg 2.

        Library bookIsbnNumber = new Library();


        System.out.println(bookIsbnNumber.viewBookList(bookIsbnNumber.scifi));

        //Opg 3.










    }
}
