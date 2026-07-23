package com.example;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department dept;

    public Employee() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Department getDept() { return dept; }
    public void setDept(Department dept) { this.dept = dept; }
}
