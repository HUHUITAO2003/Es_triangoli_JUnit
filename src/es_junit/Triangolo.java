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
public class Triangolo {
    private double a;
    private double b;
    private double c;

    public Triangolo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public String tipologia(){
        String tipo;
        double ipo=0.0, obl1=0.0, obl2=0.0;
        if(a==b || b==c){
            if(a==b && b==c){
                tipo="equilatero";
            }else{
                tipo="isoscele";
            }
        }else{
        tipo="scaleno";
        }
        
        if(a>b && a>c){
            ipo=a;
            obl1=b;
            obl2=c;
        }
        if(b>a && b>c){
            ipo=b;
            obl1=c;
            obl2=a;
        }
        if(c>b && c>a){
            ipo=c;
            obl1=b;
            obl2=a;
        }
        if((ipo*ipo)==(obl1*obl1+obl2*obl2)){
            tipo=tipo+", rettangolo";
        }
        return tipo;
    }
    
    public double perimetro(){
        return a+b+c;
    }
    
    public double area(){
        double s=(a+b+c)/2;
        return Math.sqrt(s*((s-a)*(s-b)*(s-c)));
    }
}
