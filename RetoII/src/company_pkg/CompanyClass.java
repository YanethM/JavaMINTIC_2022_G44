/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_pkg;

import person_pkg.*;

/**
 *
 * @author apmejiar
 */
public class CompanyClass {
    private String NIT;
    private String name;
    private EmployeePersonClass employee;
    private ClientPersonClass client;

    public CompanyClass(String NIT, String name, EmployeePersonClass employee) {
        this.NIT = NIT;
        this.name = name;
        this.employee = employee;
    }

    public ClientPersonClass getClient() {
        return client;
    }

    public void setClient(ClientPersonClass client) {
        this.client = client;
    }

    public EmployeePersonClass getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeePersonClass employee) {
        this.employee = employee;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
