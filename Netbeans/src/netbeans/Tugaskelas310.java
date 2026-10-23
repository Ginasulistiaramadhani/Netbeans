
package tugaskelas3.pkg10;
//no18
//tugas tgl 01 oktober 2026- 07 oktober 2026
public class Tugaskelas310 {

    public static void main(String[] args) {
        int[] penjualan = {25, 30, 18, 40, 35, 45, 50};
        for (int i = 0; i < penjualan.length; i++) {
}
int total = 0;
        int max = penjualan[0];
        int min = penjualan[0];
        int hariminimal30 = 0;

        for (int i = 0; i < penjualan.length; i++) {
            total += penjualan[i];
            
            if (penjualan[i] > max) {
                max = penjualan[i];
            }
            
            if (penjualan[i] < min) {
                min = penjualan[i];
            }
            
            if (penjualan[i] >= 30) {
                hariminimal30++;
            }
        }

        double rataRata = (double) total / penjualan.length;

        System.out.println("=================================");
        System.out.println("total penjualan     = " + total);
        System.out.println("penjualan tertinggi = " + max);
        System.out.println("penjualan terendah  = " + min);
        System.out.println("Rata-rata           = " + rataRata);
        System.out.println("Jumlah hari >= 30   = " + hariminimal30);
    
 }   
}



