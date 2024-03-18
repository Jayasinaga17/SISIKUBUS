/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kubusapp;

/**
 *
 * @author ASUS
 */
import java.util.Scanner; // Import Scanner class untuk input

public class SisiKubusApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat instance Scanner untuk input

        System.out.println("Masukkan volume kubus:125cm pangkat 3 ");
        double volume = scanner.nextDouble(); // Membaca input volume

        KubusAPP kubus = new KubusAPP(volume); // Membuat objek kubus dengan volume yang diberikan

        // Menghitung dan menampilkan panjang sisi kubus
        System.out.printf("Panjang sisi kubus dari volume %.2f adalah: %.2f\n", volume, kubus.hitungSisiDariVolume());
    }
}

