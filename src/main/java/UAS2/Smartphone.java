/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS2;

/**
 *
 * @author AGUS WIDAKSONO ( 22104410069 )
 */
public class Smartphone implements Pajak {
    private String vendor;
    private String tipe;
    private double harga;

    public Smartphone(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    @Override
    public double hitungHargaSetelahPPN(double harga) {
        if (harga > 4500000) {
            return harga + (harga * 0.05); // PPN 5%
        } else if (harga > 4200000) {
            return harga + (harga * 0.02); // PPN 2%
        } else if (harga > 4000000) {
            return harga + (harga * 0.01); // PPN 1%
        } else {
            return harga; // Tanpa PPN
        }
    }

    public void tampilkanHargaSetelahPPN() {
        double hargaSetelahPPN = hitungHargaSetelahPPN(this.harga);
        System.out.println("Harga smartphone " + vendor + " " + tipe + " setelah ditambah PPN: Rp " + hargaSetelahPPN);
    }
}


//class Smartphone yang mengimplementasikan interface Pajak. Class ini harus memiliki constructor dengan tiga parameter (vendor, tipe, harga). Metode hitungHargaSetelahPPN akan menghitung harga smartphone setelah ditambahkan PPN berdasarkan aturan pajak yang telah diberikan.
