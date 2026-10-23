
package praktikum2;
//ginasulistiaramadhani
import java.util.Scanner;
public class Praktikum2 {

   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
  
        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Menampilkan angka 1-10");
            System.out.println("2. Menampilkan bilangan genap");
            System.out.println("3. Menghitung jumlah 1-10");
            System.out.println("4. Menggambar segitiga bintang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    for (int i = 1; i <= 10; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Masukkan n: ");
                    int nGenap = input.nextInt();
                    for (int i = 1; i <= nGenap; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    int total = 0;
                    for (int i = 1; i <= 10; i++) {
                        total += i;
                    }
                    System.out.println("Jumlah total 1-10 adalah: " + total);
                    break;

                case 4:
                    System.out.print("Masukkan tinggi segitiga: ");
                    int tinggi = input.nextInt();
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

            if (pilihan == 5) {
                break;
            }

        } while (pilihan != 5);
    }
}
        
  
    

        
    

        

   

            
    

    