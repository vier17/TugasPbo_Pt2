
package Class_Object_1;

public class Hewan {
    //Atribut
    private String tipe,suara;
    private int usia;
    
    //setter
public void SetTipe(String t){
    tipe = t;
    
}
public void SetSuara(String suara){
    this.suara=suara;
}
public void SetUsia(int usia){
    this.usia=usia;
}


    //getter
    //getter biasanya tidak memiliki parameter karena langsung mengambil data dari setter

public String getTipe(){
    return this.tipe;
}
public String getSuara(){
    return this.suara;
}
public int getUsia(){
    return this.usia;
}

}
