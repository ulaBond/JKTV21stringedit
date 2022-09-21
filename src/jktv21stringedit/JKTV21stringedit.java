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
        System.out.println("Kol simvolov " +str.length());
    }
    
}
