package Tasks;

public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan mie instan di kantin");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidur setelah begadang mengerjakan laporan");
    }
}
