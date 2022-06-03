/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ayudantias3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Mail {
    private int identificador;
    private String correoORG;
    private String correoDES;
    private String titulo;
    private String mensaje;

    public Mail(int identificador, String correoORG, String correoDES, String titulo, String Mensaje) {
        this.identificador = identificador;
        this.correoORG = correoORG;
        this.correoDES = correoDES;
        this.titulo = titulo;
        this.mensaje = Mensaje;
    }

    public String getCorreoORG() {
        return correoORG;
    }

    public void setCorreoORG(String correoORG) {
        this.correoORG = correoORG;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCorreoDES() {
        return correoDES;
    }

    public void setCorreoDES(String correoDES) {
        this.correoDES = correoDES;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.mensaje = Mensaje;
    }

    @Override
    public String toString() {
        return "<from:"+correoORG+", to:"+correoDES+", tittle:"+titulo+", message:"+mensaje+">";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mail other = (Mail) obj;
        return this.identificador == other.identificador;
    }
    
    
    public static Mail nextMail(Scanner sc){
        System.out.println("Ingrese el codigo del correo");
        int identificador = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el correo de origen");
        String correo1 = sc.nextLine();
        System.out.println("Ingrese el correo de destino");
        String correo2 = sc.nextLine();
        System.out.println("Ingrese el titulo del correo");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el mensaje del correo");
        String mensaje = sc.nextLine();
        
        Mail ma1 = new Mail(identificador,correo1,correo2,titulo,mensaje);
        return ma1;
        
    }
    
    
    
 
    
    
    
}
