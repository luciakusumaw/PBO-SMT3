package Experiment;

public class Dosen extends Pegawai {

    public String nidn;
    public Dosen(){
        System.out.println("Object from Lecturer class has been made");
    }

    public String getInfo(){
        return "NIDN        : " + this.nidn + "\n";
    }

    public String getAllInfo(){
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}
