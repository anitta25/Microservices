package com.example.samplemicro;

import com.example.samplemicro.entity.Department;
import com.example.samplemicro.repo.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {
    @Autowired
    DeptRepo repo;
    public Department save(Department department) {
       return   repo.save(department);
    }

    public Department get(Long id) {
        return  repo.findById(id).get();
    }
}
