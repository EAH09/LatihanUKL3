/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanukl3;

/**
 *
 * @author erisa
 */
public class LatihanUKL3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sukuAwal = 10;
        int selisih = 5;
        int maxnilai = 80;
        int jumlahDeret =0;
        int sukuSaatIni;
        
        System.out.println("=====Deret Aritmatika=====");
        for(int i = 0; i <3; i++){
            for(int b =0; b<5; b++ ){
                
                sukuSaatIni = sukuAwal;
                sukuAwal += selisih;
                
                jumlahDeret += sukuSaatIni;
                
                
                System.out.print(" "+sukuSaatIni);
            }
            System.out.println(" ");
        }
        System.out.println("Total jumlah Deret Aritmatika adalah "+jumlahDeret);
        
        
            
        
        
                
    }
    
}
