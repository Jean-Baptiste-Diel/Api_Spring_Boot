package com.apispringboot.api_hr_association.controller;

import com.apispringboot.api_hr_association.model.Employee;
import com.apispringboot.api_hr_association.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

}


/*
@RestController atteint 2 objectifs :

Comme @Component, elle permet d’indiquer à Spring que cette classe est un bean.

Elle indique à Spring d’insérer le retour de la méthode au format JSON dans le corps de la réponse HTTP.
Grâce à ce deuxième point, les applications qui vont communiquer avec votre API accéderont au résultat de
leur requête en parsant la réponse HTTP.

Type HTTP : GET POST PATCH PUT DELETE
GET Pour la lecture de données. annotation @GetMapping
POST Pour l’envoi de données. Cela sera utilisé par exemple pour créer un nouvel élément. annotation @PostMapping
PATCH Pour la mise à jour partielle de l’élément envoyé. annotation @PatchMapping
PUT Pour le remplacement complet de l’élément envoyé. annotation @PutMapping
DELETE Pour la suppression de l’élément envoyé. annotation @DeleteMapping
NB: @RequestMapping
Intègre tous les types HTTP. Le type souhaité est indiqué comme attribut de l’annotation. Exemple :

@RequestMapping(method = RequestMethod.GET)
 */