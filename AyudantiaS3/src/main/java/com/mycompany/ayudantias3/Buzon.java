/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayudantias3;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Buzon {
    private ArrayList<Mail> lista;
    private String nombre;

    public Buzon() {
        lista = new ArrayList<>();
        nombre = "Buzon :D";
    }

    public ArrayList<Mail> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Mail> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        String resultado = "[";
        int contador = 1;
        for(Mail m1: lista){
            resultado = resultado+ "Mail " +contador+": "+ m1.toString()+"\n";
            contador++;
        }
        resultado = resultado+ "]";
        
        return resultado;
        
        
    }
    
    public void addMail(Mail m1){
        lista.add(m1);
    }
    
    
    public Buzon filtrarOrigen(String nombre){
        Buzon buz = new Buzon();
        for(Mail m1: lista){
            if(m1.getCorreoORG().equals(nombre)){
                buz.addMail(m1);
            }
        }
        return buz;
     
    }
    
    
    public Buzon filtrarDestino(String nombre){
        Buzon buz = new Buzon();
        for(Mail m1: lista){
            if(m1.getCorreoDES().equals(nombre)){
                buz.addMail(m1);
            }
        }
        return buz;
     
    }   
    
    
    
}
