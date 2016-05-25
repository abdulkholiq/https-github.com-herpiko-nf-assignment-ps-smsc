/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author sttmalam
 */
public class ContactModel {
    private String name;
    private String phone;
    private String groupId;

    public ContactModel() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getPhone(){
        return phone ;
    }
     
    public void setGroup(String groupId){
        this.groupId = groupId;
    }
    public String getGroup(){
        return groupId;
    }
}   
    

