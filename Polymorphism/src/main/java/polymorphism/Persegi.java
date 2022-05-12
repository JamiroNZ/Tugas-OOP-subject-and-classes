/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Jamiro Noor Zahran
 */
public class Persegi extends BangunDatar{
    int sisi;
 
    public Persegi(int sisi) { //Constructor
        this.sisi = sisi;
    }
   
    @Override
    float luas(){
        return this.sisi * this.sisi;
    }
   
    @Override
    float keliling(){
        return this.sisi * 4;
    }
}
