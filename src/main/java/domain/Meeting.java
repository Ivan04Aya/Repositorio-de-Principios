package domain;


import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Aldo Ivan
 */
public class Meeting {
	private Date meetingDate;
	private String projectName;
	private Time meetingTime;
	private String meetingPlace;
	private String subject;
	private String leader;
	private String timekeeper;
	private String secretary;
	private String prerequisite;

    public Meeting(Date meetingDate, String projectName, Time meetingTime, String meetingPlace, String subject, String leader, String timekeeper, String secretary, String prerequisite) {
        this.meetingDate = meetingDate;
        this.projectName = projectName;
        this.meetingTime = meetingTime;
        this.meetingPlace = meetingPlace;
        this.subject = subject;
        this.leader = leader;
        this.timekeeper = timekeeper;
        this.secretary = secretary;
        this.prerequisite = prerequisite;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Time getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(Time meetingTime) {
        this.meetingTime = meetingTime;
    }

    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getTimekeeper() {
        return timekeeper;
    }

    public void setTimekeeper(String timekeeper) {
        this.timekeeper = timekeeper;
    }

    public String getSecretary() {
        return secretary;
    }

    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }
    
}