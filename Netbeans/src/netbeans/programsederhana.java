package methoddikelas;
public class programsederhana {
    static double luaspersegipanjang(double panjang, double lebar){
        return panjang * lebar;
    }
    static void cetakhasil(double hasil){
        System.out.println(hasil );
    }
    public static void main(String[] args) {
       double luas = luaspersegipanjang(5,3);
       cetakhasil(luas);
    }
    
}
