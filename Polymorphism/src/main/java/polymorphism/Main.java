/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Jamiro Noor Zahran
 */
public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        Persegi p = new Persegi(5);
        Lingkaran ling = new Lingkaran(7);
       
        //memanggil method luas dan keliling
        bd.luas();
        bd.keliling();
       
        System.out.println("Luas Persegi = "+p.luas());
        System.out.println("Keliling Persegi = "+p.keliling());
        System.out.println("Luas Lingkaran = "+ling.luas());
        System.out.println("Keliling Lingkaran = "+ling.keliling());
    }
}
