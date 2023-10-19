/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.epe2_jasna_ramirez;

import java.util.Scanner;

/**
 *
 * @author Prueba jasna
 */
public class EPE2_JASNA_RAMIREZ {

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Ingrese el nombre del cliente: ");
       String Nombre= scanner.nextLine();
       
       System.out.println("Ingrese los apellidos del cliente: ");
       String Apellido= scanner.nextLine();
       
       System.out.println("Ingrese la edad del cliente : ");
       String Edad= scanner.nextLine();
       
       System.out.println("Ingrese el Rut de los clientes : ");
       String Rut= scanner.nextLine();
       
       System.out.println("Ingrese el nombre de la empresa: ");
       String Empresa= scanner.nextLine();
       
       System.out.println("Ingrese el Rut de la empresa: ");
       String RutE= scanner.nextLine();
       
       System.out.println("Ingrese el Total de las Ventas: ");
       String Total= scanner.nextLine();
       
       
       
       DATOS_FACTURA Factura= new DATOS_FACTURA ();
       
       Factura.guardarDatosFactura(Nombre, Apellido, Edad, Rut, Empresa, RutE, Total);
      
       System.out.println("\nLos Datos del Cliente:");
       System.out.println("Nombre: " + Factura.Nombre_Cliente);
       System.out.println("Apellidos: " + Factura.Apellidos_Cliente);
       System.out.println("Edad: " + Factura.Edad_Cliente);
       System.out.println("Rut del Cliente: " + Factura.Rut_Cliente);
       System.out.println("Nombre de la Empresa: " + Factura.Nombre_Empresa);
       System.out.println("Rut de la Empresa: " + Factura.Rut_Empresa);
       System.out.println("Total de Ventas: " + Factura.Total_Ventas);
       
         
    VENTAS ventas = new VENTAS();
    ventas.mostrarmontos();
    ventas.calcularTotalVentas();
    
    
    
    
    
       
         
    }
}