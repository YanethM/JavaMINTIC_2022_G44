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
public class ClientClass extends PersonClass{

    private String address;
    private String telephone;
    private CompanyClass company;
    
    
    public ClientClass() {
    }

    public ClientClass(int document, String name, String lastname) {
        super(document, name, lastname);
    }

    public CompanyClass getCompany() {
        return company;
    }

    public void setCompany(CompanyClass company) {
        this.company = company;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
}
