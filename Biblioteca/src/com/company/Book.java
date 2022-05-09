package com.company;

import java.time.LocalDate;
import java.util.Objects;

public class Book {

    private String titolo;
    private boolean loan;
    private LocalDate date;

    public Book(String titolo, boolean loan) {
        this.titolo = titolo;
        this.loan = false;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public boolean isLoan() {
        return loan;
    }

    public void setLoan(boolean loan) {
        this.loan = loan;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.titolo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.titolo, other.titolo)) {
            return false;
        }
        return true;
    }

}
