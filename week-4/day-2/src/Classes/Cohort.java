package Classes;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

  protected String name;
  protected List students;
  protected List mentors;

  public Cohort(String name) {
    this.students = new ArrayList(
    );
    this.mentors = new ArrayList(
    );
  }

  public void addStudent(Student a) {
    this.students.add(a);
  }

  public void addMentor(Mentor a) {
    this.mentors.add(a);
  }

  public void info() {
    System.out.println(
        "The name cohort has " + this.students.size() + " students and " + mentors.size()
            + " mentors.");
  }
}
