package com.company;

import java.util.ArrayList;
import java.util.Locale;
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
        LawnMower lawnMower = new LawnMower();
        double grassLength = scan.nextDouble();
        double shouldBeCutAt = scan.nextDouble();
        System.out.println("Days to cut " + lawnMower.whenToMowTheLawn(grassLength, shouldBeCutAt));

        //Opg 5.
        SentenceConverter.printProblemDescription();
        System.out.println(SentenceConverter.convertSentence("This IS a test"));

        //Opg 7.
        String[] words = new String[3];
        words[0] = "hej";
        words[1] = "med";
        words[2] = "dig";

        SearchArray searchArray = new SearchArray();
        System.out.println(searchArray.searchArrayForString(words, "med"));
        System.out.println(searchArray.searchArrayForString(words, "elefant"));










    }
}
