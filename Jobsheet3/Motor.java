public class Motor {
    private String plateNumber;
    private boolean isMachineOn;
    private int speed;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean getIsMachineOn(boolean isMachineOn) {
        return isMachineOn;
    }

    public void setIsMachineOn(boolean isMachineOn) {
        this.isMachineOn = isMachineOn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
    if (!this.isMachineOn && speed > 0) {
        System.out.println("Speed can not more than 0 if the machine is off");
    } else if (speed < 0) {
        System.out.println("Speed cannot be negative");
    } else if (speed > 100) {
        System.out.println("Speed cannot exceed 100");
    } else {
        this.speed = speed;
    }
}

    public void displayStatus() {
        System.out.println("Plate Number: "+ this.plateNumber);
        if (isMachineOn) {
            System.out.println("Machine On");
        } else{
            System.out.println("Machine Off");
        }

        System.out.println("Speed: "+this.speed);
        System.out.println("================================");
    }
}