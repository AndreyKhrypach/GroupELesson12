public class Airplane implements Fly {

    private String name;

    public Airplane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void flying() {
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrr");
    }
}
