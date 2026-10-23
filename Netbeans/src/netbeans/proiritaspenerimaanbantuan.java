
package praktikum;

public class proiritaspenerimaanbantuan {
    public static void main(String[]args){
        double ipk = 3.65;
        int penghasilan = 2500000;
        int tanggungan = 4;
        boolean aktifSosial = true;
        boolean beasiswaLain = false;
    if (ipk >= 3.50 && penghasilan <= 3000000 && tanggungan >= 3 && !beasiswaLain) {
        System.out.println("Prioritas Utama");
    } else if (ipk >= 3.00 && penghasilan <= 5000000 && !beasiswaLain) {
      System.out.println("Prioritas Kedua");
    } else if (aktifSosial && ipk >= 2.75 && !beasiswaLain) {
      System.out.println("Pertimbangan Khusus");
    } else {
      System.out.println("Belum Memenuhi Prioritas");
    }

}
}