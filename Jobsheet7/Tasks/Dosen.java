package Tasks;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan siang di ruang dosen");
    }

    public void lembur() {
        System.out.println("Dosen lembur memeriksa hasil tugas mahasiswa");
    }
}