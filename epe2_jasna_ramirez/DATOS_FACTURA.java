/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.epe2_jasna_ramirez;

import java.util.Scanner;

/**
 *
 * @author Prueba jasna ITEM I:
A) CREAR UNA APLICACIÓN EN JAVA CUYO NOMBRE DEBE SER “EPE2_NOMBRE_APELLIDO” 
B) COMENTAR ESTE CÓDIGO, INDICANDO EL FUNCIONAMIENTO DE CADA COMPONENTE (DESDE EL PACKAGE HASTA EL MISMO
MÉTODO)
C) DENTRO DE LA APLICACIÓN, CREAR UN ARREGLO QUE INTEGRE LOS SIGUIENTES DATOS: - NOMBRE CLIENTE - APELLIDOS CLIENTE
*- EDAD CLIENTE - RUT CLIENTE - NOMBRE EMPRESA - RUT EMPRESA - GIRO EMPRESA
- TOTAL DE VENTAS: Ej. 300 - MONTO EN DINERO DE LAS VENTAS HECHAS: Ej. 3.000.000. - CALCULAR Y GUARDAR EL MONTO EN
IVA A PAGAR A SII (SOBRE LOS 3.000.000) - CALCULAR Y GUARDAR EL MONTO DE UTILIDADES DEL MES DE LA EMPRESA (SOBRE
EL RESTANTE DE LOS 3.000.000)
ITEM II:
A) CREAR UNA CLASE MAIN QUE RECIBA TODA LA INFORMACIÓN REQUERIDA POR CONSOLA Y ENTREGARLA DINÁMICAMENTE A LAS
CLASES CORRESPONDIENTES. 
B) CREAR UNA CLASE LLAMADA DATOS_FACTURA QUE ALMACENE Y OPERE TODOS LOS DATOS DE LA FACTURA.
C) CREAR UNA CLASE LLAMADA VENTAS QUE ALMACENE Y OPERE CON LOS DATOS DE VENTAS, IVA, MONTOS, ETC., DE LAS FACTURAS
D) LA CLASE PADRE DEBE SER LA CLASE “DATOS_FACTURA” Y ÉSTA DEBE VALIDAR QUE TODOS LOS CAMPOS ENTRANTES
CONTENGAN INFORMACIÓN, SI NO LA TRAE, DEBE PEDIR AL USUARIO QUE LA INGRESE. E) LA CLASE VENTAS DEBE VALIDAR QUE
*SUS DATOS CONTENGAN INFORMACIÓN, SI NO LA TRAE, DEBE PEDIR AL USUARIO QUE LA
INGRESE.
 */
public class DATOS_FACTURA {

 
    
    public String Nombre_Cliente;
    public String Apellidos_Cliente;
    public String Edad_Cliente;
    public String Rut_Cliente;
    public String Nombre_Empresa;
    public String Rut_Empresa;
    public String Total_Ventas;
    
    
    public void Datos_Factura (){
        
    }
    
   
    
    public void guardarDatosFactura(String Nombre_Cliente,String Apellido_Cliente, String Edad_Cliente, 
    String Rut_Cliente,String Nombre_Empresa, String Rut_Empresa, String Total_Ventas){
        
       this.Nombre_Cliente=Nombre_Cliente;
       this.Apellidos_Cliente=Apellido_Cliente;
       this.Edad_Cliente=Edad_Cliente;
       this.Rut_Cliente=Rut_Cliente;
       this.Nombre_Empresa=Nombre_Empresa;
       this.Rut_Empresa=Rut_Empresa;
       this.Total_Ventas=Total_Ventas;
       

       
       
       
       String [] DatosFactura ={this.Nombre_Cliente, this.Apellidos_Cliente, this.Edad_Cliente, this.Rut_Cliente, 
       this.Nombre_Empresa, this.Rut_Empresa,this.Total_Ventas};
       
       
       System.out.println ("El nombre del cliente es: " +DatosFactura[0]);
       System.out.println ("Los Apelliso del cliente son : " +DatosFactura[1]);
       System.out.println ("La edad del cliente es" +DatosFactura[2]);
       System.out.println ("El Rut del clientes es :" +DatosFactura[3]);
       System.out.println ("El nombre de la empresa es :" +DatosFactura[4]);
       System.out.println ("El Rut de la empresa es:" +DatosFactura[5]);
       System.out.println ("El Total de las ventas son :" +DatosFactura[6]);
       
       

       
        for(int i=0 ; i < DatosFactura.length; i++){
       
        
        
        System.out.println ("Los Datos Existentes en el arreglo son :" +DatosFactura[i]);
            
        
         return;
        }  
        
    }
    
    public String getNombre_Cliente(){
        
        return Nombre_Cliente;
        
    }
    
    
    public String getApellido_Cliente(){
        
        return Apellidos_Cliente;
        
    }
    
    
     public String getEdad_Cliente(){
        
        return Edad_Cliente;
        
    }
     
      public String getRut_Cliente(){
        
        return Rut_Cliente;
        
    }
     
        public String getNombre_Empresa(){
        
        return Nombre_Empresa;
        
    }
        
     public String getRut_Empresa(){
        
        return Rut_Empresa;
        
    }
     
        
         
     }
       
        
        
     
        
         
         
     
        
              
       
        
         
         
     
       
    

   

