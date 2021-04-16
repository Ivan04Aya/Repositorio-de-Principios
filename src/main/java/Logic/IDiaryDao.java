/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Exception.DAOException;
import domain.Diary;
import java.sql.SQLException;

/**
 *
 * @author Aldo Ivan
 */
public interface IDiaryDao {
    public void modifyDiary(Diary diary) throws DAOException, SQLException;
}
