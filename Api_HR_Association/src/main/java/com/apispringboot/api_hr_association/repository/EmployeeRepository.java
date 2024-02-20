package com.apispringboot.api_hr_association.repository;

import com.apispringboot.api_hr_association.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}

/*
Implémentez la communication entre l’application et la base de données

@Repository est une annotation Spring pour indiquer que la classe est un bean, et que son rôle est de
communiquer avec une source de données (en l'occurrence la base de données).

CrudRepository est une interface fournie par Spring. Elle fournit des méthodes pour manipuler votre entité.
Elle utilise la généricité pour que son code soit applicable à n’importe quelle entité, d’où la syntaxe
“CrudRepository<Employee, Long>”

NB: La classe entité fournie doit être annotée @Entity, sinon Spring retournera une erreur.

 */
