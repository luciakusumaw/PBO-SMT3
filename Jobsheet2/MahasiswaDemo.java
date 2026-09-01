package Jobsheet2;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "0342";
        m1.name = "Lucia";
        m1.alamat ="Nias, Sumatera Utara";
        m1.kelas = "2G";

        m1.displayBiodata();

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "101";
        m2.name = "Jennie";
        m2.alamat = "Blitar, Jawa Timur";
        m2.kelas = "2G";
        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "102";
        m3.name = "Mohan";
        m3.alamat = "Blitar, Jawa Timur";
        m3.kelas = "2G";
        m2.displayBiodata();


    }   
}
