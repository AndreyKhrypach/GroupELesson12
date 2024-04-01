public class Fax extends Device{

    private int serialNumber;


    public Fax(String name, int serialNumber) {
        super(name);
        this.serialNumber = serialNumber;
    }

    @Override
    public void printDevice() {
        System.out.println(Fax.class.getName() + " printing");
    }
}
