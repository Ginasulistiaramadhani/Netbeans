
package praktikumperulangan;
import java.util.Scanner;
public class PRAKTIKUM6perulanganpencabangan {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int angka;
        int jumlahlulus =0;
        int jumlahtidaklulus=0;
        double totalnilai=0;
        for (int i = 1; i <= 5; i++) {

            System.out.print(
                "Masukkan nilai mahasiswa ke-" + i + ": "
            );
            

            int nilai = input.nextInt();
                 totalnilai += nilai;
            if (nilai >= 75) {
                System.out.println("Status: Lulus");
                jumlahlulus++;
            } else {
                System.out.println("Status: Tidak Lulus");
                jumlahtidaklulus++;
            }

            }
         double ratarata = totalnilai / 5;
         System.out.println("--------------------------------");
         System.out.println("jumlah mahasiswa yang lulus adalah : "+ jumlahlulus );
         System.out.println("jumlah mahasiswa yang tidak lulus adalah : "+ jumlahtidaklulus);
         System.out.println("Jumlah rata rata mahasisawa : "+ ratarata);
         System.out.println("*********************************");
    }
    }

