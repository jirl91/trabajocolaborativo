package com.mycompany.proyecto_parquimetro;
import com.mycompany.proyecto_parquimetro.Datos_ingreso;
import com.mycompany.proyecto_parquimetro.Cliente;
import com.mycompany.proyecto_parquimetro.Hora_$;




import java.awt.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.*;



public class Parquimetro extends JFrame {
  
    JLabel etiqueta1;
    JLabel etiqueta2;
    private JLabel etiqueta3;
    private JLabel etiqueta4;
    private JLabel etiqueta5;
    private JLabel etiqueta6;
    private JLabel etiqueta7;
    private JLabel etiqueta8;
    private JLabel etiqueta9;
    private JLabel etiqueta10;
    private JTextField texto1;
    private JTextField texto2;
    private JTextField texto3;
    private JTextField texto4;
    private JTextField texto5;
    private JTextField texto6;
    private JTextField texto7;// el cuadro del pasaporte
    private JTextField texto8;// el cuadro del pasaporte
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;//Finaliza y abre la ventana con todos los datos
    private JButton boton4;//Guardar los Datos ingresados en el Jframe1
    
    private JTextArea registroHoras;
    private Image imagen;
    private JComboBox<String> desplegable;
   
    private int xLine = 0;   
    private Thread animationThread;
    private final Cliente cliente;
    private Datos_ingreso formulario2;
    private Hora_$ datosHora;
    

    public Parquimetro(){
        
    cliente = new Cliente();
    
    datosHora = new Hora_$();
    

    setLayout(null);
   
    etiqueta1 = new JLabel("<html><font color='white' size='4'>HORA ENTRADA</font></html>");
    etiqueta1.setBounds(50, 20, 300,30);
    add(etiqueta1);
   
   
    etiqueta2 = new JLabel("<html><font color='white' size='4'>HORA SALIDA</font></html>");
    etiqueta2.setBounds(200, 20, 100, 30);
    add(etiqueta2);
    
    etiqueta3 = new JLabel("<html><font color='white' size='4' face='Arial'>&nbsp;TOTAL&nbsp;MINUTOS</font></html>");
    etiqueta3.setBounds(350, 20, 200, 30);
    add(etiqueta3);
    
    etiqueta4 = new JLabel("<html><font color='white' size='4' face='Arial'>&nbsp;TOTAL&nbsp;PAGO</font></html>");
    etiqueta4.setBounds(600, 10, 200, 60);
    add(etiqueta4);
    
    
    etiqueta5 = new JLabel("<html><font color='white' size='6' face='Arial'>&nbsp;PROYECTO PARQUIMETRO</font></html>");
    etiqueta5.setBounds(500, 200, 300, 500); // Reduzco el ancho a 30
    add(etiqueta5);
    
    etiqueta6 = new JLabel("<html><font color='white' size='5' face='Arial'>&nbsp;PATENTE </font></html>");
    etiqueta6.setBounds(50, 100, 500, 500); // Reduzco el ancho a 30
    add(etiqueta6);
    
    etiqueta7 = new JLabel("<html><font color='white' size='4' face='Arial'>&nbsp;NOMBRE COMPLETO </font></html>");
    etiqueta7.setBounds(50, -50, 500, 500); // Reduzco el ancho a 30
    add(etiqueta7);
    
    etiqueta8 = new JLabel("<html><font color='white' size='4' face='Arial'>&nbsp;RUT  </font></html>");
    etiqueta8.setBounds(50, -10, 500, 500); // Reduzco el ancho a 30
    add(etiqueta8);
    
    etiqueta9 = new JLabel("<html><font color='white' size='4' face='Arial'>&nbsp;Pasaporte  </font></html>");
    etiqueta9.setBounds(50, 30, 500, 500); // Reduzco el ancho a 30
    add(etiqueta9);
    
    etiqueta10 = new JLabel("<html><font color='white' size='4' face='Arial'>&nbsp;Nacionalidad  </font></html>");
    etiqueta10.setBounds(50, 60, 500, 500); // Reduzco el ancho a 30
    add(etiqueta10);


   
    texto1 = new JTextField();
    texto1.setBounds(50,50,120,30); // HORA ENTRADA 
    add(texto1);
   
    texto2 = new JTextField();
    texto2.setBounds(200,50,120,30); // HORA DE SALIDA 
    add(texto2);
    
    texto3 = new JTextField();
    texto3.setBounds(350,65,120,50);
    add(texto3);
    
    texto4 = new JTextField();
    texto4.setBounds(600,65,200,20);
    add(texto4);
    
    texto5 = new JTextField(); // nombre completo 
    texto5.setBounds(250,190,250,25);
    add(texto5);
    
    texto6 = new JTextField();
    texto6.setBounds(250,230,250,25); // rut
    add(texto6);
   
    
    texto7 = new JTextField();
    texto7.setBounds(250,270,250,25); // Acá se digitara el pasaporte
    add(texto7);
            
     texto8 = new JTextField();
    texto8.setBounds(250,300,250,25); // nacionalidad 
    add(texto8);
    
    boton1 = new JButton("Registrar Entrada");
    boton1.setBounds(50, 90, 120, 50);
    add(boton1);

    boton2 = new JButton("Registrar Salida");
    boton2.setBounds(200,90,120,50);
    add(boton2);
    
    boton3 = new JButton("Listo");
    boton3.setBounds(850,400,120,50);
    add(boton3);
    
    boton4 = new JButton("Guardar");
    boton4.setBounds(500,400,120,50);
    add(boton4);
    
    
    

 
  
    
      
        formulario2 = new Datos_ingreso();
        
        
      boton1.addActionListener(new ActionListener() {
       @Override
       
      public void actionPerformed(ActionEvent e) {
                // Obtén la hora actual y regístrala en el JTextField
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                Date horaActual = new Date();
                String horaFormateada = sdf.format(horaActual);
                texto1.setText(horaFormateada);
                
          
               
            }
        });
      
      
         
            
boton4.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Datos del cliente
        String nombreCompleto = texto5.getText();
        String RUT = texto6.getText();
        String Pasaporte = texto7.getText();
        String Nacionalidad = texto8.getText();

        // Almacena los datos del cliente en la instancia de Cliente
        cliente.almacenarDatosCliente(nombreCompleto, RUT, Pasaporte, Nacionalidad, " ");
        cliente.mostrarDatosCliente();
            
           // Actualiza los datos del cliente en el segundo JFrame
            formulario2.actualizarDatosCliente(
                    cliente.datosCliente[0],
                    cliente.datosCliente[1],
                    cliente.datosCliente[2],
                    cliente.datosCliente[3],
                    cliente.datosCliente[4]
            );

          //HORA 
          
          String horaEntrada = texto1.getText();
          String horaSalida = texto2.getText();

// Co// Convierte las cadenas a enteros (asegúrate de manejar posibles excepciones)
        int minutosEntrada = Integer.parseInt(horaEntrada.split(":")[0]) * 60 + Integer.parseInt(horaEntrada.split(":")[1]);
        int minutosSalida = Integer.parseInt(horaSalida.split(":")[0]) * 60 + Integer.parseInt(horaSalida.split(":")[1]);

        // Calcula la diferencia de tiempo en minutos
        int totalMinutos = minutosSalida - minutosEntrada;
        
     

        // No necesitas almacenar totalMinutos en datosHora
        datosHora.almacenarHora$(horaEntrada, horaSalida," ");
        datosHora.mostrarDatosHora();
        datosHora.calcularDiferenciaMinutos();
        datosHora.totalApagar();
        datosHora.obtenerTotalMinutos();
       

        // Actualiza los datos en formulario2
            formulario2.actualizarDatosHora(
            datosHora.DatosHora[0],
            datosHora.DatosHora[1],
            datosHora.DatosHora[3]
            
           
        );
            
            formulario2.actualizarDatosHora1(
             totalMinutos
            );
            
            // SE AGREGA EL PAGO AL BOTON 4 
            

        
    

        // Muestra el segundo JFrame
        formulario2.setVisible(true);
      
    }


    
});






