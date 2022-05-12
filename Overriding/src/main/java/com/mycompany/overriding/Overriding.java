/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.overriding;

/**
 *
 * @author Jamiro Noor Zahran
 */
class Complex 

{ 

private double re, im;  

 

public Complex(double re, double im) { 

this.re = re; 

this.im = im;} 

} 

 


public class Overriding

{ 

 

public static void main(String[] args) { 

Complex c1 = new Complex(10, 15); 

Complex c2 = new Complex(10, 15); 

if (c1 == c2) 

{System.out.println("Sama ");} 

else {System.out.println("Tidak"

+" Sama ");} 

}

}
