/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UAS2;

/**
 *
 * @author AGUS WIDAKSONO ( 22104410069 )
 */
public interface Pajak {
    double PAJAK = 0.01; // 1% untuk harga > Rp 4,000,000.00

    double hitungHargaSetelahPPN(double harga);
}

