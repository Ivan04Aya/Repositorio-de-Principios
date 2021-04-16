package Logic;

import Exception.DAOException;
import domain.Meeting;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aldo Ivan
 */
public interface IMeetingDao {
    public void scheduleMeeting(Meeting meeting) throws DAOException, SQLException;
}
