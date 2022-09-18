
package pbo_project;

public class Karyawan {
    //Atribut
    private String nik, bagian;
    private int kehadiran, gaji_per_hari, totalGaji;
    
    //Setter
    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public void setGaji_per_hari(int gaji_per_hari) {
        this.gaji_per_hari = gaji_per_hari;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    //Getter
    public String getNik() {
        return nik;
    }

    public String getBagian() {
        return bagian;
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public int getGaji_per_hari() {
        return gaji_per_hari;
    }

    public int getGaji() {
        return getKehadiran()* getGaji_per_hari();
        
    }
    
    public int getTotalGaji() {
        totalGaji = getGaji();
        return totalGaji;
    }
}
