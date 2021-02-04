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
/*
        //Opg 3.

        LawnMower lawnMower = new LawnMower();
        System.out.println("Enter the length of your grass currently");
        double currentGrassLength = scan.nextDouble();
        System.out.println("How tall can the grass be before it needs to be cut?");
        double grassCutLength = scan.nextDouble();
        System.out.println("Days until it needs to be cut " + lawnMower.whenToMowTheLawn(currentGrassLength, grassCutLength) );
*/

        //Opg 4.

        SquareStars squareStars = new SquareStars();
        squareStars.theStarSquare();

        //Opg 7.
        String[] arr = new String[5];
        String sd = "";

        SearchArray searchArray = new SearchArray();
        searchArray.searchArrayForString(arr, sd);










    }
}
