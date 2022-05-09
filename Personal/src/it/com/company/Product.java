package it.com.company;

public class Product {

    private Integer id_prodotto;
    private String nome;
    private Double prezzo;
    private Integer quantita;

    public Product(String nome, Double prezzo, Integer quantita) {
        //this.id_prodotto = id_prodotto;
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public Product(Integer id, String nome, Double prezzo, Integer quantita) {
        this.id_prodotto = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public Integer getId_prodotto() {
        return id_prodotto;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        String print = "";
        for (Product obj : GestioneProdotto.listaProdotto) {

            print += "\n------ Prodotto -------"
                    + "\nID=" + obj.id_prodotto
                    + "\nnome=" + obj.nome
                    + "\nprezzo=" + obj.prezzo
                    + "\nQuantità=" + obj.quantita;
        }
        return print;
    }

    String getCSV() {
        return 
                id_prodotto + ";" + 
                nome + ";" + 
                prezzo + ";" + 
                quantita + "\n";
    }

}
