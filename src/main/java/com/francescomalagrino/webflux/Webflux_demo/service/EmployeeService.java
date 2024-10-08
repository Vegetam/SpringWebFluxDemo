package com.francescomalagrino.webflux.Webflux_demo.service;

import com.francescomalagrino.webflux.Webflux_demo.dto.EmployeeDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    Mono<EmployeeDto> save(EmployeeDto employeeDto);
    Mono<EmployeeDto> getEmployeeById(String employeeId);
    Flux<EmployeeDto> getAllEmployees();
    Mono<EmployeeDto> updateEmployee(EmployeeDto employeeDto,String employeeId);
    Mono<Void> deleteEmployee(String employeeId);
}
