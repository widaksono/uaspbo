/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS2;

/**
 *
 * AGUS WIDAKSONO ( 22104410069 )
 * AGI PRANATA ( 22104410102 )
 * AWANDA SUCI M (22104413001 )
 * FATIKHATUL TRISNA A (22104410085 )
 * TERY TAOZAKA A ( 22104413002 )
 * 
 */
import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        int a = 100;
        int b = 25;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih operasi matematika:");
        System.out.println("1. a + b");
        System.out.println("2. a - b");
        int pilihan = scanner.nextInt();

        int hasil;

        switch (pilihan) {
            case 1:
                hasil = a + b;
                System.out.println("Hasil: " + hasil);
                break;
            case 2:
                hasil = a - b;
                System.out.println("Hasil: " + hasil);
                break;
            default:
                System.out.println("Pilihan Anda salah.");
        }
    }
}
