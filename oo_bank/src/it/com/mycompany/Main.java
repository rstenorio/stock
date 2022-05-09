package it.com.mycompany;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoCorrenteConEstrattoConto c = new ContoCorrenteConEstrattoConto("Rodrigo");
        c.deposito(100);
        c.prelievo(50);

        System.out.println("Interstatario: " + c.getIntestatario() + "\nSaldo: " + c.getSaldo());

        //System.out.println(c.getMovimenti());

    }

}
