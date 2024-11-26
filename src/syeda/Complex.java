package syeda;

import java.util.Scanner;
public class Complex {

    private static boolean isPolar = false;

    private final double real;

    private final double imag;

    public Complex(){
        real = 0;
        imag = 0;
    }
    public Complex(double real){
        this.real = real;
        imag = 0;
    }
    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    //NOT DONE
    public Complex(String num){
        double real = 0;
        double imag = 0;
        num = num.replace("(", "").replace(")", "");
        this.real = Double.parseDouble(num.substring(0, num.indexOf(' ')));
        this.imag = Double.parseDouble(num.substring(num.indexOf(' ') + 3, num.length() -1));

    }
    public String toString(){
        return real + " + " + imag + "i";
    }
    public Complex plus(double addend){
        return new Complex(real + addend, imag);
    }
    public Complex plus(Complex addend){
        double real = this.real + addend.real;
        double imag = this.imag + addend.imag;
        return new Complex(real, imag);
    }
    public Complex minus(Complex subtrahend){
        double real = this.real - subtrahend.real;
        double imag = this.imag - subtrahend.imag;
        return new Complex(real, imag);
    }
    public Complex minus(double addend){
        double real = this.real - addend;
        return new Complex(real -addend, imag);
    }
    public boolean equals(Complex that){
        final double closenessThreshold = 0.0001;
        return Math.abs(real - that.real) < closenessThreshold && Math.abs(imag-that.imag) <closenessThreshold;
    }
    public static void setPolar(){
        isPolar = true;
    }
    public static void setCartesian(){
        isPolar = false;
    }












}
