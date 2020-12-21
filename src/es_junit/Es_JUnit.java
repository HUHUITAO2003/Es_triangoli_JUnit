/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_junit;

/**
 *
 * @author juliet
 */
public class Es_JUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangolo t1= new Triangolo(4.0,5.0,3.0);
        System.out.println(t1.tipologia());
        System.out.println(t1.area());
        System.out.println(t1.perimetro());
    }
    
}
