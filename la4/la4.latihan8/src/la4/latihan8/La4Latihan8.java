/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la4.latihan8;

/**
 *
 * @author DWIKI
 * NAMA : MUHAMAD DWIKI DARUSALAM
 * NIM  : A2.1900111
 * KELAS: TI-1A
 */
public class La4Latihan8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String   status = "";   
         int grade = 80;       
         //mendapatkan status pelajar    
         status = (grade >= 60)?"Passed":"Fail"; 
 
   //print status    
   System.out.println( status );
    }
    
}
