package com.tmc.restapi.service;

import com.tmc.restapi.persistence.DepartmentRepository;
import lombok.Data;
import org.springframework.stereotype.Service;
import com.tmc.restapi.persistence.Department;
import java.util.List;
import java.util.Optional;

@Data
@Service
public class DepartmentService {

    DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }
    public List<Department>getAll(){
        return this.repository.findAll();

    }
    public Department getById(long id){
        return this.repository.findById(id).get();
    }


    public Department add(Department department){
        return this.repository.save(department);
    }

    public Department update(Long id, Department department) {
        Optional<Department> dept = this.repository.findById(id);

        if(dept.isPresent()){
            dept.get().setName(department.getName());
            return this.repository.save(dept.get());
        }

        throw new RuntimeException();

    }
public void delete(Long id){
        this.repository.deleteById(id);
}
}
