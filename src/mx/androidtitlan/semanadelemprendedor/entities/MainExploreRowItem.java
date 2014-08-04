package mx.androidtitlan.semanadelemprendedor.entities;

public class MainExploreRowItem {
	private String title;
	private int action;
	private int drawableId;
	
	public MainExploreRowItem(String title, int action, int drawableId) {
		super();
		this.title = title;
		this.action = action;
		this.drawableId=drawableId;
	}
	
	public int getDrawableId() {
		return drawableId;
	}

	public void setDrawableId(int drawableId) {
		this.drawableId = drawableId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}
}
