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
public class Smartphone implements Pajak {
    private String vendor;
    private String tipe;
    private double harga;
//deklarasi
    public Smartphone(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }
//konstruktor 
    @Override
    public double hitungHargaSetelahPPN(double harga) {
        if (harga > 4500000) {
            return harga + (harga * 0.05); // PPN 5%
        } else if (harga > 4200000) {
            return harga + (harga * 0.02); // PPN 2%
        } else if (harga > 4000000) {
            return harga + (harga * PAJAK ); // PPN 1%
        } else {
            return harga; // Tanpa PPN
        }
    }
//kondisi diskon
    public void tampilkanHargaSetelahPPN() {
        double hargaSetelahPPN = hitungHargaSetelahPPN(this.harga);
        System.out.println("Harga smartphone " + vendor + " " + tipe + " setelah ditambah PPN: Rp " + hargaSetelahPPN);
    }
}

