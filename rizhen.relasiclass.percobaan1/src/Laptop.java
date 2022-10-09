public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop(){

    }

    public Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;    
    }

    public void setmerk(String merk){
        this.merk = merk;
    }
    public void setproc(Processor proc){
        this.proc = proc;
    }
    public String getmerk(){
        return merk;
    }
    public Processor getproc(){
        return proc;
    }
    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
