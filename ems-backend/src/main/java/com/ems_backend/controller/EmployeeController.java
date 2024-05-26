package com.ems_backend.controller;

import com.ems_backend.dto.EmployeeDto;
import com.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
//Base URL
public class EmployeeController {
        private EmployeeService employeeService;

        /* Build add Employee Rest API */
        @PostMapping
        public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
            EmployeeDto savedEmp = employeeService.createEmployee(employeeDto);
            return new ResponseEntity<>(savedEmp, HttpStatus.CREATED);
        }

}












