package BlogPost;

import java.util.Arrays;

public class BlogPost {

  private String authorName;
  private String title;
  private String text;
  private String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName=authorName;
    this.title=title;
    this.text=text;
    this.publicationDate=publicationDate;
  }

  public String getName() {
    return this.authorName;
  }

  public String getText() {
    return this.text;
  }

  public String getDate() {
    return this.publicationDate;
  }

  public String getTitle() {
    return this.title;
  }

}

