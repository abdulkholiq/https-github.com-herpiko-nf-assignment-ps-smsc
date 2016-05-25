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
public class ContactDAO {
    
    DB DBConnect = null;

    public ContactDAO() {
        DBConnect = new DB();
    }
    
     public void save(ContactModel obj)
        throws SQLException {
        String sql = "INSERT INTO contacts (name, phone, groupId) VALUES (?,?,?)";
        System.out.print(sql);
        try (PreparedStatement statement = DBConnect.getConnection().prepareStatement(sql)) {
            statement.setString(1, obj.getName());
            statement.setString(2, obj.getPhone());
            statement.setString(3, obj.getGroup());
            statement.executeUpdate();
        }
    }
    
    public TableModel tableContact() {
        TableModel model = new DefaultTableModel();
        String sql = "SELECT contacts.id, contacts.name, contacts.phone, groups.name as group_name, groups.id as group_id FROM contacts join groups on contacts.groupId=groups.id ORDER BY contacts.id;";
        try {
            PreparedStatement pst = DBConnect.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            model = DbUtils.resultSetToTableModel(rs);
        } catch (SQLException e) {
            System.out.println("ERROR " + sql);
        }
        return model;
    }
    
    public void update(ContactModel obj)
        throws SQLException {
       
        String sql = "UPDATE contacts  "
                + " SET name=? phone=? groupId=?"
                + " WHERE id=?";
        try (PreparedStatement statement = DBConnect.getConnection().prepareStatement(sql)) {
            statement.setString(1, obj.getName());
            statement.setString(2, obj.getPhone());
            statement.setString(3, obj.getGroup());
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
