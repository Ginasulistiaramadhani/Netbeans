
package praktikum;
import java.util.Scanner; 
public class BAB3distribusiberas {
    public static void main(String[] args) {
        int jumlahKeluarga = 347;
        int totalBeras = 1250;
        int berasPerKeluarga = totalBeras / jumlahKeluarga;
        int sisaBeras = totalBeras % jumlahKeluarga;
    System.out.println("Beras per keluarga: "+ berasPerKeluarga + " kg");
    System.out.println("Sisa beras: " + sisaBeras +" kg");
}
}