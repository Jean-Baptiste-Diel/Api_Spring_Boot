package com.apispringboot.api_hr_association;

import com.apispringboot.api_hr_association.controller.EmployeeController;
import com.apispringboot.api_hr_association.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@WebMvcTest(controllers = EmployeeController.class)
class ApiHrAssociationApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private EmployeeService employeeService;
    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
                .andExpect(status().isOk());
    }
/*
@WebMvcTest(controllers = EmployeeController.class) déclenche le mécanisme permettant de tester les
controllers. On indique également le ou les controllers concernés.

L’attribut mockMvc est un autre élément important. Il permet d’appeler la méthode “perform” qui déclenche
la requête.

L’attribut employeeService est annoté @MockBean. Il est obligatoire, car la méthode du controller exécutée
par l’appel de “/employees” utilise cette classe.

La méthode perform prend en paramètre l’instruction get(“/employees”). On exécute donc une requête GET sur
l’URL /employees.

Ensuite, l’instruction .andExpect(status().isOk()) indique que nous attendons une réponse HTTP 200.

L’utilisation de @WebMvcTest permet d’écrire des tests unitaires sur le controller.
Un mock est un objet qui se substitue à un autre objet.
 */
}
