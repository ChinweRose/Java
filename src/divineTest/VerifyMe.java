package divineTest;

public class VerifyMe {

    private String name;

    private int age;

    private String country;

    public VerifyMe(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public VerifyMe() {
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        if (age < 18){
//            throw new Exception("Hello, you are not eligible to vote.");
            System.out.println("hello, you are not eligible to vote");
        }
        return age;
    }
}
