/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan_inheritance;

/**
 *
 * @author Jamiro Noor Zahran
 */
public class habitatdarat extends Hewan_inheritance
{
    String makan;
   
    public void pemakan (String makanan)
    {
        makan=makanan;
        System.out.println ("Makanannya : " +makan);
    }
}
