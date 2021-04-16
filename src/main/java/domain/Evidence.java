package domain;


import java.sql.Blob;
import java.util.Date;

/**
 *
 * @author Aldo Ivan
 */
public class Evidence {
    private String titleEvidence;
    private String typeEvidence;
    private String authorEvidence;
    private String degreeStudies;
    private String preliminaryProject;
    private Date recordDate;
    private Blob fileEvidence;

    public Evidence(String titleEvidence, String typeEvidence, String authorEvidence, String degreeStudies, String preliminaryProject, Date recordDate, Blob fileEvidence) {
        this.titleEvidence = titleEvidence;
        this.typeEvidence = typeEvidence;
        this.authorEvidence = authorEvidence;
        this.degreeStudies = degreeStudies;
        this.preliminaryProject = preliminaryProject;
        this.recordDate = recordDate;
        this.fileEvidence = fileEvidence;
    }

    public String getTitleEvidence() {
        return titleEvidence;
    }

    public void setTitleEvidence(String titleEvidence) {
        this.titleEvidence = titleEvidence;
    }

    public String getTypeEvidence() {
        return typeEvidence;
    }

    public void setTypeEvidence(String typeEvidence) {
        this.typeEvidence = typeEvidence;
    }

    public String getAuthorEvidence() {
        return authorEvidence;
    }

    public void setAuthorEvidence(String authorEvidence) {
        this.authorEvidence = authorEvidence;
    }

    public String getDegreeStudies() {
        return degreeStudies;
    }

    public void setDegreeStudies(String degreeStudies) {
        this.degreeStudies = degreeStudies;
    }

    public String getPreliminaryProject() {
        return preliminaryProject;
    }

    public void setPreliminaryProject(String preliminaryProject) {
        this.preliminaryProject = preliminaryProject;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Blob getFileEvidence() {
        return fileEvidence;
    }

    public void setFileEvidence(Blob fileEvidence) {
        this.fileEvidence = fileEvidence;
    }

    public long getStartTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public long getEndTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTimeEstimated() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRealTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumberDiary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSubjectAgenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getleaderDiscussion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
