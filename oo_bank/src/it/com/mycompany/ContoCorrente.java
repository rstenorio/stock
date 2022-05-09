package it.com.mycompany;

/**
 *
 * @author tss
 */
public class ContoCorrente {
    private String intestatario; //correntista
    private int saldo;

    public ContoCorrente(String intestatario) {
        if (intestatario == null || intestatario.isBlank()) {
            throw new IllegalArgumentException("ERRORE - Interstatario vuoto");
        }
        this.intestatario = intestatario;
    }
    
    public ContoCorrente(String intestatario, int saldo) {
        this.intestatario = intestatario;
        this.saldo = saldo;
    }

    public void deposito(int somma){
        this.saldo += somma;
    }

    public void prelievo(int somma){
        if (somma <= 0)
            throw  new IllegalArgumentException("Somma uguale o minore di 0");

        if (somma > this.saldo)
            throw  new IllegalArgumentException("Somma no disponibili");
        
        this.saldo -= somma;
    }


    public void setIntestatario(String intestatario) {
        this.intestatario = intestatario;
    }

    public String getIntestatario() {
        return intestatario;
    }

    public int getSaldo() {
        return saldo;
    }

    
    
}
