public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setnama(String nama){
        this.nama = nama;
    }
    public void setkelas(String kelas){
        this.kelas = kelas;
    }
    public void setmasinis(Pegawai masinis){
        this.masinis = masinis;
    }
    public void setasisten(Pegawai asisten){
        this.asisten = asisten;
    }

    public String getnama(){
        return nama;
    }
    public String getkelas(){
        return kelas;
    }
    public Pegawai getmasinis(){
        return masinis;
    }
    public Pegawai getasisten(){
        return asisten;
    }

    public String info(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }


}
