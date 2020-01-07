package Classes;

public class Mentor extends Person {

  private String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    this.level = "intermediate";
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public String introduce() {
    return super.introduce() + "" + this.level + " mentor.";
  }

}
