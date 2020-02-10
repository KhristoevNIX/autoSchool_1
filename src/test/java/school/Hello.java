package school;

public class Hello {
    static private String name;

    public void setupName(String name) {
        this.name = name;
    }

    public void welcome() {
        System.out.println("Hello, " + name);
    }

    public void byeBye() {
        System.out.println("Bye, " + name);
    }
}
