/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kubusapp;

/**
 *
 * @author ASUS
 */
public class KubusAPP {
    private double volume; // Volume kubus

    // Konstruktor
    public KubusAPP(double volume) {
        this.volume = volume;
    }

    // Metode untuk menghitung sisi kubus dari volume
    public double hitungSisiDariVolume() {
        return Math.cbrt(volume); // Menggunakan akar kubik untuk menghitung sisi
    }
}


