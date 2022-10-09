import java.util.Scanner;
public class MainPercobaan1 {
    public static void main(String[] args) throws Exception {
        Processor p = new Processor("Intel i5", 3);
        Laptop L = new Laptop("Thinkpad", p);

        L.info();

        Processor p1 = new Processor();
        p1.setmerk("Intel i5");
        p1.setcache(4);
        Laptop L1 = new Laptop();
        L1.setmerk("Thinkpad");
        L1.setproc(p1);
        L1.info();
    }
}
