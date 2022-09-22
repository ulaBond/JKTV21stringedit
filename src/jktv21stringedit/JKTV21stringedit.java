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
        OUTER:        
        do {
            System.out.println("0. Out of programm");
            System.out.println("1. Vvesti kol simvolov");
            System.out.println("2. Vvesti kol slov");
            System.out.println("3. Nayti slovo v stroke");
            System.out.println("4. Zamenit ukazannoe slovo v stroke");
            System.out.println("Vyberite nomer funkcii: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 0:
                    break OUTER;
                case 1:
                    System.out.println("Vy vybrali punkt "+number);
                    System.out.println("Kol simvolov " +str.length());
                    break OUTER;
                case 2:
                    System.out.println("Vy vybrali punkt "+number);
                    String[] words = str.split(" ");
                    System.out.println("Kol slov " + words.length);
                    break OUTER;
                case 3:
                    {
                        System.out.println("Vy vybrali punkt "+number);
                        System.out.println("Kakoe slovo nayti:  ");
                        String subStr = scanner.nextLine();
                        int index = str.indexOf(subStr);
                        if(index < 0){
                            System.out.println("Takogo slova net.");
                        }else{
                            index++;
                            System.out.println("Ukazannoe slovo nahoditsya na "+index+" pozicii.");
                        }       break OUTER;
                    }
                case 4:
                    {
                        System.out.println("Vy vybrali punkt "+number);
                        System.out.println("Ukazite slovo dlya zameny:  ");
                        String subStr = scanner.nextLine();
                        int index = str.indexOf(subStr);
                        if(index < 0){
                            System.out.println("Takogo slova net.");
                        }else{
                            System.out.println("Kakim slovom zamenit?  ");
                            String replaceStr = scanner.nextLine();
                            System.out.println("Ispravlennaya stroka:  "+str.replace(subStr, replaceStr));
                        }       break OUTER;
                    }
                default:
                    break;
            }
            System.out.println("******************");
                    } while (true);
        System.out.println("Poka");
    }
}
