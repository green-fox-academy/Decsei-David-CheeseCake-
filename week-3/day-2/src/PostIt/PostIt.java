package PostIt;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PostIt {

  private String backgroundColor;
  private String text;
  private String textColor;

  private PostIt() {
    this.backgroundColor = "Default";
    this.text = "Default";
    this.textColor = "Default";
  }

  public void getPostit(String backgroundColor, String text, String textColor) {
    this.textColor = textColor;
    this.text = text;
    this.backgroundColor = backgroundColor;

  }

  public static void main(String[] args) {
    PostIt idea = new PostIt();
    idea.textColor = "Blue";
    idea.text = "Idea 1";
    idea.backgroundColor = "Orange";
    System.out.println(idea.backgroundColor +" "+ idea.textColor +" "+ idea.text);

    PostIt awesome = new PostIt();
    awesome.textColor = "Black";
    awesome.text = "Awesome";
    awesome.backgroundColor = "Pink";
    System.out.println(awesome.backgroundColor +" "+ awesome.textColor +" "+ awesome.text);

    PostIt superb = new PostIt();
    superb.textColor = "Green";
    superb.text = "Superb!";
    superb.backgroundColor = "Yellow";
    System.out.println(superb.backgroundColor +" "+ superb.textColor +" "+ superb.text);

  }
}
