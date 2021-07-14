/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

/**
 *
 * @author apmejiar
 */
public class EmployeeClass extends PersonClass {

    private int salary;
    private int category;
    private String email;
    private CompanyClass company;

    
    public EmployeeClass() {
    }

    public EmployeeClass(int document, String name, String lastname, CompanyClass company) {
        super(document, name, lastname);
        this.company = company;
    }

    public CompanyClass getCompany() {
        return company;
    }

    public void setCompany(CompanyClass company) {
        this.company = company;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the category
     */
    public int getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(int category) {
        this.category = category;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
