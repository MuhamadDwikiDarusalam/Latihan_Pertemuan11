/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la9.latihan3;

/**
 *
 * @author Dwiki
 * NAMA : MUHAMAD DWIKI DARUSALAM
 * NIM  : A2.1900111
 * KELAS TI-1A
 */
public class La9Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String str1, str2;  
 
 str1 = "Free the bound periodicals.";  
 
 str2 = str1;  
 
 System.out.println("String1: " + str1);  
 
 System.out.println("String2: " + str2);  
 
 System.out.println("Same object? " + (str1 == str2));  
 
 str2 = new String(str1);  
 
 System.out.println("String1: " + str1);  
 
 System.out.println("String2: " + str2);  
 
 System.out.println("Same object? " + (str1 == str2));  
 
 System.out.println("Same value? " + str1.equals(str2));
 }  
 
 } 

