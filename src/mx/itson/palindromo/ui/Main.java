/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.palindromo.ui;

import java.util.Scanner;

/**
 *
 * @author Sharon Deolarte
 */
public class Main {
    
    public static void main(String [] args){
    
    System.out.println("Escriba la oracion a evaluar");
    
    Scanner entrada = new Scanner (System.in);
    String oracion = entrada.nextLine();
    
    //Evalua lo que el usuario introduce y limpia la cadena.
    
    oracion = oracion.trim().toLowerCase();
    oracion = oracion.replaceAll("[¡! ().,:;/*]","");
    oracion = oracion.replace("á","a");
    oracion = oracion.replace("é", "e");
    oracion = oracion.replace("í", "i");
    oracion = oracion.replace("ó", "o");
    oracion = oracion.replace("ú", "u");
    
 
   //Invertir cadena
         
            String invertir = "";
   
                for (int indice = oracion.length() - 1; indice >= 0; indice --){
                invertir += oracion.charAt(indice);
       
   }
            //Compara si la oracion si es palindromo o no.

                    if (invertir.equals(oracion)){
                        
                        System.out.println("La oracion es palindromo");
                        
                    } else {
                        
                        System.out.println("No es palindromo");
                        
                    }
}   
}
