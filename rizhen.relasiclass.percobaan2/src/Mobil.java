public class Mobil {
    private String merk;
    private int biaya;

    public Mobil(){

    }

    public Mobil(String merk, int biaya){
        this.merk = merk;
        this.biaya = biaya;
    }
    
    public void setmerk(String merk){
        this.merk = merk;
    }
    public void setbiaya(int biaya){
        this.biaya = biaya;
    }
    public String getmerk(){
        return merk;
    }
    public int getbiaya(){
        return biaya;
    }
    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
    
}
