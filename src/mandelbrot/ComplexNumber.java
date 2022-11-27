/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandelbrot;

/**
 *
 * @author dibla
 */
public class ComplexNumber {
    private double real;
    private double imaginary;
    
    public void setReal(double real){
        this.real=real;
    }
    public double getReal(){
        return real;
    }
    
    public void setImaginary(double imaginary){
        this.imaginary=imaginary;
    }
    public double getImaginary(){
        return imaginary;
    }
    
    public void addRi(double real, double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
    }
    public void addCn(ComplexNumber number){
        this.real+=number.getReal();
        this.imaginary+=number.getImaginary();
    }
    
    public void subtractRi(double real, double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
    }
    public void subtractCn(ComplexNumber number){
        this.real-=number.getReal();
        this.imaginary-=number.getImaginary();
    }
}
