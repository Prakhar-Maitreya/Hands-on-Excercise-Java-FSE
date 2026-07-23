package com.example;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private List<Employee> list = new ArrayList<>();

    public EmployeeController() {
        list.add(new Employee(1, "John", 50000));
        list.add(new Employee(2, "Alice", 60000));
    }

    @GetMapping
    public List<Employee> getAll() {
        return list;
    }

    @PostMapping
    public Employee add(@RequestBody Employee e) {
        list.add(e);
        return e;
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable int id, @RequestBody Employee e) {
        for (Employee emp : list) {
            if (emp.getId() == id) {
                emp.setName(e.getName());
                emp.setSalary(e.getSalary());
                return emp;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        list.removeIf(e -> e.getId() == id);
        return "Deleted employee " + id;
    }
}
