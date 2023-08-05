/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS2;

/**
 *
 * 
 * AGUS WIDAKSONO ( 22104410069 )
 * AGI PRANATA ( 22104410102 )
 * AWANDA SUCI M (22104413001 )
 * FATIKHATUL TRISNA A (22104410085 )
 * TERY TAOZAKA A ( 22104413002 )
 * 
 */
public class Main {
    public static void main(String[] args) {
        Smartphone samsung = new Smartphone("Samsung", "A 51", 5000000.0);
        samsung.tampilkanHargaSetelahPPN();

        Smartphone oppo = new Smartphone("Oppo", "Reno 5", 4400000.0);
        oppo.tampilkanHargaSetelahPPN();

        Smartphone xiaomi = new Smartphone("Xiaomi", "A1", 4100000.0);
        xiaomi.tampilkanHargaSetelahPPN();
    }
}


//Penjelasan:
//
//Interface Pajak mendefinisikan variabel konstan PAJAK dengan nilai 0.01, yang merepresentasikan 1% untuk PPN.
//Class Smartphone mengimplementasikan interface Pajak dan mengoverride metode hitungHargaSetelahPPN berdasarkan aturan pajak yang telah diberikan. 
//Metode tampilkanHargaSetelahPPN menampilkan harga setiap smartphone setelah ditambahkan PPN.
