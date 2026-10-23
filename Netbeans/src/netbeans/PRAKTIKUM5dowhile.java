
package praktikumperulangan;
import java.util.Scanner;
public class PRAKTIKUM5dowhile {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        int angka;

        // Blok kode di dalam 'do' PASTI dijalankan minimal 1 kali
        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = input.nextInt();
            System.out.println("Anda memasukkan: " + angka);
        } while (angka != 0); // Mengecek kondisi di AKHIR

        System.out.println("Program selesai.");
    }
}
