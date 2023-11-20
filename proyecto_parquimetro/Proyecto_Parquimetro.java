/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_parquimetro;
import com.mycompany.proyecto_parquimetro.Cliente;
import com.mycompany.proyecto_parquimetro.Parquimetro;
import com.mycompany.proyecto_parquimetro.Datos_ingreso;
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
import java.util.Date;
import javax.swing.*;
  

public class Proyecto_Parquimetro {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Parquimetro formulario1 = new Parquimetro();
            formulario1.setVisible(true);

            formulario1.setBounds(0, 0, 1000, 500);
            formulario1.setResizable(false);

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int centerX1 = (int) (screenSize.getWidth() - formulario1.getWidth()) / 2;
            int centerY1 = (int) (screenSize.getHeight() - formulario1.getHeight()) / 2;
            formulario1.setLocation(centerX1, centerY1);

            formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            formulario1.setTitle("Proyecto Parquimetro");
            formulario1.setBackground(Color.BLACK);

            formulario1.etiqueta1.setForeground(Color.darkGray);
            formulario1.etiqueta2.setForeground(Color.DARK_GRAY);
            formulario1.getContentPane().setBackground(Color.LIGHT_GRAY);

            Datos_ingreso formulario2 = new Datos_ingreso();
            formulario2.setVisible(false);

            formulario2.setBounds(0, 0, 500, 500);
            formulario2.setResizable(true);

            Dimension screenSize2 = Toolkit.getDefaultToolkit().getScreenSize();
            int centerX2 = (int) (screenSize2.getWidth() - formulario2.getWidth()) / 2;
            int centerY2 = (int) (screenSize2.getHeight() - formulario2.getHeight()) / 2;
            formulario2.setLocation(centerX2, centerY2);

            formulario2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cambiado a DISPOSE_ON_CLOSE
            formulario2.setTitle("Proyecto Parquimetro - Datos Ingreso");
            formulario2.setBackground(Color.BLACK);

           
            formulario2.getContentPane().setBackground(Color.LIGHT_GRAY);
            
            
        });
    }
}
 

    
  
      

      
  

            
      
