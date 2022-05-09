package it.com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Room {

    List<Reservation> list = new ArrayList<>();

    public Reservation reserve(String nome, LocalDate dtInizio, LocalDate dtFine) {
        Reservation r = new Reservation(nome, dtInizio, dtFine);
        if (isOccupata(r)) {
            throw new IllegalArgumentException("Periodo occuppato");
        }
        list.add(r);
        return r;

    }

    public List<Reservation> reservations() {
        Comparator<Reservation> comp = (r1, r2) -> r1.getDtInizio().compareTo(r2.getDtInizio());
        return list.stream().sorted(comp).collect(Collectors.toList());
    }
    
    private boolean isOccupata(Reservation nuova) {

        Predicate<Reservation> inizioNonValido = (r)
                -> !nuova.getDtInizio().isBefore(r.getDtInizio()) && !nuova.getDtInizio().isAfter(r.getDtFine());

        Predicate<Reservation> fineNonValido = (r)
                -> !nuova.getDtFine().isBefore(r.getDtInizio()) && !nuova.getDtFine().isAfter(r.getDtFine());

        Predicate<Reservation> tuttoNonValido = (r)
                -> nuova.getDtFine().isBefore(r.getDtInizio()) && nuova.getDtFine().isAfter(r.getDtFine());
        
        return list.stream().anyMatch(inizioNonValido.or(fineNonValido).or(tuttoNonValido));

    }

}

