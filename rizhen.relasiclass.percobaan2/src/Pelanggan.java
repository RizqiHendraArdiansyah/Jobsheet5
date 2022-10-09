public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Pelanggan(){

    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setMobil(Mobil mobil){
        this.mobil = mobil;
    }
    public void setSopir(Sopir sopir){
        this.sopir = sopir;
    }
    public void sethari(int hari){
        this.hari = hari;
    }
    public String getnama(){
        return nama;
    }
    public Mobil getMobil(){
        return mobil;
    }
    public Sopir getSopir(){
        return sopir;
    }
    public int gethari(){
        return hari;
    }
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}
