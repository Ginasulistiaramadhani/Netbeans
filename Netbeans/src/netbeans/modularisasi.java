//Tgl 25 oktober 2026
package netbeans;
public class modularisasi {
    public static void main (String[]args){
       String [][][] dataMahasiswa = new String[3][3][5];
        String[][][] data = {
           
            {
                {"Riska", "Firda", "Diana", "Domi", "Nanda"},
                {"Alif", "Risma", "Hadi", "Puspita", "Joko"},
                {"Amelia", "Andini", "Lala", "Maya", "Eko"}
            },
        {
            {"Nuril", "Oky", "Anita", "Ria", "Nia"},
            {"Melati", "Bunga", "Rakha", "Nisa", "Artha"},
            {"Paksi", "Ryan", "Tejo", "Dewi", "Lia"}
        },
        {
            {"Dian", "Tegar", "Bety", "Ika", "Nasywa"},
            {"Darendra", "Irfan", "Ridha", "Zahra", "Nabila"},
            {"Ardi", "Reva", "Wulan", "Rendra", "Elva"}
        }
    };
    for (int i = 0; i < 3; i++){
    System.out.println("Program Studi " +(i+1));
    for (int j = 0; j < 3; j++){
         System.out.print("Kelas HFR." +(j+1)+ " ");
     for (int k = 0; k < 5; k++){           
                System.out.print(data[i][j][k] + " ");
     }
        System.out.println();
                
    }
}
}
}
    
    

