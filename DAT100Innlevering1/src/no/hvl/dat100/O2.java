package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O2 {

    public static void main(String[] args) {

        String lønn = JOptionPane.showInputDialog("Skriv inn lønn: ");
        int k = Integer.parseInt(lønn);

        if (k < 208050) {
            JOptionPane.showMessageDialog(null, "Du betaler ikke trinnskatt");

        } else if (208051 <= k && k < 292850) {
            double skatt = k * 0.017;
            JOptionPane.showMessageDialog(null, "Du betaler 1,7 % trinnskatt, som tilsvarer " + skatt + " kr");

        } else if (292851 <= k && k < 670000) {
            double skatt = k * 0.04;
            JOptionPane.showMessageDialog(null, "Du betaler 4,0 % trinnskatt, som tilsvarer " + skatt + " kr");

        } else if (670001 <= k && k < 937900) {
            double skatt = k * 0.136;
            JOptionPane.showMessageDialog(null, "Du betaler 13,6 % trinnskatt, som tilsvarer " + skatt + " kr");

        } else if (937901 <= k && k < 1350000) {
            double skatt = k * 0.166;
            JOptionPane.showMessageDialog(null, "Du betaler 16,6 % trinnskatt, som tilsvarer " + skatt + " kr");

        } else if (1350001 <= k) {
            double skatt = k * 0.176;
            JOptionPane.showMessageDialog(null, "Du betaler 17,6 % trinnskatt, som tilsvarer " + skatt + " kr");
        } 
    }
}

