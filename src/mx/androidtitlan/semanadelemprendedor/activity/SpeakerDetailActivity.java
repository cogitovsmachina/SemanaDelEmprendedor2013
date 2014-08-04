package mx.androidtitlan.semanadelemprendedor.activity;

import mx.androidtitlan.semanadelemprendedor.R;
import mx.androidtitlan.semanadelemprendedor.entities.ExploreSpeakerRowItem;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class SpeakerDetailActivity extends ActionBarActivity{
	
	public final static String BUNDLE_INTENT_DATA = "Data";
	private ExploreSpeakerRowItem data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_speakerdetail);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		Bundle b =getIntent().getExtras();
		if(b!=null){
			data = (ExploreSpeakerRowItem) b.getSerializable(BUNDLE_INTENT_DATA);
			if(data!=null){
				String title = data.getTitle();
				if (title != null)
					actionBar.setTitle(title);
				((TextView)findViewById(R.id.act_speaker_txt_description))
					.setText(data.getDescription());
				((ImageView)findViewById(R.id.act_speaker_img_logo))
					.setImageResource(data.getImageId());
			}
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.act_detail, menu);
	    return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			return true;
		case R.id.action_map:
			Intent intent = new Intent(getApplicationContext(), MapActivity.class);
			intent.putExtra("eco", data.getEcosystem());
			intent.putExtra("title", data.getTitle());
			intent.putExtra("lat", data.getLat());
			intent.putExtra("lon", data.getLon());
			startActivity(intent);
			//startActivity(new Intent(getApplicationContext(), MapActivity.class));
			return true;
		}
		return true;
	}
}
