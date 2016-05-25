/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import DB.DB;

/**
 *
 * @author herpiko
 */
public class OutboxDAO {
    
    DB DBConnect = null;

    public OutboxDAO() {
        DBConnect = new DB();
    }
    
     public void save(OutboxModel obj)

        throws SQLException {
        // Get group member
        String sql = "SELECT contacts.phone, groups.name as group_name, groups.id as group_id FROM contacts join groups on contacts.groupId=groups.id where groups.id=? ORDER BY contacts.id;";
        
        try {
            PreparedStatement pst = DBConnect.getConnection().prepareStatement(sql);
            pst.setString(1, obj.getGroup());
            ResultSet rs = pst.executeQuery();
            // Iterate group member
            String number = "";
            int i = 0;
            while (rs.next()) {            
              
                number = rs.getObject(1).toString();
                sql = "INSERT INTO outbox (DestinationNumber, TextDecoded, SenderID, CreatorID, Coding) VALUES (?, ?, 'fasttrack', 'fasttrack', 'Default_No_Compression');";
                System.out.print(obj.getText());
                System.out.print(sql);
                try {
                    PreparedStatement statement = DBConnect.getConnection().prepareStatement(sql);
                    statement.setString(2, obj.getText());
                    statement.setString(1, number);
                    statement.executeUpdate();
                } catch(SQLException e) {
                    System.out.println(e);
                }
                i++;
            }
        } catch (SQLException e) {
            System.out.println("ERROR " + sql);
        }
         
         
        
    }
    
    public TableModel tableOutbox() {
        TableModel model = new DefaultTableModel();
        String sql = "SELECT DestinationNumber, TextDecoded as Text from outbox;";
        try {
            PreparedStatement pst = DBConnect.getConnection().prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            model = DbUtils.resultSetToTableModel(rs);
        } catch (SQLException e) {
            System.out.println("ERROR " + sql);
        }
        return model;
    }
    
    public void update(OutboxModel obj)
        throws SQLException {
       
        String sql = "UPDATE contacts  "
                + " SET name=? phone=? groupId=?"
                + " WHERE id=?";
        try (PreparedStatement statement = DBConnect.getConnection().prepareStatement(sql)) {
            statement.setString(1, obj.getText());
            statement.setString(2, obj.getDestinationNumber());
         
            statement.executeUpdate();
        }
    }

    public void delete(int idx)
        throws SQLException {
        
        String sql = "DELETE FROM contacts "
                + " WHERE id=?";
        try (PreparedStatement statement = DBConnect.getConnection().prepareStatement(sql)) {
            statement.setInt(1, idx);
            statement.executeUpdate();
        }
    }
}
