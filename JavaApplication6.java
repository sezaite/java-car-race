/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author pavet
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] masinos = new int[8];
        boolean arPasiektasSimtas = false;
        int simtukaiCount = 0;
        while (simtukaiCount < 10) {
            while (!arPasiektasSimtas) {
                for (int i = 0; i < masinos.length; i++) {
                    int randomAtstumas = (int) (Math.random() * 10) + 1;
                    masinos[i] += randomAtstumas;
                    if (masinos[i] > simtukaiCount * 100 + 100) {
                        arPasiektasSimtas = true;
                        simtukaiCount++;
                    }
                }
            }
            arPasiektasSimtas = false;
            System.out.println("pasiekta " + simtukaiCount + "00 kilometru atkarpa!");
            for (int i = 0; i < masinos.length; i++) {
                for (int j = i + 1; j < masinos.length; j++) {
                    if (masinos[i] < masinos[j]) {
                        int temp = masinos[i];
                        masinos[i] = masinos[j];
                        masinos[j] = temp;
                    }
                }
                System.out.println(masinos[i]);
            }
        }
    }
}
