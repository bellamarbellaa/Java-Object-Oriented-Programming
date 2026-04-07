package DogInKennel;

public class Dog {
    private String name;
    private int age;


    public Dog(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;
    }


    public void setName(String dogName) { name = dogName; }
    public void setAge(int dogAge) { age = dogAge; }
    public String getName() { return name; }
    public int getAge() { return age; }


    public int getHumanYears() {
        return age * 7;
    }
}
