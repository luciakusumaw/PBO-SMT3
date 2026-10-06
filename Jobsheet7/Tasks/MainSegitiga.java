package Tasks;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();

        System.out.println("=== Uji Coba Method Overloading ===");
        System.out.println("Total Sudut (1 sudut: 60)       : " + sgt.totalSudut(60));
        System.out.println("Total Sudut (2 sudut: 60, 45)   : " + sgt.totalSudut(60, 45));
        System.out.println("Keliling (3 sisi: 5, 6, 7)      : " + sgt.keliling(5, 6, 7));
        System.out.printf("Sisi Miring Phytagoras (3, 4)   : %.2f\n", sgt.keliling(3, 4));
    }
}