/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandelbrot;

import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author i4bi7
 */

public class Mandelbrot{
    public static void main(String[] args){
        MiaFrame f = new MiaFrame("Frattale di Mandelbrot");  
        Pannello destra = new Pannello();  
        Button b1 = new Button("Crea");  
        Button b2 = new Button("Reset"); 
        Button b3 = new Button("Cancella il frattale");
        TextField tfCX = new TextField();
        TextField tfCY = new TextField();
        TextField tfZoom = new TextField();
        Label lCX1 = new Label("Coordinata");
        Label lCY1 = new Label("Coordinata");
        Label lCX2 = new Label("X");
        Label lCY2 = new Label("Y");
        Label lZoom = new Label("Zoom");
        
        f.setBackground(Color.decode("#FAEBD7"));
        destra.setBounds(260,100,500,500);   //1°= sposto a destra/sinistra //2° = sposto in basso/alto //3° = allungo il bottone //4° = alzo il bottone  
        b1.setBounds(15,400,80,30);   //1°= sposto a destra/sinistra //2° = sposto in basso/alto //3° = allungo il bottone //4° = alzo il bottone  
        b2.setBounds(90,400,160,30);   //1°= sposto a destra/sinistra //2° = sposto in basso/alto //3° = allungo il bottone //4° = alzo il bottone
        b3.setBounds(45,450,150,30);   //1°= sposto a destra/sinistra //2° = sposto in basso/alto //3° = allungo il bottone //4° = alzo il bottone
        tfCX.setBounds(40,200,70,20);   //1°= sposto a destra/sinistra //2° = sposto in basso/alto //3° = allungo il bottone //4° = alzo il bottone
        tfCY.setBounds(130,200,70,20);  //1°= sposto a destra/sinistra //2° = sposto in basso/alto //3° = allungo il bottone //4° = alzo il bottone
        tfZoom.setBounds(85,275,70,20);  //1°= sposto a destra/sinistra //2° = sposto in basso/alto //3° = allungo il bottone //4° = alzo il bottone
        lCX1.setBounds(40,165,70,20);  //1°= sposto a destra/sinistra //2° = sposto in basso/alto //3° = allungo il bottone //4° = alzo il bottone
        lCY1.setBounds(130,165,70,20);  //1°= sposto a destra/sinistra //2° = sposto in basso/alto //3° = allungo il bottone //4° = alzo il bottone
        lCX2.setBounds(71,180,70,20);  //1°= sposto a destra/sinistra //2° = sposto in basso/alto //3° = allungo il bottone //4° = alzo il bottone
        lCY2.setBounds(161,180,70,20);  //1°= sposto a destra/sinistra //2° = sposto in basso/alto //3° = allungo il bottone //4° = alzo il bottone
        lZoom.setBounds(102,255,70,20);  //1°= sposto a destra/sinistra //2° = sposto in basso/alto //3° = allungo il bottone //4° = alzo il bottone
        
        
        b1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){
                f.add(tfCX);
                f.add(tfCY);
                f.add(tfZoom);
                f.add(lCX1);
                f.add(lCY1);
                f.add(lCX2);
                f.add(lCY2);
                f.add(lZoom);
                destra.setVisible(true);
                String cXStr,cYStr,zoomStr;
                double cXDoub,cYDoub,zoomDoub;
                
                cXStr = tfCX.getText();
                cYStr = tfCY.getText();
                zoomStr = tfZoom.getText();
                
                cXDoub = Double.parseDouble(cXStr);
                cYDoub = Double.parseDouble(cYStr);
                zoomDoub = Double.parseDouble(zoomStr);
                
                
                destra.setInizioX(cXDoub);
                destra.setInizioY(cYDoub);
                destra.setZoom(zoomDoub);
                
                if(cXDoub != 0 || cYDoub != 0 || zoomDoub!= 1)
                    destra.repaint();
            }
        });  
        
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                destra.setInizioX(0);
                destra.setInizioY(0);
                destra.setZoom(1);
                
                tfCX.setText("      0");
                tfCY.setText("      0");
                tfZoom.setText("      1");
                
                f.add(tfCX);
                f.add(tfCY);
                f.add(tfZoom);
                f.add(lCX1);
                f.add(lCY1);
                f.add(lCX2);
                f.add(lCY2);
                f.add(lZoom);
                destra.repaint();
            } 
        });
        
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                destra.setVisible(false);
                f.remove(tfCX);
                f.remove(tfCY);
                f.remove(tfZoom);
                f.remove(lCX1);
                f.remove(lCY1);
                f.remove(lCX2);
                f.remove(lCY2);
                f.remove(lZoom);
            } 
        });
        
        f.setResizable(false);
        f.add(destra);
        f.add(b1);  
        f.add(b2);
        f.add(b3);
        f.setSize(780,615);  
        
        destra.setVisible(false);
        tfCX.setText("0");
        tfCY.setText("0");
        tfZoom.setText("1");
        f.setLayout(null);  
        f.setVisible(true);   
    }
    
}

