/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandelbrot;

import java.awt.*;

/**
 *
 * @author i4bi7
 */
public class Pannello extends Panel{
    private double distanzaAdiacenti;
    private double inizioX;
    private double inizioY;
    private double xReale;
    private double yImmaginario;
    private double inizioDisegnoX;
    private double inizioDisegnoY;
    private double realeK;
    private double immaginariaK;
    private double xFinaleReale; 
    private double yFinaleImmaginaria; 
    private double xyFinale;
    private int cicliMassimi;  //più sono, più sarà definito
    private int ciclo;
    private int i2;
    private int i;
    private int rosso;
    private int verde;
    private int blu;
    private double zoom;
    private double w;
    private double h;
    
    public void setInizioX(double inizioX) {
            this.inizioX = inizioX;
    }
    
    public double getInizioX() {
        return inizioX;
    }

    public void setInizioY(double inizioY) {
            this.inizioY = inizioY;
    }
    public double getInizioY() {
        return inizioY;
    }
    
    public void setZoom(double zoom) {
            this.zoom = zoom;
    }
    public double getZoom() {
        return zoom;
    }

    
    @Override
    public void paint(Graphics g){
        w = getSize().width*getZoom();
        h = getSize().height*getZoom();  
        
        cicliMassimi = 60;
        inizioX=0.0+getInizioX();
        inizioY=0.0+getInizioY();
        distanzaAdiacenti= (2.5/(w)); 
	inizioDisegnoX=0; 
        
        for(i=0;i<=w;){
            inizioDisegnoX += distanzaAdiacenti; 
            inizioDisegnoY =0;
            for(i2=0;i2<=h;){
                inizioDisegnoY += distanzaAdiacenti;               
                xReale = (inizioX  - inizioDisegnoX)+1.75 ;  //centriamo l'insieme di mandelbrot
                yImmaginario = (inizioY - inizioDisegnoY )+1.25 ; //centriamo l'insieme di mandelbrot            
                realeK = 0;
                immaginariaK = 0;
                xFinaleReale=0;
                yFinaleImmaginaria=0;
                ciclo = 0;
                xyFinale=0;
                do{
                    ciclo++;
                    xFinaleReale= (realeK*realeK - immaginariaK*immaginariaK)-xReale;
                    yFinaleImmaginaria= (2*realeK*immaginariaK)-yImmaginario;
                    realeK =  xFinaleReale;
                    immaginariaK =  yFinaleImmaginaria;
                    xyFinale = (realeK*realeK - immaginariaK*immaginariaK);	                 
                    if (xyFinale >=4 )
                        ciclo += cicliMassimi;    
                } 
                while (ciclo <= cicliMassimi );
                        rosso= (10*ciclo)%255;       //modulo di 255
                        verde = (10*ciclo+26)%255;   //modulo di 255
                        blu= (10*ciclo-8)%255;       //modulo di 255

                if (xyFinale < 4){ 
                    rosso = 0;
                    verde = 0; 
                    blu = 0;
                } 

            g.setColor(new Color(rosso, verde,blu));
            g.drawLine(i,i2, i,i2);         
            i2 = (i2+1); 
            }
            i = (i+1);             
        }  
    }
    
}
