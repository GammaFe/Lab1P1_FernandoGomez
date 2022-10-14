/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1_fernandogomez;

import java.util.Scanner;

public class Lab1_FernandoGomez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        
        System.out.println("--Bienveno al sistema de calculo de promedio --");
        System.out.print ( "Ingrese su nombre: ");
        String nombre = entrada.nextLine();
    
        System.out.print( "ingrese la nota final de la primera clase: ");
        double primeraClase = entrada.nextDouble();
        
        System.out.print( "ingrese la nota final de la segunda clase: ");
        double segundaClase = entrada.nextDouble();
        
        System.out.print( "ingrese la nota final de la tercera clase: ");
        double terceraClase = entrada.nextDouble();
        
        System.out.print( "ingrese la nota final de la cuarta clase: ");
        double cuartaClase = entrada.nextDouble();
        
        // Se hace e caluculo del promedio
        double sumaClase = primeraClase + terceraClase + segundaClase + cuartaClase;
        double promedio = sumaClase / 4;
        
        System.out.println("----- " + nombre + " el promedio de las cuatro clases es: " + promedio);
    }
    
}
