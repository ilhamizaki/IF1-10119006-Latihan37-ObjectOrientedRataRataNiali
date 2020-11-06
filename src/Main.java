/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Main Rata-rata nilai
 */
public class Main {
    public static void main(String[] args) {
        RataRataNilai nilaiMhs = new RataRataNilai();     
        nilaiMhs.inputMahasiswa();
        nilaiMhs.inputNilai();
        
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " + nilaiMhs.hitungRataRata());
        System.out.println("Developed by : Ilham Zaki");
    }
}
