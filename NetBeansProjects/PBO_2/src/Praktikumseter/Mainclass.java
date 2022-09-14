
package Praktikumseter;


public class Mainclass {

    
    public static void main(String[] args) {
        persegi_panjang p1 = new persegi_panjang();
        persegi_panjang p2 = new persegi_panjang();
        
        p1.setLebar(10);
        p1.setPanjang(20);
        
        p2.setLebar(5);
        p2.setPanjang(10);
        
        System.out.println(p1.hitung());
        System.out.println(p2.hitung());
    }  
}
