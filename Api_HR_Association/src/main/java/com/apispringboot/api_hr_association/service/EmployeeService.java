package com.apispringboot.api_hr_association.service;

import com.apispringboot.api_hr_association.model.Employee;
import com.apispringboot.api_hr_association.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;



@Data
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    //Cette méthode prend en paramètre l'ID d'un employé. Et le renvoie
    public Optional<Employee> getEmployee(final Long id){
        return employeeRepository.findById(id);
    }

    //Récupérer tous les employés présents dans la base de données
    public Iterable<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    //Cette méthode prend en paramètre l'ID de l'employé à supprimer.
    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }

    //Cette méthode prend en paramètre un objet Employee à sauvegarder dans la base de données.
    public Employee saveEmployee(Employee employee){
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }
}

/*
Créez un service métier
@Service : tout comme l’annotation @Repository, c’est une spécialisation de @Component. Son rôle est le meme
 */
