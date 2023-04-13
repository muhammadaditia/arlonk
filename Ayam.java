package praktikum4;

public class Ayam {
    //state
    String warna;
    
    //behavior
    void makan(String warna){
        this.warna = warna;
        System.out.println("Ayam warna "+this.warna+" sedang makan");
    }
}
