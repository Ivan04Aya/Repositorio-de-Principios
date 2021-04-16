/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Exception.DAOException;
import domain.Evidence;
import java.sql.SQLException;

/**
 *
 * @author Aldo Ivan
 */
public interface IEvidenceDao {
    public void recordEvidence(Evidence evidence) throws DAOException, SQLException;
    public void removeEvidence(Evidence evidence) throws SQLException, DAOException;
}
