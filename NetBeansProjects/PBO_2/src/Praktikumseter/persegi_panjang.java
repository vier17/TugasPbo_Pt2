
package Praktikumseter;


public class persegi_panjang {
    private int panjang,lebar,hitung;
    
    //setter
   
    public void setPanjang(int p){
        this.panjang = p;
    }
    public void setLebar(int l){
        this.lebar = l;
    }
    public int getPanjang (){
        return this.panjang;
    }
    public int getLebar (){
        return this.lebar;
    }
    public int hitung (){
        hitung=getPanjang()*getLebar();
        return hitung;
    }
    
}
