package praktikum;
public class BAB1efisiensiairwudhu {

    public static void main(String[] args) {
       int jumlahMahasiswa = 30;
       int jumlahWudhu = 2;
       double airPerWudhu = 15;
       double persentasePenghematan = 0.15;
       double totalAir = jumlahMahasiswa * jumlahWudhu * airPerWudhu;
       double airHemat = totalAir * persentasePenghematan;
       double totalSetelahHemat = totalAir - airHemat;
    System.out.println("Total sebelum penghematan: " + totalAir + "L ");
    System.out.println("Air yang dihemat: " + airHemat + "L");
    System.out.println("Total setelah penghematan: " + totalSetelahHemat +"L");
}
    }
    

