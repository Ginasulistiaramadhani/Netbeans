//tgl 29 okt 2026 
//StringBuilder  no 8
package netbeans;
import java.util.Scanner;
public class modularisasi2 {
        public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = input.nextLine();
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
            if (c != ' ') {
                sb.append(c);
            }
        }

        System.out.println("Hasil tanpa spasi      : " + sb.toString());
        input.close();
    }
}

    



