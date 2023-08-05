/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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

public interface Pajak {
    double PAJAK = 0.01; // 1% untuk harga > Rp 4,000,000.00

    double hitungHargaSetelahPPN(double harga);
}

