package Tasks;

public class MainDynamic {
    public static void main(String[] args) {
        
        Manusia m1 = new Manusia();
        Manusia m2 = new Dosen();     
        Manusia m3 = new Mahasiswa(); 

        System.out.println("=== Pemanggilan Objek Manusia ===");
        m1.bernafas();
        m1.makan();

        System.out.println("\n=== Pemanggilan Objek Dosen (Dynamic Dispatch) ===");
        m2.bernafas();
        m2.makan();   

        System.out.println("\n=== Pemanggilan Objek Mahasiswa (Dynamic Dispatch) ===");
        m3.bernafas(); 
        m3.makan();   
    }
}