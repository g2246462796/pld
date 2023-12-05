package com.pld.service;

import com.pld.dto.EmployeeLoginDTO;
import com.pld.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}
