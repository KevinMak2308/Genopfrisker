package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*
        //Opg 1.

        ArrayContain array = new ArrayContain();

        ArrayList<String> a = new ArrayList<>();
        String s = "";

        System.out.println(array.containArrayString(a,s));

        a.add(s);

        System.out.println(array.containArrayString(a,s));

        //Opg 2.

        Library bookIsbnNumber = new Library();


        System.out.println(bookIsbnNumber.viewBookList(bookIsbnNumber.scifi));*/

        //Opg 3.
        LawnMower lawnMower = new LawnMower();
        double grassLength = scan.nextDouble();
        double shouldBeCutAt = scan.nextDouble();
        System.out.println("Days to cut " + lawnMower.whenToMowTheLawn(grassLength, shouldBeCutAt));









    }
}
