public class Employee extends Person {

    private String company;



    public String getCompany() {
        return company;
    }

    public Employee(String name,  String company) {
        super(name);

        this.company = company;
    }

    void construktor (Integer lord, String tor ){
        for (int i = 0; i < lord ; i++) {
            System.out.println(tor);

        }

    }
    void construktor (Integer pit, Integer lord, String tor ){
        System.out.println(pit + lord + tor);

    }
    final void construktor (){
        System.out.println("HELLO");

    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\ncommany;" + company ;
    }
}
