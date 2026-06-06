public class Dog {
    private String name;
    private int age; // dog years

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHumanYears() {
        return age * 7; //1 dog year is approximately 7 human years
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Dog Name: " + name +
               "\nDog Age: " + age +
               "\nHuman Age: " + getHumanYears() + "\n";
    }
}