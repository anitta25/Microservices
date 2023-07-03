package com.example.samplemicro.controller;

import com.example.samplemicro.DeptService;
import com.example.samplemicro.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    DeptService deptService;
    @PostMapping("/save")
    public Department save(@RequestBody Department department)
    {
       return deptService.save(department);
    }
    @GetMapping ("/get/{id}")
    public Department get(@PathVariable Long id)
    {
        return  deptService.get(id);
    }

}
