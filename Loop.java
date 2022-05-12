/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loop;

/**
 *
 * @author Jamiro Noor Zahran
 */
public class Loop {

     public static void main(String args[]) {
      int [] weight = {63, 71, 65, 38, 45};

      for(int x : weight ) {
         System.out.print( x );
         System.out.print(",");
      }
      System.out.print("\n");
      String [] codename = {"Arjun", "Lercrec", "Challanger", "Borrasque", "Leopard2"};

      for( String name : codename ) {
         System.out.print( name );
         System.out.print(",");
      }
   }
}
