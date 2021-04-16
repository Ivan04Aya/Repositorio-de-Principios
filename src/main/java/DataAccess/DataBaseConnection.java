/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aldo Ivan
 */
public class DataBaseConnection {
    private Connection connection;
    private final String DB = "jdbc:mysql://localhost/127.0.0.1/administrationsystem";
    private final String USER = "Roy";
    private final String PASSWORD="CP+14se";
    
    public Connection connection(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");//.newInstance();
            connection=(Connection) DriverManager.getConnection(DB,USER,PASSWORD);
        }catch(SQLException | ClassNotFoundException ex) { 
            System.out.println(ex);
        }
        return connection;
    }
    
    public boolean connect(){
        DataBaseConnection connectionDataBase = new DataBaseConnection();
        boolean connect = false;
        connection = connectionDataBase.connection();
        if(connection==null){
            
        }else{
            connect = true;  
        }
        return connect;
    }
    
    public void cerrarConexion(){
        if(connection!= null){
            try{
                if(!connection.isClosed()){
                    connection.close();
                }
            }catch(SQLException ex){
                Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
    }   
}
