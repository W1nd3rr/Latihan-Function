
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pavilion
 */
public class soal2 {
    public static void main(String[] args) {
        int a,b;
    Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Bilangan pertama ");
        a = input.nextInt();
        System.out.println("Masukkan bilangan kedua ");
        b= input.nextInt();
    }
    public static void contoh (int a,int b){
        int hasil = 0;
        if (a>b){
            hasil = a;
        }
        else {
            hasil = b;
        }
        System.out.println(hasil);
    }
}
