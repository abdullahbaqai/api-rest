package com.tmc.restapi.resource;

import com.tmc.restapi.persistence.Department;
import com.tmc.restapi.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")  // Base path
public class DepartmentResource {

    private final DepartmentService service;

    public DepartmentResource(DepartmentService service) {
        this.service = service;
    }

    // GET all departments
    @GetMapping
    public List<Department> getAll() {
        return service.getAll();
    }

    // GET department by id
    @GetMapping("/{id}")
    public Department getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // POST to add new department
    @PostMapping
    public Department add(@RequestBody Department department) {
        return service.add(department);
    }

    // PUT to update department
    @PutMapping("/{id}")
    public Department update(@PathVariable Long id, @RequestBody Department department) {
        return service.update(id, department);
    }

    // DELETE department
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
