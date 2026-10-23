
package praktikumperulangan;

public class PRAKTIKUM7breakdancontinu {
    public static void main(String[]args){
        
        System.out.println("=== 1. Contoh Kasus BREAK ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; 
            }
            System.out.print(i + " ");
        }
        
        System.out.println("\n\n=== 2. Contoh Kasus CONTINUE ===");
         for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; 
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


