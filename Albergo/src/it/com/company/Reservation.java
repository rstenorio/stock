package it.com.company;

import java.time.LocalDate;

public class Reservation {
    
    private String nome;
    private LocalDate dtInizio;
    private LocalDate dtFine;

    public Reservation(String nome, LocalDate dtInizio, LocalDate dtFine) {
        this.nome = nome;
        this.dtInizio = dtInizio;
        this.dtFine = dtFine;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDtInizio() {
        return dtInizio;
    }

    public LocalDate getDtFine() {
        return dtFine;
    }

    @Override
    public String toString() {
        return "Reservation{" + "nome=" + nome + ", dtInizio=" + dtInizio + ", dtFine=" + dtFine + '}';
    }
    
}

