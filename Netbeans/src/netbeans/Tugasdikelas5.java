
package tugasdikelas5;
import java.util.Scanner;

public class Tugasdikelas5 {

    public static void main(String[] args) {
        
         
    
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka perkalian");
        int angka = input.nextInt();
        for (int i=1; i <= 10; i++){
          int hasil = angka * i;
        System.out.println(angka + "x" + i + "=" +  hasil);
            
        }
        
    }
    
}
