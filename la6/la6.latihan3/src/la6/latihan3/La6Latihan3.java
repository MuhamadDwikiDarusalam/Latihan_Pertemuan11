/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la6.latihan3;

/**
 *
 * @author DWIKI
 * NAMA : MUHAMAD DWIKI DARUSALAM
 * NIM  : A2.1900111
 * KELAS: TI-1A
 */
public class La6Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String names[] = {"Beah", "Bianca", "Lance", "Belle",  
 
        "Nico", "Yza", "Gem", "Ethan"}; 
 
 
 
    String   searchName = "Yza"; 
 
   
 boolean  foundName = false; 
 
 
 
   
 for( int i=0; i< names.length; i++ ){ 
 
    
 if( names[i].equals( searchName )){ 
 
     
 foundName = true; 
 
     
 break;  
 
    
 }         
 }                    if( foundName ){ 
 
            System.out.println( searchName + " found!" ); 
 
   
 } 
 
   
 else{ 
 
            System.out.println( searchName + " not found." ); 
 
   
 } 
    }
    
}
