/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;
import tugas1.Konversi;
/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int celcius;
        int option;
        boolean choose = true;
        
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("GILANG PAPPA' TANTO PAMBUA");
        System.out.println("123200027");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius : ");
        celcius = input.nextInt();
        
        Konversi dataSuhu = new Konversi(celcius);
        
        do{
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            option = input.nextInt();

                if(option==1){
                    dataSuhu.save();
                }
                else if(option==2){
                    System.out.println("Input Data");
                    System.out.println("----------");
                    System.out.print("Suhu Dalam Celcius : ");
                    dataSuhu.celcius=input.nextInt();
                }
                else if(option==3){
                    System.exit(0);
                }
                else{
                    System.out.println("Opsi tidak ada, mohon masukkan opsi dengan benar");
                    choose=true;
                } 
        }
        while(choose=true);
          
    }
    
}
