package com.ems_backend.service.implementation;

import com.ems_backend.dto.EmployeeDto;
import com.ems_backend.entity.Employee;
import com.ems_backend.mapper.EmployeeMapper;
import com.ems_backend.repository.EmployeeRepository;
import com.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class EmployeeServiceImp implements EmployeeService {

    private EmployeeRepository employeeRepository;

    /*Takes in employee DTO as input, then changes the type of
    it into an employee then saves the employee by use save method
    that is given through the JPA Repository , this will automatically
    put it in the database , it then returns the DTO that was just saved
     into the data indication a sucessful creation , for further implemntation
     if implementation goes wrong , then we can create checks inside of the
     method , ex. return null instead */
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee saved = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(saved);
    }
}
