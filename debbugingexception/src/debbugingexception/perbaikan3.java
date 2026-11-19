
package debbugingexception;
import java.util.Scanner; 
import java.util.InputMismatchException; 

public class perbaikan3 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        int[] nilai = new int[3];    
        System.out.println("=== Program Hitung Rata-Rata Nilai ===");
        for (int i = 0; i < 3; i++) {
            boolean inputValid = false;
            while (!inputValid) {
                try {
                    System.out.print("Masukkan nilai " + (i + 1) + ": ");
                    int nilaiInput = input.nextInt();
                    
                    if (nilaiInput < 0 || nilaiInput > 100) {
                        System.out.println("Error: Nilai harus antara 0 sampai 100. Silakan coba lagi.\n");
                    } else {
                        nilai[i] = nilaiInput; 
                        inputValid = true;     
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Input harus berupa bilangan bulat. Silakan coba lagi.\n");
                    input.next(); 
                }
            }
        }
        
        System.out.println("\n-----------------------------------");
        double rataRata = (nilai[0] + nilai[1] + nilai[2]) / 3.0;
        System.out.println("Rata-rata: " + rataRata);
        if (rataRata >= 75) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }
        input.close();
        System.out.println("Program selesai.");
    }
}

    



