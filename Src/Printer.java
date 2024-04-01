public class Printer extends Device {

    private int serialNumber;

    public Printer(String name, int serialNumber) {
        super(name);
        this.serialNumber = serialNumber;
    }

    @Override
    public void printDevice() {
        System.out.println( super.getName() + " printing");
    }
}
