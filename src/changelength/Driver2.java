package changelength;
public class Driver2 {
    public static void main(String[] args) {
        Object [][] data = {
            {"Mata", "Kuliah", "Algoritma"},{"Satya", "Darma", "Bakti"},{"perusahaan", "Kontraktor", "Bangkrut"}}; 
    Object [][] f = ChangeLength.changeLength2d(data, 6, 3);
        
    System.out.println("Panjang   : "+f.length);
    System.out.println("Panjang2 : "+f[0].length);
    for(Object[] ganti2 : f){
        for(int i = 0; i < f[0].length; i++){
            System.out.println(ganti2[i]);
        }
        System.out.println();
    }    
    }
}

