package com.example.SpringIoCpractice;

public class HelloWorld {
  private String hello;
  
  private String name;
 
    public void setname(String name) {
        System.out.println("SetName: " + name);
        this.name = name;
    }


  public void getname() {
    System.out.println(name);
  }
}
