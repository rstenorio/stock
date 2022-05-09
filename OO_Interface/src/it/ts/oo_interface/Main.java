/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.ts.oo_interface;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tipo statico
        A a = new A();
        a.m1();
        
        
        B b = new B();
        b.m1();
        b.m2();
        b.m3();
        
        A aa = new B();//SI
        //B aa = new A();//NO
        
        
        ((B)aa).m3();//casting
        
        if(a instanceof B)
            System.out.println("contiene tipo B");
        else
            System.out.println("NON contiene tipo B");
        
        
        A c = new C();
        c.m2();
        
        A aaa = new A();
        aaa.m2();


    }
    
}
