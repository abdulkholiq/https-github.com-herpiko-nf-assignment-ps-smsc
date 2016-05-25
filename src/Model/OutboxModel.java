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
public class OutboxModel {
    private String Text;
    private String DestinationNumber;
    private String groupId;

    public OutboxModel() {
    }

    public void setText(String Text) {
        this.Text = Text;
    }

    public String getText() {
        return Text;
    }
    
    public void setDestinationNumber(String DestinationNumber){
        this.DestinationNumber = DestinationNumber;
    }
    
    public String getDestinationNumber(){
        return DestinationNumber;
    }
     
    public void setGroup(String groupId){
        this.groupId = groupId;
    }
    public String getGroup(){
        return groupId;
    }
}   
    

