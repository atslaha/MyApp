package il.co.myapp.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents abstract DAO class with the executeQuery and updateQuery methods.
 * @author Artem Meleshko
 * @version 1.0 2017
 *
 */
public abstract class AbstractDAO {
private ConnectionDB connection;
    
    public Connection getConnection() throws SQLException{
        return connection.getConnection();
    }
    
    public void setConnection(ConnectionDB connection){
        this.connection=connection;
    }
    
    public ResultSet executeQuery(Connection connect, String query, List values){
        ResultSet result = null;
        try {
            PreparedStatement statement = connect.prepareStatement(query);
            for(int i=0;i<values.size();i++){
                statement.setObject(i+1, values.get(i));
            }
            result = statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    } 
    
    protected void updateQuery(String query, Object[] values){
        try {
            PreparedStatement statement = getConnection().prepareStatement(query);
            for(int i=0;i<values.length;i++){
                statement.setObject(i+1, values[i]);
            }
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    

}
