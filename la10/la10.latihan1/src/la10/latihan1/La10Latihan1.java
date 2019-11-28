/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la10.latihan1;

/**
 *
 *@author Dwiki
 * NAMA : MUHAMAD DWIKI DARUSALAM
 * NIM  : A2.1900111
 * KELAS TI-1A
 */
public class La10Latihan1 {

    /**
     * @param args the command line arguments
     */
  public class studentRecord
     {  
         
 
 private String name;  
 
 private String address;  
 
 private int age;  

 private double mathGrade;  
 
 private double englishGrade;  
 
 private double scienceGrade;  
 
 private double average;  
 
 private static int studentCount;  
 
 /**  
 
 * Menghasilkan nama dari Siswa  
 
 */ 
  public String getName(){  
 
 return name;  
 
 }  
   public void setName( String temp ){  
 
 name = temp;  
 
 } 
    /**  
 
 * Menghitung rata – rata nilai Matematik, Bahasa Inggris, * * Ilmu  
 
 Pasti  
 
 */  
 
    public double getAverage(){  
 
 double result = 0;  
 
 result = ( mathGrade+englishGrade+scienceGrade )/3;  
 
 return result;  
 
 }  
  /**  
 
 * Menghasilkan jumlah instance StudentRecord  
 
 */  
  public static int getStudentCount(){  
 
 return studentCount;  
 
 }  
 
 }  
 
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
