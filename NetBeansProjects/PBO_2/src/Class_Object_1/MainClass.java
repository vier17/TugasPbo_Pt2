package Class_Object_1;
public class MainClass {
    public static void main(String[] args) {
        // untuk akses class lain perlu membuat object (instance of class)
        //akses suara,tipe, dan usia
        Hewan burung = new Hewan();
        Hewan ikan = new Hewan();
        
        //akses method
        Burung b = new Burung();
        Ikan i = new Ikan();
        
        
        // Pengisian 
        burung.SetTipe("Burung hantu");
        burung.SetSuara("kuk kuk kuk");
        burung.SetUsia(1);
        
        ikan.SetTipe("Lumba Lumba");
        ikan.SetSuara("Blup blup");
        ikan.SetUsia(0);
        
        //cara ambil dari setter
        System.out.println("Aku "+burung.getTipe()+" Suara ku "+ burung.getSuara()+" Usia "+burung.getUsia()+".");
        b.terbang();
        
        System.out.println("Aku "+ikan.getTipe()+" Suara ku "+ ikan.getSuara()+" Usia "+ikan.getUsia()+".");
        i.berenang();
    }
    
}
