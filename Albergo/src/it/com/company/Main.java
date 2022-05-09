package it.com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Room r = new Room();
        r.reserve("Rodrigo", LocalDate.of(2022, Month.MARCH, 15), LocalDate.of(2022, Month.MARCH, 30));
        r.reserve("Liam", LocalDate.of(2022, Month.MARCH, 10), LocalDate.of(2022, Month.MARCH, 13));
        r.reserve("Thais", LocalDate.of(2022, Month.MARCH, 9), LocalDate.of(2022, Month.MARCH, 21));
        
        r.reservations().forEach((v) -> System.out.println(v));
        
        
    }
    
}
