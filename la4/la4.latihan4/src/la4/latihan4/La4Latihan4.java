/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la4.latihan4;

/**
 *
 * @author DWIKI
 * NAMA : MUHAMAD DWIKI DARUSALAM
 * NIM  : A2.1900111
 * KELAS: TI-1A
 */
public class La4Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int  i  = 0;    
         int  j  = 10;    
         boolean test= false; 
          //demonstrasi &&   
          test = (i > 10) && (j++ > 9);    
          System.out.println(i);    
          System.out.println(j);    
          System.out.println(test); 
          
           //demonstrasi &   
           test = (i > 10) & (j++ > 9);   
           System.out.println(i);   
           System.out.println(j);    
           System.out.println(test); 
    }
    
}
