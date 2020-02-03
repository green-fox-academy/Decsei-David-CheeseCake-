package com.example.greenfoxclass.Controllers;

import com.example.greenfoxclass.Interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController{

  StudentService studentService;

  @Autowired
  public MainController(StudentService studentService){
    this.studentService = studentService;
  }

  @GetMapping(value="/gfa/list")
  public String listAllStudents(Model model){
    model.addAttribute("students", studentService.findAll());
    return "index";
  }

  @PostMapping(value="/gfa/add")
  public String addStudents(@RequestParam String name, Model model){
    studentService.save(name);
    model.addAttribute("students", studentService.findAll());
    return "index";
  }
}
