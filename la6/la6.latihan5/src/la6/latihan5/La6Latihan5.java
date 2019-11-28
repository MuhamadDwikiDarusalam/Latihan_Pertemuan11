/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la6.latihan5;

/**
 *
 * @author DWIKI
 * NAMA : MUHAMAD DWIKI DARUSALAM
 * NIM  : A2.1900111
 * KELAS: TI-1A
 */
public class La6Latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           String names[] = {"Beah", "Bianca", "Lance", "Beah"}; 
 
      int count = 0; 
 
 
               for( int i=0; i<names.length; i++ ){ 
 
 
                 if( !names[i].equals("Beah") ){ 
 
        continue; //skip next statement 
 
       } 
 
 
 
       count++; 
 
      } 
 
 
 
      System.out.println("There are " + count + " Beahs in the list");
    }
    
}
