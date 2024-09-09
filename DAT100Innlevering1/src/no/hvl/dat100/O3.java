package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O3 {
    
    public static void main(String[] args) {

        String n = JOptionPane.showInputDialog("Skriv inn et tall: ");
        int k = Integer.parseInt(n);

        if (k < 0) {
            JOptionPane.showMessageDialog(null, "Tallet er ikke positivt");  // Sjekker om tallet er positivt.
        } else {
            JOptionPane.showMessageDialog(null, "Fakulteten til " + k + " er " + fakultet(k));    // Viser hva fakultetet til n er.
        }

    }

    private static int fakultet(int k) {        // Lager metode for å finne fakultetet.
        int fakultet = 1;
        for (int i = 1; i <= k; i++) {
            fakultet *= i;   // Regner ut fakultetet med *= 
        }
        return fakultet;
    }

}
