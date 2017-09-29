
package arraylinierlist;


public class Driver {
    public static void main(String [] args){
        ArrayLinierList a = new ArrayLinierList1();
        a.add(0,"a");
        a.add(1,"b");
        a.add(2,"c");
        a.add(3,"d");
        a.add(4,"e");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.element[i]);
        }
        System.out.println("panjang array adalah : "+a.size());
        System.out.println("panjang elemen sebelum di trim : "+a.capacity);
        a.trimToSize();
        System.out.println("panjang elemen setelah di trim : "+a.capacity);
        a.setSize(6);
        System.out.println("ukuran elemen di set menjadi: " +a.element2.length);
        a.clear(3);
        System.out.println("Tampilan setelah index 1 dihapus :");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.element[i]);
        }
    }
}
