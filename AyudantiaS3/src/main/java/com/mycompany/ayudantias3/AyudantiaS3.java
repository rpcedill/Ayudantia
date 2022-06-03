/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ayudantias3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AyudantiaS3 {

    public static void main(String[] args) {
//        Mail m1 = new Mail(1,"Correo1","correo2","ejemplo","esto es un ejemplo");
//        Mail m2 = new Mail(2,"aaaaaa","bbbbbb","ejemplo","esto es un ejemplo");
//        Mail m3 = new Mail(3,"CorreodeMario@gmail.com","bbbbbb","ejemplo","esto es un ejemplo");
//        m1.setCorreoORG("CorreodeMario@gmail.com");
//        
//        
//        
//        Buzon b1 = new Buzon();
//        b1.addMail(m1);
//        b1.addMail(m2);
//        b1.addMail(m3);
//        
//        System.out.println(b1);
//        System.out.println(b1.filtrarOrigen("CorreodeMario@gmail.com"));
//        System.out.println(b1.filtrarDestino("bbbbbb"));
        ArrayList<String> lista = new ArrayList<>();
        lista.add("valor1");
        lista.add("valor2");
        
        
        System.out.println(lista);
        System.out.println(lista.get(1));
        ArrayList<String> listaa = (ArrayList<String>)lista.clone();
        lista.contains("valor1");
        
        
        
    }
}
