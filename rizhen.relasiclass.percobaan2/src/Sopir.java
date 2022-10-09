public class Sopir {
    private String nama;
    private int biaya;

    public Sopir(){

    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setbiaya(int biaya){
        this.biaya = biaya;
    }
    public String getnama(){
        return nama;
    }
    public int getbiaya(){
        return biaya;
    }
    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
}
