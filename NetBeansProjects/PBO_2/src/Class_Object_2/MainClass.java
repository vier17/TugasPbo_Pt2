
package Class_Object_2;

import java.io.*;
public class MainClass {


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (
        new InputStreamReader (System.in));
        
        Handphone hp = new Handphone();
        Samsung samsung = new Samsung();
        
       try {
           do{
               System.out.println("Toko Hp");
               System.out.println("1.Input Data hp");
               System.out.println("2.Beli Hp");
               System.out.println("3.keluar Aplikasi");
               System.out.print("Pilih menu : ");
               int pilih = Integer.parseInt(br.readLine());
               
               switch (pilih){
                   case 1:
                       System.out.println("--isi data--");
                       System.out.print("Tipe : ");
                       hp.setTipe(br.readLine());
                       System.out.print("warna : ");
                       hp.setWarna(br.readLine());
                       System.out.print("Kapsitas : ");
                       hp.setKapasitas(br.readLine());
                       System.out.print("Harga : ");
                       samsung.setHarga(Integer.parseInt(br.readLine()));
                       System.out.println("");
                       break;
                   case 2:
                       System.out.println("--Beli Hp--");
                       System.out.print("Jumlah beli : ");
                       samsung.setJumlah(Integer.parseInt(br.readLine()));
                       System.out.println("Total bayar : "+samsung.getBeli());
                       System.out.println(" ");
                       break;
                   case 3:
                       System.exit(0);
               }
           }while (true);
           
       }catch(Exception e) {
           System.out.println("Inputan anda salah");
       }
    }
    
}
