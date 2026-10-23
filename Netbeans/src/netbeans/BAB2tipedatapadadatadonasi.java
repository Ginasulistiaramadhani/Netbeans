
package praktikum;
import java.util.Scanner;
public class BAB2tipedatapadadatadonasi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String nim;
        String kodeTransaksi;
        String nomorTelepon;
        int jumlahDonasi;
        
        System.out.print("Masukkan Nim : ");
        nim = input.next();
        
        System.out.print("Masukkan kode transaksi : ");
        kodeTransaksi = input.next();
        
        System.out.print("Masukkan nomor telepon  : ");
        nomorTelepon  = input.next();
        
         System.out.print("Masukkan jumlah donasi : ");
        jumlahDonasi = input.nextInt();
        
        System.out.println("=================================");
        System.out.println("nim             = " + nim);
        System.out.println("kode transaksi  = " + kodeTransaksi);
        System.out.println("nomor telepon   = " + nomorTelepon);
        System.out.println("jumlah donasi   = " + jumlahDonasi);
        
    
        
}
}