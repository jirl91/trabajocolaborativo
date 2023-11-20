/*
 */
package com.mycompany.proyecto_parquimetro;

import com.mycompany.proyecto_parquimetro.Hora_$;

import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datos_ingreso extends JFrame {
    
    
    private JLabel Nombre_completo;
    private JLabel RUT;
    private JLabel Edad;
    private JLabel Pasaporte;
    private JLabel Nacionalidad;
    private JLabel Sexo;
    
    //Datos empreza encabezado
    
    private JLabel empresa;
    private JLabel boleta;
    private JLabel Direccion;
    private JLabel RUT_es;
    private JLabel telefono;
    private JLabel numeroBoleta;
    
    
    private JLabel HoraEntrada;
    private JLabel HoraSalida;
    private JLabel Minutos;
    private JLabel Total_dinero;
    
  
    
     
    //PARA QUE EL NUMERO DE LA BOLETA AUMENTE
    
    private  int numeroBoletaActual = (1*2);
    
    
   
    
    public Datos_ingreso () {
        
        setLayout(null);
        

        
        Hora_$ hora$ = new Hora_$();

      
    
        
        
        Nombre_completo = new JLabel("<html><font color='DARK' size='4' face='Serif'>Nombre cliente: </font></html>");
        Nombre_completo.setBounds(10, 200, 300,30);
        add(Nombre_completo);
        
        RUT = new JLabel("<html><font color='DARK' size='4' face='Serif'>RUN:</font></html>");
        RUT.setBounds(10,100,300,300);
        add(RUT);
        
        Pasaporte = new JLabel("<html><font color='DARK' size='4' face='Serif'>Pasaporte:</font></html>");
        Pasaporte.setBounds(10,130,300,300);
        add(Pasaporte);
        
        Nacionalidad = new JLabel("<html><font color='DARK' size='4' face='Serif'>Nacionalidad:</font></html>");
        Nacionalidad.setBounds(10,160,300,300);
        add(Nacionalidad);
        
        Edad = new JLabel("<html><font color='DARK' size='4' face='Serif'>Edad:</font></html>");
        Edad.setBounds(10,200,300,300);
        add(Edad);
        
        
        
        
        //Datos empresa
        
        boleta = new JLabel("<html><font color='DARK' size='5' face='Serif'>BOLETA ELECTRONICA</font></html>");
        boleta.setBounds(100, 5, 300,30);
        add(boleta);
        
        //NECESITO QUE CADA VEZ QUE SE HABRÁ EL LISTADO EL NUMERO DE BOLETA VAYA CAMBIANDO
        
        numeroBoleta = new JLabel("<html><font color='DARK' size='5' face='Serif'>Número de Boleta: " + numeroBoletaActual + "</font></html>");
        numeroBoleta.setBounds(125, -100, 300, 300);
        add(numeroBoleta);
        
        
         numeroBoletaActual++;
         
        empresa= new JLabel("<html><font color='DARK' size='5' face='Serif'> PROYECTO PARQUIMETRO S.A </font></html>");
        empresa.setBounds(90, -70, 300, 300);
        add(empresa);
        
        RUT_es= new JLabel("<html><font color='DARK' size='4' face='Serif'> 70.800.500-3 </font></html>");
        RUT_es.setBounds(160, -30, 300, 300);
        add(RUT_es);
        
        
        Direccion= new JLabel("<html><font color='DARK' size='4' face='Serif'> Teatinos 500, Santiago Centro, RM  </font></html>");
        Direccion.setBounds(110, -50, 300, 300);
        add(Direccion);
        
        telefono= new JLabel("<html><font color='DARK' size='4' face='Serif'> 222222222  </font></html>");
        telefono.setBounds(160, -10, 300, 300);
        add(telefono);
        
       // DaTOS HORARIO 
       
        HoraEntrada= new JLabel("<html><font color='DARK' size='3' face='Serif'> Hora Entrada:</font></html>");
        HoraEntrada.setBounds(160, 250, 300, 300);
        add(HoraEntrada);
        
        HoraSalida= new JLabel("<html><font color='DARK' size='3' face='Serif'> Hora Salida:</font></html>");
        HoraSalida.setBounds(160, 280, 300, 300);
        add(HoraSalida);
        
        Minutos= new JLabel("<html><font color='DARK' size='5' face='Serif'> Total Minutos:</font></html>");
        Minutos.setBounds(120, 310, 300, 300);
        add(Minutos);
       
        // MONTO EN DINERO MINUTOS * 35 PESOS
        
        
        Total_dinero= new JLabel("<html><font color='DARK' size='4' face='Serif'> Total a pagar:</font></html>");
        Total_dinero.setBounds(50, 500, 300, 300);
        add(Total_dinero);
        
        

        setSize(500, 950); // Establece el tamaño en píxeles (ancho x alto)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar este JFrame
        setLocationRelativeTo(null); // Coloca la ventana en el centro de la pantalla
        setTitle("Datos de Ingreso"); // Título de la ventana
        setResizable(false); // 
        
    }
    
    
  public void actualizarDatosCliente(String nombreCompleto, String rut, String pasaporte, String nacionalidad, String edad) {
    Nombre_completo.setText("<html><font color='DARK' size='4' face='Serif'>Nombre cliente: " + nombreCompleto + "</font></html>");
    RUT.setText("<html><font color='DARK' size='4' face='Serif'>RUN: " + rut + "</font></html>");
    Pasaporte.setText("<html><font color='DARK' size='4' face='Serif'>Pasaporte: " + pasaporte + "</font></html>");
    Nacionalidad.setText("<html><font color='DARK' size='4' face='Serif'>Nacionalidad: " + nacionalidad + "</font></html>");
    Edad.setText("<html><font color='DARK' size='4' face='Serif'>Edad: " + edad + "</font></html>");
    // Otros campos que desees actualizar
}
  
public void actualizarDatosHora(String horaEntrada, String horaSalida, String costoTotal) {
    HoraEntrada.setText("<html><font color='DARK' size='4' face='Serif'>Hora Entrada: " + horaEntrada + "</font></html>");
    HoraSalida.setText("<html><font color='DARK' size='4' face='Serif'>Hora Salida: " + horaSalida + "</font></html>");
    
    Total_dinero.setText("<html><font color='DARK' size='4' face='Serif'>Total a Pagar: " + costoTotal + "</font></html>");
    
}

public void actualizarDatosHora1 (int totalMinutos){
    Minutos.setText("<html><font color='DARK' size='5' face='Serif'>Total Minutos : " + totalMinutos + "</font></html>");
    
}
   



}

    
     
 
  
    
       
    


