
package tugaskelas3.pkg8;
public class Tugaskelas38 {
//no16
//tugas tgl 01 oktober 2026- 07 oktober 2026
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 85, 70};
int cari = 90;
int posisi = -1;
for (int i = 0; i < nilai.length; i++) {
if (nilai[i] == cari) {
posisi = i;
break;
}
}
if (posisi != -1) {
System.out.println("Data ditemukan pada indeks " + posisi);
    }
    }
}
