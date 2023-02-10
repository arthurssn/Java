package entities;

public class Holder {
    private String name;
    private int age;

    public Holder(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Holder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
