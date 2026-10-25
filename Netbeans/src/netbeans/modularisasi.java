//Tgl 25 oktober 2026
package netbeans;
import java.util.Scanner;
public class modularisasi {
    static Scanner input = new Scanner(System.in);
    public static void main (String[]args){
        System.out.println("----------------------------------------------");
        System.out.println("=== PROGRAM PENDATAAN MAHASISWA (3D ARRAY) ===");
        System.out.println("-----------------------------------------------");

        int jumlahProdi = inputUkuranDimensi("Masukkan jumlah Program Studi: ");
        int jumlahKelas = inputUkuranDimensi("Masukkan jumlah Kelas per Prodi: ");
        int jumlahMahasiswa = inputUkuranDimensi("Masukkan jumlah Mahasiswa per Kelas: ");
        
        String[][][] dataMahasiswa = new String[jumlahProdi][jumlahKelas][jumlahMahasiswa];
        
        inputNamaMahasiswa(dataMahasiswa);
        tampilkanDataMahasiswa(dataMahasiswa);
        lakukanOperasiString(dataMahasiswa);
    }

    public static int inputUkuranDimensi(String pesan) {
        System.out.print(pesan);
        String inputBaris = input.nextLine();
        return Integer.parseInt(inputBaris); 
    }
    public static void inputNamaMahasiswa(String[][][] data) {
        System.out.println("===================================");
        System.out.println("--- Proses Input Nama Mahasiswa ---");
        System.out.println("===================================");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Prodi " + (i + 1));
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("  Kelas " + (j + 1));
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print("    Nama Mahasiswa ke-" + (k + 1) + ": ");
                    data[i][j][k] = input.nextLine();
                }
            }
        }
    }

    public static void tampilkanDataMahasiswa(String[][][] data) {
        System.out.println("######################################");
        System.out.println("------ Hasil Output Pendataan ------");
        System.out.println("######################################");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Prodi" + (i + 1)); 
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Kelas" + (j + 1) + " "); 
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print(data[i][j][k] + " "); 
                }
                System.out.println(); 
                        
            }
        }
    }
    public static void lakukanOperasiString(String[][][] data) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(" Analisis & Operasi String ---");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        if (data.length > 0 && data[0].length > 0 && data[0][0].length > 0) {
            String sampelNama = data[0][0][0]; 
            System.out.println("Contoh manipulasi Teks (String) pada nama '" + sampelNama + "':");
            System.out.println("1. Mengubah ke Huruf Kapital (toUpperCase) : " + sampelNama.toUpperCase());
            System.out.println("2. Menghitung Panjang Karakter (length)     : " + sampelNama.length() + " karakter");
            System.out.println("3. Cek Awalan Huruf 'A' (startsWith)        : " + sampelNama.toLowerCase().startsWith("a"));
        } else {
            System.out.println("Data kosong Tidak Ada yang di jadikan data.");
        }
    }
}
