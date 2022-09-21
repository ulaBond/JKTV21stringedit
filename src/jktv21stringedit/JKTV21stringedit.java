/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21stringedit;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV21stringedit {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-----------Строки в Java 2----------");
        System.out.println("Vvedite text: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        do{        
            System.out.println("0. Out of programm");
            System.out.println("1. Vvesti kol simvolov");
            System.out.println("2. Vvesti kol slov");
            System.out.println("3. Nayti slovo v stroke");
            System.out.println("4. Zamenit ukazannoe slovo v stroke");
            System.out.println("Vyberite nomer funkcii: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            if(number == 0){
                break;
            }else if(number == 1){
                System.out.println("Vy vybrali punkt "+number);
                System.out.println("Kol simvolov " +str.length());
            }else if(number == 2){
                System.out.println("Vy vybrali punkt "+number);
                String[] words = str.split(" ");
                System.out.println("Kol slov " + words.length);
            }else if(number == 3){
                System.out.println("Vy vybrali punkt "+number);
                System.out.println("Kakoe slovo nayti:  ");
                String subStr = ;
                int index = str.indexOf(subStr);
                System.out.println("Ykazannoe slovo nahoditsya na  "+str.indexOf(subStr)+" stroke");
            }
        }
    }
}