boton3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Utiliza la variable miembro formulario2 en lugar de crear una nueva instancia
        formulario2.setVisible(true);
    }
});
    


        setSize(500, 1000);
        setLocationRelativeTo(null);
    }
             

    
     @Override
    public void paint(Graphics g) {
        super.paint(g);
        
       int frameHeight = getHeight();

        // Dibuja una línea roja
       g.setColor(Color.RED);
       ((Graphics2D) g).setStroke(new BasicStroke(3));
       int x = getWidth() - 20; // x es el mismo para ambos puntos
       int y1 = frameHeight / 16; // Punto inicial
       int y2 = y1 + 600; // Punto final, 500 píxeles más abajo
       g.drawLine(x, y1, x, y2); // Dibuja una línea vertical
       
      
    
        // Dibuja una línea azu
       g.setColor(Color.BLUE);
       ((Graphics2D) g).setStroke(new BasicStroke(3));
       int xAzul = getWidth() - 40; // x es el mismo para ambos puntos
       int y1Azul = frameHeight / 16; // Punto inicial
       int y2Azul = y1Azul + 600; // Punto final, 500 píxeles más abajo
       g.drawLine(xAzul, y1Azul, xAzul, y2Azul); // Dibuja una línea vertical

        // Dibuja una línea verde
        g.setColor(Color.GREEN);
        ((Graphics2D) g).setStroke(new BasicStroke(3));
       int xverde = getWidth() - 60; // x es el mismo para ambos puntos
       int y1verde = frameHeight / 16; // Punto inicial
       int y2verde = y1verde + 600; // Punto final, 500 píxeles más abajo
       g.drawLine(xverde, y1verde, xverde, y2verde); // Dibuja una línea vertical


        // Otras personalizaciones de línea
        g.setColor(Color.BLACK);
        // Ancho de línea
        ((Graphics2D) g).setStroke(new BasicStroke(3));
       int xD = getWidth() - 80; // x es el mismo para ambos puntos
       int y1D = frameHeight / 16; // Punto inicial
       int y2D = y1D + 600; // Punto final, 500 píxeles más abajo
       g.drawLine(xD, y1D, xD, y2D); // Dibuja una línea vertical

        // Dibujar una línea diagonal
        g.setColor(Color.MAGENTA);
        ((Graphics2D) g).setStroke(new BasicStroke(3));
       int xM = getWidth() - 80; // x es el mismo para ambos puntos
       int y1M = frameHeight / 16; // Punto inicial
       int y2M = y1M + 600; // Punto final, 500 píxeles más abajo
       g.drawLine(xM, y1M, xM, y2M); // Dibuja una línea vertical
       
       
         // Dibuja una línea roja
      
       
    }
    
}



   