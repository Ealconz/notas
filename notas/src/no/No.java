/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no;

import java.util.Scanner;

/**
 *
 * @author elias
 */
public class No {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca la nota: ");
        int nota;
        nota = sc.nextInt();
        if(nota<= 5){
            System.out.println("El alumno está suspenso");
        }else if(nota>=5 && nota<6){
            System.out.println("El alumno está aprobado");
        }else if(nota>=6 && nota<7){
            System.out.println("El alumno tiene un bien");
        }else if(nota>=7 && nota<8){
            System.out.println("El alumno tiene un notable");
        }else if(nota>=9 && nota<11){
            System.out.println("El alumno tiene un sobresaliente");
        }else if (nota<0 || nota >11){
            System.out.println("La nota introducida no es valida");
        }
    }
    
}
