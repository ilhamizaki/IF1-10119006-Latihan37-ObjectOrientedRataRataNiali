/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Rata-rata nilai
 */
public class RataRataNilai {
    Scanner scanner = new Scanner(System.in);
    
    public double nilai;
    public int jmlhMhs;
    public double totalNilai;
    
    public void inputMahasiswa() {
        System.out.print("Masukkan Banyak Mahasiswa : ");
        jmlhMhs = scanner.nextInt();
    }
    
    public void inputNilai() {
        for(int i = 1; i <= jmlhMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scanner.nextInt();
            totalNilai += nilai;
        }
    }
    
   public double hitungRataRata() {
        return totalNilai / jmlhMhs;
    }
    
}
