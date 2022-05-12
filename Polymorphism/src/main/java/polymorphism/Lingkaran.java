/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Jamiro Noor Zahran
 */
public class Lingkaran extends BangunDatar{
    int r;
 
    public Lingkaran(int r) {
        this.r = r;
    }
 
    @Override
    float luas(){
        return(float)(Math.PI*Math.pow(r,2));
    }
       
    @Override
    float keliling(){
        return(float)(2*Math.PI*r);
    }
}