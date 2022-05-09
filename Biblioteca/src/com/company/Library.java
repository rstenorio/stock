package com.company;

import java.util.Comparator;

public class Library {


public void printLoan(Book b){
    Comparator<Book> compDate = (b1,b2) -> b1.getDate().compareTo(b2.getDate());
    
}

    
}
