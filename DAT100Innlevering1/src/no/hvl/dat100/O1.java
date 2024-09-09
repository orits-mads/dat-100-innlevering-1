package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O1 {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            String poeng = JOptionPane.showInputDialog("Skriv inn poengsum: ");
            int k = Integer.parseInt(poeng);

            if (k >= 0 && k <= 100) {
                
                String karakter;
                if (k <= 39) karakter = "F";
                else if (k <= 49) karakter = "E";
                else if (k <= 59) karakter = "D";
                else if (k <= 79) karakter = "C";
                else if (k <= 89) karakter = "B";
                else karakter = "A";
                
                JOptionPane.showMessageDialog(null, "Karakter: " + karakter);
                i++; 

            } else {
                JOptionPane.showMessageDialog(null, "Ugyldig poengsum. Prøv igjen.");

            }
        }
    }
}

