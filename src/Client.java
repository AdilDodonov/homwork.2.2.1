public class Client extends Employee {
    private Employee c;


    public Employee getC() {
        return c;
    }

    public Client(String name,  String company, Employee c) {
        super(name,  company);
        this.c = c;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
