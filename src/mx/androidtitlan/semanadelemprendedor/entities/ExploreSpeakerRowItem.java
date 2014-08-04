package mx.androidtitlan.semanadelemprendedor.entities;

import java.io.Serializable;


public class ExploreSpeakerRowItem implements Serializable{
	private static final long serialVersionUID = 1L;
	private String title;
	private int id;
	private int imageId;
	private String description;
	private String ecosystem;
	private Double lat;
	private Double lon;
	
	public ExploreSpeakerRowItem(String title, int imageId, int id, String description, String ecosystem, Double lat, Double lon) {
		this.title = title;
		this.id = id;
		this.imageId = imageId;
		this.description = description;
		this.ecosystem = ecosystem;
		this.lat = lat;
		this.lon = lon;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int image) {
		this.imageId = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public String getEcosystem() {
		return ecosystem;
	}

	public void setEcosystem(String ecosystem) {
		this.ecosystem = ecosystem;
	}
}
