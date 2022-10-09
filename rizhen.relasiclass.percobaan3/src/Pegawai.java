public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

    public void setnip(String nip){
        this.nip = nip;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public String getnip(){
        return nip;
    }
    public String getnama(){
        return nama;
    }

    public String info() { String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
