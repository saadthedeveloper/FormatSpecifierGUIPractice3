/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formatspecifierpractice;

/**
 *
 * @author MKAY
 */
public class FormatSpecifierPractice {

    public static void main(String[] args) {
        
        double number1 = 12.542;
        double number2 = 132.2459;
        double number3 = 11.4599;
        double number4 = 154.239;
        double number5 = 76.289329;
        double number6 = 82.2322899;
        double number7 = 432.252899;
        double number8 = 2.284399;
        double number9 = 62.32899;
        double number10 = 1233454.772899;
        
        System.out.printf("%10.3f\n", number1);
        System.out.printf("%10.3f\n", number2);
        System.out.printf("%10.3f\n", number3);
        System.out.printf("%10.3f\n", number4);
        System.out.printf("%10.3f\n", number5);
        System.out.printf("%10.3f\n", number6);
        System.out.printf("%10.3f\n", number7);
        System.out.printf("%-8.3f\n", number8);   //minus sign used to left justify
        System.out.printf("%010.3f\n", number9);  //0 flag  used
        System.out.printf("%,10.3f\n", number10); //comma flag used
        
    }
}
