/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataAccess.DataBaseConnection;
import Exception.DAOException;
import domain.Meeting;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Aldo Ivan
 */
public class MeetingDao implements IMeetingDao{
    
    @Override
    public void scheduleMeeting(Meeting meeting) throws DAOException, SQLException{
     	DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();

        final String INSERT = "INSERT INTO meeting(meetingDate, projectName, meetingTime, meetingPlace, subject, leader, timekeeper, secretary, prerequisite) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = null;
        try{
                statement = connection.prepareStatement(INSERT);
        	statement.setDate(1, new Date(meeting.getMeetingDate().getTime()) );
        	statement.setString(2, meeting.getProjectName());
        	statement.setTime(3, meeting.getMeetingTime());
        	statement.setString(4, meeting.getMeetingPlace());
        	statement.setString(5, meeting.getSubject());
        	statement.setString(6, meeting.getLeader());
        	statement.setString(7, meeting.getTimekeeper());
        	statement.setString(8, meeting.getSecretary());
        	statement.setString(9, meeting.getPrerequisite());
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
}