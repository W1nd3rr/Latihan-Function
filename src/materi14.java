
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
public class materi14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,hasil;
    Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Bilangan pertama ");
        a = input.nextInt();
        System.out.println("Masukkan bilangan kedua ");
        b= input.nextInt();
        hasil = output(a,b);
        System.out.println(hasil);
    }
    public static int output (int a,int b){
       // int hasil = 0;
        if (a>b){
            return a;
        }
        else{
           return b;
        }
        
    }
}
