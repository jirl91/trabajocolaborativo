/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.epe2_jasna_ramirez;
import java.util.Scanner;

/**
 *
 * @author Prueba jasna
 A) CREAR UNA APLICACIÓN EN JAVA CUYO NOMBRE DEBE SER “EPE2_NOMBRE_APELLIDO” 
B) COMENTAR ESTE CÓDIGO, INDICANDO EL FUNCIONAMIENTO DE CADA COMPONENTE (DESDE EL PACKAGE HASTA EL MISMO
MÉTODO)
C) DENTRO DE LA APLICACIÓN, CREAR UN ARREGLO QUE INTEGRE LOS SIGUIENTES DATOS: - NOMBRE CLIENTE - APELLIDOS CLIENTE
- EDAD CLIENTE - RUT CLIENTE - NOMBRE EMPRESA - RUT EMPRESA - GIRO EMPRESA
- TOTAL DE VENTAS: Ej. 300 - MONTO EN DINERO DE LAS VENTAS HECHAS: Ej. 3.000.000. - CALCULAR Y GUARDAR EL MONTO EN
IVA A PAGAR A SII (SOBRE LOS 3.000.000) - CALCULAR Y GUARDAR EL MONTO DE UTILIDADES DEL MES DE LA EMPRESA (SOBRE
EL RESTANTE DE LOS 3.000.000)
ITEM II:
A) CREAR UNA CLASE MAIN QUE RECIBA TODA LA INFORMACIÓN REQUERIDA POR CONSOLA Y ENTREGARLA DINÁMICAMENTE A LAS
CLASES CORRESPONDIENTES. 
B) CREAR UNA CLASE LLAMADA DATOS_FACTURA QUE ALMACENE Y OPERE TODOS LOS DATOS DE LA FACTURA.
C) CREAR UNA CLASE LLAMADA VENTAS QUE ALMACENE Y OPERE CON LOS DATOS DE VENTAS, IVA, MONTOS, ETC., DE LAS FACTURAS
D) LA CLASE PADRE DEBE SER LA CLASE “DATOS_FACTURA” Y ÉSTA DEBE VALIDAR QUE TODOS LOS CAMPOS ENTRANTES
CONTENGAN INFORMACIÓN, SI NO LA TRAE, DEBE PEDIR AL USUARIO QUE LA INGRESE. 
E) LA CLASE VENTAS DEBE VALIDAR QUE
SUS DATOS CONTENGAN INFORMACIÓN, SI NO LA TRAE, DEBE PEDIR AL USUARIO QUE LA
INGRESE.
 */
public class VENTAS extends DATOS_FACTURA {
    
    public double TotalVentas;
    public double MontoVentas;
    public double MontoIVA;
    public double MontoUtilidades;
    public double[] Montos;

    public void Ventas() {
    }
    
    public void GuardarVentas(double TotalVentas, double MontoVentas, double MontoIVA, double MontoUtilidades) {
        this.TotalVentas = TotalVentas;
        this.MontoVentas = MontoVentas;
        this.MontoIVA = MontoIVA;
        this.MontoUtilidades = MontoUtilidades;
        
        double[] ventas = { this.TotalVentas, this.MontoVentas, this.MontoIVA, this.MontoUtilidades };
        
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("El valor " + (i + 1) + ": " + ventas[i]);
        }
    }

    public void mostrarmontos() {
        Scanner scan = new Scanner(System.in);
        Montos = new double[5];

        System.out.println("\nIngrese los montos de las compras:");

        for (int i = 0; i < 5; i++) {
            double monto = 0;
            boolean entradaValida = false;

            while (!entradaValida) {
                try {
                    System.out.print("Compra " + (i + 1) + ": ");
                    monto = scan.nextDouble();
                    if (monto != 0) {
                        entradaValida = true;
                    } else {
                        System.out.println("Error: No se permiten valores iguales a cero.");
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Error: Debe ingresar un número válido.");
                    scan.nextLine(); // Limpiar el búfer de entrada
                }
            }

            Montos[i] = monto;
        }

        System.out.println("\nMontos ingresados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Compra " + (i + 1) + ": " + Montos[i]);
        }
    }

    public void calcularTotalVentas() {
        double totalMontos = 0;
        for (int i = 0; i < Montos.length; i++) {
            totalMontos += Montos[i];
        }
        System.out.println("Monto total de la venta: " + totalMontos);
    }
}


      




