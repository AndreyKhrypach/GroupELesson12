public class Employee extends Person{
    private String company;

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Employee with name = %s works in %s \n",
                super.getName(), company);
    }

}
