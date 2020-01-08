package Classes;

public class Student extends Person implements Cloneable{

  protected String previousOrganization;
  protected int skippedDays = 0;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public Student() {
    this.previousOrganization = "School of life";
  }

  @Override
  public String introduce() {
    return super.introduce() + " from " + this.previousOrganization + " who skipped "
        + this.skippedDays + " days from the course already.";
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays = this.skippedDays + numberOfDays;
  }

}
