/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Random;

public class monomio {
     int coeficiente;
     int exponente;
    public monomio(){
        Random r = new Random();
        coeficiente=r.nextInt(10);
        exponente=r.nextInt(7);
    }
    public monomio(int c,int ex){
        coeficiente=c;
        exponente=ex;
    }
    public monomio(int ex){
        Random r = new Random();
        do{
            coeficiente=r.nextInt(10);
        }while(coeficiente<0);
        exponente=ex;
    }
    public static monomio multiplicar(monomio a, monomio b){
        monomio aux= new monomio();
        aux.coeficiente=a.coeficiente*b.coeficiente;
        aux.exponente=a.exponente+b.exponente;
        return aux;
    }
    
}
