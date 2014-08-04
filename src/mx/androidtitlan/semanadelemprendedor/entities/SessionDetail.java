package mx.androidtitlan.semanadelemprendedor.entities;

public class SessionDetail {
	private String time;
	private String location;
	private String description;
	private String speakerDescription;
	private boolean mapAvailable;
	private int mapData;
	
	public SessionDetail(String time, String location, String description,
			String speakerDescription) {
		super();
		this.time = time;
		this.location = location;
		this.description = description;
		this.speakerDescription = speakerDescription;
		mapAvailable=false;
	}

	public SessionDetail(String time, String location, String description,
			String speakerDescription, int mapData) {
		this.time = time;
		this.location = location;
		this.description = description;
		this.speakerDescription = speakerDescription;
		this.mapData = mapData;
		mapAvailable=true;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSpeakerDescription() {
		return speakerDescription;
	}

	public void setSpeakerDescription(String speakerDescription) {
		this.speakerDescription = speakerDescription;
	}

	public int getMapData() {
		return mapData;
	}

	public void setMapData(int mapData) {
		this.mapData = mapData;
		if(mapData!=-1)
			mapAvailable=true;
	}
	
	public boolean isMapAvailable(){
		return mapAvailable;
	}
}
