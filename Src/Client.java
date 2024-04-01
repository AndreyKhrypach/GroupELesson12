public class Client extends Person{
    private String company;

    public Client(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Client with name = %s get account in %s \n",
                super.getName(), company);
    }
}
