/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person_pkg;

/**
 *
 * @author apmejiar
 */
public class EmployeePersonClass extends PersonClass{
    
    public EmployeePersonClass(String name, int id) {
        super(name, id);
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
}
