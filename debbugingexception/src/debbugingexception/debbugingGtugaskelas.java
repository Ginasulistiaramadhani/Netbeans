//tugas tgl 11 Nov
package debbugingexception;
import java.util.Scanner;
public class debbugingGtugaskelas {
    Scanner input = new Scanner(System.in);
    public static int hitungTotal(int jumlahLembar, int hargaPerLembar) {
        return jumlahLembar * hargaPerLembar;
    }
    public static int hitungDiskon(int totalHarga, double persentaseDiskon) {
        return (int) (totalHarga + (totalHarga * persentaseDiskon)); 
    }
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah lembar fotokopi: ");
        int lembar = input.nextInt();
        System.out.print("Masukkan harga per lembar: ");
        int harga = input.nextInt();
        int totalAwal = hitungTotal(lembar, harga);
        System.out.print("Masukkan pembagi rasio promo (angka): ");
        int pembagi = input.nextInt();
        int bonusRasio = 100 / pembagi; 
        double diskonPersen = 0.10; // Diskon 10%
        int potongan = hitungDiskon(totalAwal, diskonPersen);
        int totalAkhir = totalAwal - potongan;
        System.out.println("Total Awal: Rp " + totalAwal);
        System.out.println("Potongan Diskon: Rp " + potongan);
        System.out.println("Total Akhir yang Dibayar: Rp " + totalAkhir);
    }
}


