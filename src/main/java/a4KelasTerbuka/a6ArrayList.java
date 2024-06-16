package a4KelasTerbuka;

import java.util.ArrayList;

public class a6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> buah = new ArrayList<>();
        
        System.out.println("Menambahkan element");
        //add by value
        buah.add("jambu");
        buah.add("apalah");
        System.out.println(buah);
        System.out.println("ukuran memori : " + buah.size());
        //add by index
        buah.add(0, "Index 0 ditambahkan");
        System.out.println(buah);
        buah.add(1, "index 1 ditambahkan");
        System.out.println(buah);
        System.out.println("ukuran memori : " +buah.size());
        
        System.out.println("--------------------");
        System.out.println("Mengambil element");
        //get by index
        System.out.println(buah.get(0));
        
        System.out.println("-------------------");
        System.out.println("Mengubah element");
        buah.set(0, "Index 0 diubah");
        buah.set(1, "Index 1 diubah");
        System.out.println(buah);
       
        System.out.println("----------------------");
        System.out.println("Remove element by index");
        //remove by index
        System.out.println("remove by index");
        buah.remove(0);
        System.out.println(buah);
        System.out.println("ukuran memori : " +buah.size());
        //remove by value
        System.out.println("remove by value");
        buah.remove("Index 1 diubah");
        System.out.println(buah);
        System.out.println("ukuran memori : " +buah.size());
        System.out.println("remove all elements");
        buah.clear();
        System.out.println(buah);
        System.out.println("ukuran memori : " +buah.size());
        System.out.println("Note : ukuran memori maksudnya jumlah index");
        
    }

}
