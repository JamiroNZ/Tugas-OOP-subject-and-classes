/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tank;

/**
 *
 * @author Jamiro Noor Zahran
 */
public class Tank {
    int tankWeight;
    
    public Tank(String name) {
        System.out.println("Name chosen is :" + name);
    }
    public void setWeight( int weight ) {
        tankWeight = weight;
    }
    public int getWeight( ) {
        System.out.println("Tank's weight is :" + tankWeight);
        return tankWeight;
    }
    
    public static void main(String []args) {
        Tank myTank = new Tank( "arjun" );
        
        myTank.setWeight( 54 );
        
        myTank.getWeight( );
        
        System.out.println("Variable Value :" + myTank.tankWeight );
    }
}

