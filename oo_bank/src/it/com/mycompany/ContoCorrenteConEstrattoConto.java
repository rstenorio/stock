/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.com.mycompany;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class ContoCorrenteConEstrattoConto extends ContoCorrente{
    private ArrayList<Integer> movimenti = new ArrayList<>();

    public ContoCorrenteConEstrattoConto(String intestatario) {
        super(intestatario);
    }

    public ArrayList<Integer> getMovimenti() {
        return new ArrayList(this.movimenti);
    }

    @Override
    public void deposito(int somma) {
        super.deposito(somma); //To change body of generated methods, choose Tools | Templates.
        movimenti.add(somma);
    }

    @Override
    public void prelievo(int somma) {
        super.prelievo(somma); //To change body of generated methods, choose Tools | Templates.
        movimenti.add(-somma);
    }
    
    
}
