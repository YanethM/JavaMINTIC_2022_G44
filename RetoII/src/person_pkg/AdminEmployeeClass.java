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
public class AdminEmployeeClass extends EmployeePersonClass{
    private String category;
    private int num_subordinates;
    
    public AdminEmployeeClass(String name, int id, String category, int num_subordinates) {
        super(name, id);
        this.category = category;
        this.num_subordinates = num_subordinates;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the num_subordinates
     */
    public int getNum_subordinates() {
        return num_subordinates;
    }

    /**
     * @param num_subordinates the num_subordinates to set
     */
    public void setNum_subordinates(int num_subordinates) {
        this.num_subordinates = num_subordinates;
    }
    
}
