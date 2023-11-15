/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_parquimetro;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;


public class Proyecto_Parquimetro extends JFrame {
  
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JLabel etiqueta4;
    private JLabel etiqueta5;
    private JTextField texto1;
    private JTextField texto2;
    private JTextField texto3;
    private JTextField texto4;
    private JButton boton1;
    private JButton boton2;
    private JTextArea registroHoras;
    private Image imagen;
   
    private int xLine = 0;   
    private Thread animationThread;
   
   
   
    public Proyecto_Parquimetro(){
        
  
   
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
    
    etiqueta4 = new JLabel("<html><font color='white' size='6' face='Arial'>&nbsp;TOTAL&nbsp;PAGO</font></html>");
    etiqueta4.setBounds(150, 190, 200, 30);
    add(etiqueta4);
    
    
    etiqueta5 = new JLabel("<html><font color='white' size='6' face='Arial'>&nbsp;PROYECTO PARQUIMETRO</font></html>");
    etiqueta5.setBounds(500, 200, 300, 500); // Reduzco el ancho a 30
    add(etiqueta5);

   
    texto1 = new JTextField();
    texto1.setBounds(50,50,120,30);
    add(texto1);
   
    texto2 = new JTextField();
    texto2.setBounds(200,50,120,30);
    add(texto2);
    
    texto3 = new JTextField();
    texto3.setBounds(350,65,120,50);
    add(texto3);
    
    texto4 = new JTextField();
    texto4.setBounds(140,230,200,50);
    add(texto4);
    
    boton1 = new JButton("Registrar Entrada");
    boton1.setBounds(50, 90, 120, 50);
    add(boton1);

    boton2 = new JButton("Registrar Salida");
    boton2.setBounds(200,90,120,50);
    add(boton2);
    
    
 
    
    
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
      
      
            boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String horaManual = texto2.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

                if (horaManual.matches("\\d{2}:\\d{2}:\\d{2}")) {
                    try {
                        Date horaIngresada = sdf.parse(horaManual);
                        String horaFormateada = sdf.format(horaIngresada);

                        // Puedes almacenar la hora en una lista, base de datos u otro lugar según tus necesidades
                        // Por ahora, simplemente la mostramos en el JTextArea de registro
                        registroHoras.append("Hora de salida registrada manualmente: " + horaFormateada + "\n");

                        // Borra el texto ingresado después de registrar la hora
                        texto2.setText("");
                    } catch (java.text.ParseException ex) {
                        JOptionPane.showMessageDialog(null, "Formato de hora incorrecto. Utiliza el formato HH:mm:ss");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Formato de hora incorrecto. Utiliza el formato HH:mm:ss");
                }
            }
        });

        setSize(300, 200);
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
    

       


   public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        
    
    Proyecto_Parquimetro formulario1 = new Proyecto_Parquimetro();
    formulario1.setVisible(true);
       
       
        formulario1.setBounds(0,0,1000,500);
        formulario1.setResizable(false);
        
    
       
        // Centrar el formulario en la pantalla
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       int centerX = (int) (screenSize.getWidth() - formulario1.getWidth()) / 2;
       int centerY = (int) (screenSize.getHeight() - formulario1.getHeight()) / 2;
       formulario1.setLocation(centerX, centerY);


       
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario1.setTitle ("Proyecto Parquimetro");
        formulario1.setBackground(Color.BLACK);
       
       
        formulario1.etiqueta1.setForeground(Color.darkGray);
        formulario1.etiqueta2.setForeground(Color.DARK_GRAY);
        formulario1.getContentPane().setBackground(Color.GRAY);
    
        
      
    
     });
   
   }

    
}

 

    
  
      

      
  

            
      
