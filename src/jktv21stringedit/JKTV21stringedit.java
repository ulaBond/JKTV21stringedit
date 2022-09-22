/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21stringedit;

import java.util.HashSet;
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
            System.out.println("1. Vyvesti kol simvolov");
            System.out.println("2. Vyvesti kol slov");
            System.out.println("3. Nayti slovo v stroke");
            System.out.println("4. Zamenit ukazannoe slovo v stroke");
            System.out.println("Vyberite nomer funkcii: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 0:
                    break OUTER;
                case 1://ne schitat probely i znaki prepinaniya
                    System.out.println("Vy vybrali punkt "+number);
                    int count = 0;
                    char[] chars = {'a', 'b', 'c', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
                    HashSet set = new HashSet();
                    for (int i = 0; i < chars.length; i++){
                        //if(str.charAt(i) != ' ') count++;
                        set.add(chars[i]);
                    }
                    String strInLowerCase = str.toLowerCase();
                    for (int i = 0; i < strInLowerCase.length(); i++){
                        //if(str.charAt(i) != ' ') count++;
                        if(set.contains(strInLowerCase.charAt(i))) count++;
                    }
                    System.out.println("Kol simvolov " +count);
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
