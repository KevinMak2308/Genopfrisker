package com.company;

import java.util.ArrayList;

public class Library {
    Book horror = new Book(976965627, "Terror from the Deep", 1974);
    Book fantasy = new Book(976955587, "Lord of the Rings", 1946);
    Book scifi = new Book(976965687, "Star Wars", 1976);


    public boolean viewBookList(Book book) {
        if(scifi.getIsbnNumber() == fantasy.getIsbnNumber() || scifi.getIsbnNumber() == horror.getIsbnNumber()) {
            return true;
        } else  {
            return false;
        }

    }
}
