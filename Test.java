class Constructor {
    String name;
    int age;

    // Constructor
    Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Test {
    public static void main(String[] args) {
        Constructor p = new Constructor("Krishna", 25);
        System.out.println(p.name + " -> " + p.age);
    }
}