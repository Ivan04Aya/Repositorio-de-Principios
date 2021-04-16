/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDataAcccess;

import DataAccess.DataBaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Aldo Ivan
 */
public class DataAccesTest {
    
    @Test
    public void DataBaseConnectionTest() throws SQLException{
        Connection currentConnection=new DataBaseConnection().connection();
        Assert.assertNotNull(currentConnection);
    }
}
