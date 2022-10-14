package com.mycompany.uts;
import javax.swing.JOptionPane;

/**
 * Created by Indah Chania 21343026
 * @author Indah
 */
public class uts3 {
    public static void main(String[] args){
      String bilangan = "", message = "";
        int angka;

        bilangan = JOptionPane.showInputDialog("Masukkan Nilai : ");
        angka = Integer.parseInt(bilangan);

        if(angka >= 0) {
            message = angka + " merupakan bilangan POSITIF";
        }
        else if(angka < 0) {
            message = angka + " merupakan bilangan NEGATIF";
        }
        else{
            message = " Merupakan bilangan 0";
        }
        JOptionPane.showMessageDialog(null, message);
        System.out.println(message);
    }
   }