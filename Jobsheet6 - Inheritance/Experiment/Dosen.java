package Experiment;

public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Object from class Dosen has been made");
    }

    public Dosen(String nip, String name, double salary, String nidn) {
        System.out.println("Object from class Dosen made with parameterized constructor");
    }

    public String getAllInfo() {
        String info = "";
        info += "NIP             : " + super.nip + "\n";
        info += "NAME            : " + super.name + "\n";
        info += "SALARY          : " + super.salary + "\n";
        info += "NIDN            : " + this.nidn + "\n";
        return info;
    }
}