/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataAccess.DataBaseConnection;
import Exception.DAOException;
import domain.Diary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Aldo Ivan
 */
public class DiaryDao implements IDiaryDao {
    
    @Override
    public void modifyDiary(Diary diary) throws DAOException, SQLException{
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Connection connection = dataBaseConnection.connection();

        final String UPDATE = "UPDATE diary SET startTime = ?, endTime = ?, timeEstimated = ?, realTime = ?, numberDiary = ?, subjectAgenda= ?, leaderDiscussion = ?";
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(UPDATE);
            statement.setTime(1, diary.getStartTime());
            statement.setTime(2, diary.getEndTime());
            statement.setInt(3, diary.getTimeEstimated());
            statement.setInt(4, diary.getRealTime());
            statement.setInt(5, diary.getNumberDiary());
            statement.setString(6, diary.getSubjectAgenda());
            statement.setString(7, diary.getLeaderDiscussion());
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
