/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la6.latihan1;

/**
 *
 * @author DWIKI
 * NAMA : MUHAMAD DWIKI DARUSALAM
 * NIM  : A2.1900111
 * KELAS: TI-1A
 */
public class La6Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          double grade = 92.0;  
 
 
 
        if( grade >= 90 ){  
 
               System.out.println( "Excellent!" ); 
                }  
 
        else if( (grade < 90) && (grade >= 80)){  
 
               System.out.println("Good job!" );  
 
        }  
 
        else if( (grade < 80) && (grade >= 60)){  
 
               System.out.println("Study harder!" );  
 
        }  
 
        else{                
            System.out.println("Sorry, you failed.");
        }
    }
    
}
