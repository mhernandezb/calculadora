/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import mundo.Modelo;

/**
 *
 * @author laboratorio
 */
public class Controlador {
    Modelo modelo;

    public Controlador(){
        modelo = new Modelo();
    }

    public String requerimientos(int opcion, double numero1, double numero2){
        String Salida="";
        double resp=0;
        if(opcion ==1){
            resp=modelo.sumar(numero1, numero2);
        }
        if(opcion ==2){
            resp=modelo.restar(numero1, numero2);
        }
        if(opcion ==3){
            resp=modelo.multiplicar(numero1, numero2);
        }
        if(opcion ==4){
            resp=modelo.dividir(numero1, numero2);
        }
        Salida = ""+resp;
        return Salida;
    }
}
