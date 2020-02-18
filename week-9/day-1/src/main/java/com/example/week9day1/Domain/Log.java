package com.example.week9day1.Domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Log {

  @Id
  @GeneratedValue
  private Integer id;
  private Date createdAt;
  private String endpoint;
  private String data;

  public Log(String endpoint, String input) {
    this.createdAt = new Date();
    this.endpoint = endpoint;
    this.data = input;
  }

  public Log() {
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
