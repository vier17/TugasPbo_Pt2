
package Class_Object_2;


public class Samsung {
    //atribut 
    private int harga,jumlah,total;
    
    //setter 
    public void setHarga(int h){
        harga=h;
    }
    public void setJumlah(int j){
        jumlah=j;
    }
    //getter
    public int getHarga(){
        return this.harga;
    }
    public int getJumlah(){
        return this.jumlah;
    }
    // Custom method
    
    public int getBeli(){
        total=getHarga()*getJumlah();
        return total;
    }
    
}
