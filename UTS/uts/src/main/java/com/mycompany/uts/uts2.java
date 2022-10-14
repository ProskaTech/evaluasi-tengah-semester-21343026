
package com.mycompany.uts;

/**
 * Created by Indah Chania 21343026
 * @author Indah 
 */
import java.util.Scanner;

public class uts2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int tinggi_segitiga,i,j,k;
        
        System.out.println("Masukkan Jumlah Baris =");
        tinggi_segitiga = input.nextInt();
        
        System.out.println();
        for(i=0; i<=tinggi_segitiga; i++){
            
           for(j=1; j<=i; j++){
               System.out.print(" ");
           }
           for (k=1; k<=tinggi_segitiga-i; k++){
               System.out.print(" #");
           }
           System.out.println();
        }
        for(i=1; i<=tinggi_segitiga; i++){
            
           for(j=1; j<=tinggi_segitiga-i; j++){
               System.out.print(" ");
           }
           for (k=1; k<=i; k++){
               System.out.print(" *");
           }
           System.out.println();
    }
    }
}