package oops;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Person P1 = new Person("Harsh", 20);
        Person P2 = new Person("Ishan", 23);

        System.out.println(P1.getName() + ", " + P1.getAge());
        System.out.println(P2.getName() + ", " + P2.getAge());
    }
}


