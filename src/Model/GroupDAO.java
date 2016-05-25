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
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;
import javax.swing.ListModel;
import java.util.ArrayList;
import java.util.List;
import net.proteanit.sql.DbUtils;
import Model.GroupModel;
import DB.DB;

/**
 *
 * @author herpiko
 */
public class GroupDAO {
    
    DB DBConnect = null;

    public GroupDAO() {
        DBConnect = new DB();
    }
    
     public void save(GroupModel obj)
        throws SQLException {
        String sql = "INSERT INTO groups (name) VALUES (?)";
        try (PreparedStatement statement = DBConnect.getConnection().prepareStatement(sql)) {
            statement.setString(1, obj.getName());
            statement.executeUpdate();
        }
    }
    
    public TableModel tableGroup() {
        TableModel model = new DefaultTableModel();
        String sql = "SELECT * FROM groups ORDER BY id";
        try {
            PreparedStatement pst = DBConnect.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            model = DbUtils.resultSetToTableModel(rs);
        } catch (SQLException e) {
            System.out.println("ERROR " + e);
        }
        return model;
    }
    public List listGroup() {
       
        List<String> groups = new ArrayList<String>();
        String sql = "SELECT * FROM groups ORDER BY id";
        try {
            PreparedStatement pst = DBConnect.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while (rs.next()) {            
                System.out.println(rs.getObject(2).toString());
                groups.add(rs.getObject(1).toString() + " - " + rs.getObject(2).toString());
                i++;
            }
        } catch (SQLException e) {
            System.out.println("ERROR " + e);
        }
       
        return groups;
    }
    
    /*
    public Integer count() {
        String sql = "COUNT * FROM groups";
        try {
            PreparedStatement pst = DBConnect.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
        } catch(SQLException e){
            System.out.println(e);
        }
           
        DbUtils.resultSetToNestedList(rs)
    }
    */
    
    public void update(GroupModel obj)
        throws SQLException {
       
        String sql = "UPDATE groups  "
                + " SET name=? "
                + " WHERE id=?";
        try (PreparedStatement statement = DBConnect.getConnection().prepareStatement(sql)) {
            statement.setString(1, obj.getName());
            statement.executeUpdate();
        }
    }

    public void delete(int idx)
        throws SQLException {
        
        String sql = "DELETE FROM groups "
                + " WHERE id=?";
        try (PreparedStatement statement = DBConnect.getConnection().prepareStatement(sql)) {
            statement.setInt(1, idx);
            statement.executeUpdate();
        }
    }
}
