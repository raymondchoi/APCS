/**
 * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
 *  The purpose of the program is to convert the input (Base 10 System) to a Base system defined by the user. 
 * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
 *  About Base 10 Converter 
 *      @author Raymond Choi
 *      @version 1.0
 *      @since 2018 - 11 - 8
 * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-[SIDENOTE]-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
 *  To be honest, I wasn't sure how to create this program using sentinal values, however, the program functions as it should without the need of a sentinal value.
 * All the '-=-=-' junk is just me trying to be fancy. You may remove them if you want haha. 
 * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
 */
package base10converter.v1;

import java.util.*; //imports all libraries from 'java.util'. I was too lazy to import the scanner only. I don't really see the problem with using this method though.  
//import java.util.Scanner;    <-- Here's the sub-library from 'java.util.' 
public class Base10ConverterV1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                     //Initiallizes the Scanner utility.
        int decimal, remainder, base;                               //Declares Decimal, Remainder and base variable.
        char[] charDecimal = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Z'}; //Declares all of the characters used in the base system.
        String newValue = "";
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("     Input the base you would like to convert to.    ");    //Asks user for the base you want to convert to.
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        base = input.nextInt();
        
        if (base > 36){
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("  Error: This number is greater than 36! Try again.  ");    //Checks if the base user wants to convert to is greater than 36.
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.exit(1);
        }
        else if (base < 2) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("      Error: This base is less than 2! Try again.    ");    //Checks if the base user wants to convert is less than 2.
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.exit(1);
        }
        else{    
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");    
        System.out.println("  Input a base 10 number to be converted into a base " +  base  + " value: ");  //Asks user for a number in base 10 to be inputed for conversion. 
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        decimal = input.nextInt();
        
            while (decimal > 0){
                remainder = decimal%base;
                newValue = charDecimal [remainder] + newValue;                              //Simply converts the base 10 number to be outputted. 
                decimal = decimal/base;
            }
        }
            
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println ("Your base " + base + " number is: " + newValue);               //Here's your result! :D 
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
    
    }
}
