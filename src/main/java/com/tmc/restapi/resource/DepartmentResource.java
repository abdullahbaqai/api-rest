package com.tmc.restapi.resource;

import com.tmc.restapi.persistence.Department;
import com.tmc.restapi.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentResource {

    DepartmentService service;

    public DepartmentResource(DepartmentService service) {
    this.service=service;
    }
    @GetMapping(value = "/departments")
    public List<Department> getAll(){


    }
    public Department getByid(long id){
    }

    public Department add(Department department){
    }

    public Department update(Long id, Department department) {


    }
    public void delete(Long id){
    }
}
