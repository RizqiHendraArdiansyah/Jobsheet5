public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    public void setPenumpang(Penumpang penumpang, int nomor){
        if(this.arrayKursi[nomor - 1].getPenumpang() == null){
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }else{
            System.out.println("\nKepada Saudara " + penumpang.getNama());
            System.out.println("Kursi Nomor " + nomor + " sudah terisi oleh Penumpang");
            System.out.println("Mohon maaf silahkan mencari kursi yang lain.\n");
        } 
    }
    public String getKode(){
        return kode;
    }
    public Kursi[] getArrayKursi(){
        return arrayKursi;
    }
    public String info(){
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi){
            info += kursi.info();
        }
        return info;
    }
}

