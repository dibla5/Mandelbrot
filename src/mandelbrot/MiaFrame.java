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
public class MiaFrame extends Frame{    
    public boolean handleEvent(Event e){ 
        if(e.id == Event.WINDOW_DESTROY)
            System.exit(0);
        return super.handleEvent(e);
    }
    public MiaFrame(String titolo){
        super(titolo);
    }
}

