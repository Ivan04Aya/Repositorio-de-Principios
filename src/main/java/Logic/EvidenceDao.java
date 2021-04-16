/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataAccess.DataBaseConnection;
import Exception.DAOException;
import java.sql.Connection;
import domain.Evidence;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Aldo Ivan
 */
public class EvidenceDao implements IEvidenceDao{
    
    @Override
    public void recordEvidence(Evidence evidence) throws DAOException, SQLException{
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        
        final String INSERT = "INSERT INTO evidence(titleEvidence, typeEvidence, authorEvidence, degreeStudies, preliminaryProject, recordDate, fileEvidence) VALUES(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(INSERT);
            statement.setString(1, evidence.getTitleEvidence());
            statement.setString(2, evidence.getTypeEvidence());
            statement.setString(3, evidence.getAuthorEvidence());
            statement.setString(4, evidence.getDegreeStudies());
            statement.setString(5, evidence.getPreliminaryProject());
            statement.setDate(6, (Date) evidence.getRecordDate());
            statement.setBlob(7, evidence.getFileEvidence());
        }catch(SQLException ex){
            throw new DAOException("Error de conexion con la base de datos", ex);
        }finally{
        	if(statement != null){
        		try{
                            statement.close();
        		}catch(SQLException ex){
                            throw new DAOException("Error de conexion con la base de datos", ex);
        		}
        	}
        }
    }
    
    @Override
    public void removeEvidence(Evidence evidence) throws SQLException, DAOException{
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();
        final String DELETE = "DELETE FROM evidence WHERE titleEvidence = ?";
        
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(DELETE);
            statement.setString(1, evidence.getTitleEvidence());
        }catch(SQLException ex){
            throw new DAOException("Error de conexion con la base de datos", ex);
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
            	throw new DAOException("Error de conexion con la base de datos", ex);
        	}
        }

    }
}
