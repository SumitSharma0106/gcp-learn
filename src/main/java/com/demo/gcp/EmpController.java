package com.demo.gcp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpRepo empRepo;

    @GetMapping("/")
    public List<Emp> getAllEmp(){
        return empRepo.findAll();
    }

    @PostMapping("/")
    public Emp saveEmp(@RequestBody Emp emp){
        return empRepo.save(emp);
    }
}
