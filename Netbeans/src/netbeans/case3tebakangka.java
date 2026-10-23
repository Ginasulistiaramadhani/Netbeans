  import java.util.Random;
import java.util.Scanner;
public class case3tebakangka {
  

public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int angkaRahasia = rand.nextInt(100) + 1;
        int jumlahPercobaan = 0;
        
        for (int i = 1; i <= 7; i++) {
            System.out.print("Masukkan tebakan: ");
            int tebakan = input.nextInt();
            jumlahPercobaan++;
            
            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar");
            } else {
                System.out.println("Benar");
                break;
            }
        }
        
        System.out.println("Jumlah percobaan = " + jumlahPercobaan);
    }
}

}
