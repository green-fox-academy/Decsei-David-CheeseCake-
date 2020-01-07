package Classes;

public class Person {

  protected String name;
  protected int age;
  protected String gender;

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    this.name = "John Doe";
    this.age = 30;
    this.gender = "female";
  }

  public String introduce() {
    return "Hi, My name is " + this.name + ", a " + this.age + " old " + this.gender;
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}
