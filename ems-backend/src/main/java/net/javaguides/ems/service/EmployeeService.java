package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeId(long employeeId);

    List<EmployeeDto>getAllEmployees();

    EmployeeDto updateEmployee(long employeeId , EmployeeDto updatedEmployee);
}
