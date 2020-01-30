package com.example.dependecies;

import com.example.dependecies.Interfaces.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependeciesApplication implements CommandLineRunner {

  Printer printer;

  @Autowired
  public DependeciesApplication(Printer printer) {
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependeciesApplication.class, args);
  } // Dont fcking touch


  @Override
  public void run(String... args) throws Exception {
    printer.log("FASZOM");
    printer.printColor();
  }
}
