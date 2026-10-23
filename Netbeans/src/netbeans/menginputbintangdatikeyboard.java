
package praktikumperulangan;
import java.util.Scanner;
public class menginputbintangdatikeyboard {
    public static void main (String[]args){
     Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah BARIS: ");
        int totalBaris = input.nextInt();

        System.out.println("Masukkan jumlah KOLOM: ");
        int totalKolom = input.nextInt();

        System.out.println("\n--- Hasil Pola Bintang ---");
        
        for (int i = 1; i <= totalBaris; i++) {
            
            for (int j = 1; j <= totalKolom; j++) {
                System.out.print("*");
            }
            
             System.out.println();
        }
    }
}


