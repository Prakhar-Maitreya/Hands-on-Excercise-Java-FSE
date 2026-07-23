package com.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
    private List<Employee> employees;

    public Department() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }
}
