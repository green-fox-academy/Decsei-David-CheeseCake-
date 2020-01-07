package Classes;

public class Sponsor extends Person {

  protected String company;
  protected int hiredStudents = 0;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    this.company = "Google";
  }

  public String introduce() {
    return super.introduce() + "who represents " + this.company + " and hired " + this.hiredStudents
        + " students so far.";
  }

  public void hire() {
    this.hiredStudents = this.hiredStudents + 1;
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
