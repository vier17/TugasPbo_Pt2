package pbo_project;

import java.io.*;

public class MainClassKampus {

    public static void main(String[] args) {
     BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        Karyawan kr = new Karyawan();
        Mhs mhs = new Mhs ();
        UnDika undika = new UnDika ();
        try {
            
          do { 
              System.out.println("--MENU UTAMA--");
              System.out.println("1. Cek SPP Mahasiswa");
              System.out.println("2. Cek Gaji Karyawan");
              System.out.println("3. Keluar Aplikasi");
              System.out.print("input : ");
              int pilih = Integer.parseInt (r.readLine ());
              switch (pilih){
            case 1:
                      System.out.println("-- Cek SPP Mahasiswa --");
                      System.out.println("Nim: ");
                      mhs.setNim (r.readLine ());
                      System.out.print("Prodi: ");
                      mhs.setProdi (r.readLine ());
                      System.out.print("Angkatan: ");
                      mhs.setAngkatan (Integer.parseInt(r.readLine ()));
                      System.out.print("Semester: ");
                      mhs.setSemester (Integer.parseInt(r.readLine ()));
                      System.out.print("Total Bayar SPP: " + mhs.getSpp());
                      
                      break;
            case 2:
                      System.out.println("-- Cek Gaji Karyawan --");
                      System.out.println("Nik: ");
                      kr.setNik (r.readLine ());
                      System.out.print("Bagian: ");
                      kr.setBagian (r.readLine ());
                      System.out.print("Gaji Per hari: ");
                      kr.setGaji_per_hari (Integer.parseInt(r.readLine ()));
                      System.out.print("Kehadiran: ");
                      kr.setKehadiran (Integer.parseInt(r.readLine ()));
                      System.out.println("Total Gaji: " + kr.getGaji());
                      
                      break;
                  case 3:
                      System.exit(0);
                      }
          }while (true);
              
              
          }catch (Exception e) {
                System.out.println("Inputan salah");
        }
    }
    }

