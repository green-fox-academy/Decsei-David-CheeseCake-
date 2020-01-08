package Cloneable;

public class Person implements Cloneable {

  protected String name;
  protected int age;
  protected String study;

  public Person(String name) {
    this.name = name;
  }

  public Person() {
    this.name = "John";
    this.age = 20;
    this.study = "BME";
  }

  @Override
  public Person clone() {
    return this;
  }

  public static void main(String[] args) {
    Person person = new Person();
    Person clonedJohn = person.clone();

    System.out.println(person.name + " " + person.age + " " + person.study);
    System.out.println(clonedJohn.name + " " + clonedJohn.age + " " + clonedJohn.study);

    clonedJohn.clone();

    System.out.println(person.name + " " + person.age + " " + person.study);
    System.out.println(clonedJohn.name + " " + clonedJohn.age + " " + clonedJohn.study);
  }
}
