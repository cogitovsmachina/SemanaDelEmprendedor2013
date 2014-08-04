package mx.androidtitlan.semanadelemprendedor.entities;

import java.io.Serializable;

public class MainAgendaRowItem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String title;
	private String description;
	private String[] speakerName;
	private String[] speakerDescription;
	private int[] speakerImage;
	private int dayNumber;
	private String startTime;
	private String endTime;
	private String subTitle;
	private int ecosystemId;
	private int sessionId;
	
	public MainAgendaRowItem(String title, String description,
			String[] speakerName, String[] speakerDescription,
			int[] speakerImage, int dayNumber, String startTime,
			String endTime, String subTitle, int ecosystemId, int sessionId) {
		super();
		this.title = title;
		this.description = description;
		this.speakerName = speakerName;
		this.speakerDescription = speakerDescription;
		this.speakerImage = speakerImage;
		this.dayNumber = dayNumber;
		this.startTime = startTime;
		this.endTime = endTime;
		this.subTitle = subTitle;
		this.ecosystemId = ecosystemId;
		this.sessionId = sessionId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getSpeakerName() {
		return speakerName;
	}

	public void setSpeakerName(String[] speakerName) {
		this.speakerName = speakerName;
	}

	public String[] getSpeakerDescription() {
		return speakerDescription;
	}

	public void setSpeakerDescription(String[] speakerDescription) {
		this.speakerDescription = speakerDescription;
	}

	public int[] getSpeakerImage() {
		return speakerImage;
	}

	public void setSpeakerImage(int[] speakerImage) {
		this.speakerImage = speakerImage;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public int getEcosystemId() {
		return ecosystemId;
	}

	public void setEcosystemId(int ecosystemId) {
		this.ecosystemId = ecosystemId;
	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
}
