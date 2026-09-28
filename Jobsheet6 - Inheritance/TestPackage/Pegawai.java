package TestPackage;

public class Pegawai {
    public String nip;
    public String name;
    protected double salary;

    public Pegawai(){
    System.out.println("Object from Employee class has been made");
    }

    public String getInfo(){
        String info = "";
        info += "NIP        : "+ nip+ "\n";
        info += "NAME       : "+ name+ "\n";
        info += "SALARY     : "+ salary+ "\n";

        return info;
    }
}
