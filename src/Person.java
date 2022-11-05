public class Person {
    private String name;

    private enum efe {T, R, G, D}


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return " NAME; " + name;
    }
}


