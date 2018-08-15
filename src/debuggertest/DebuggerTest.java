/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debuggertest;

import java.util.Scanner;

/**
 *
 * @author Daniel Lundberg
 */
public class DebuggerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        writeMenu();
        int n = getNumber();
        double harmoniskaSerien = calcHarmonicSerie(n, true);
        System.out.println(String.format("Den harmoniska serien är %f.", harmoniskaSerien));
    }
    
    public static void writeMenu(){
        System.out.println("##############################");
        System.out.println("#                            #");
        System.out.println("#      Harmoniska serien     #");
        System.out.println("#                            #");
        System.out.println("##############################");
        
    }

    public static double calcHarmonicSerie(int n, boolean showStep) {
        double harmoniskaSerien = 0;
        for (int i = 1; i <= n; i++) {
            harmoniskaSerien += 1 / (double) i; //typomvandla
            if (showStep) {
                System.out.println(String.format("n: %d, h: %f", i, harmoniskaSerien));
            }
        }
        return harmoniskaSerien;
    }

    public static int getNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ange n: ");
        return input.nextInt();

    }
}
