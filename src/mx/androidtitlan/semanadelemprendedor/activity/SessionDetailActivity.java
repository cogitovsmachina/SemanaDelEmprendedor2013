package mx.androidtitlan.semanadelemprendedor.activity;

import mx.androidtitlan.semanadelemprendedor.R;
import mx.androidtitlan.semanadelemprendedor.entities.MainAgendaRowItem;
import mx.androidtitlan.semanadelemprendedor.util.Utils;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SessionDetailActivity extends ActionBarActivity{
	
	public final static String BUNDLE_INTENT_DATA = "Data";
	private MainAgendaRowItem data;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sessiondetail);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		Bundle b =getIntent().getExtras();
		if(b!=null){
			data = (MainAgendaRowItem) b.getSerializable(BUNDLE_INTENT_DATA);
				String title = Utils.ECOSYSTEM_NAMES[data.getEcosystemId()];
				if (title != null)
					actionBar.setTitle(title);
				actionBar.setIcon(Utils.ECOSYSTEM_ICONS[data.getEcosystemId()]);
			if(data!=null){
				((TextView)findViewById(R.id.act_session_txt_title))
					.setText(data.getTitle());
				((TextView)findViewById(R.id.act_session_txt_subtitle))
					.setText(data.getStartTime()+" a "+data.getEndTime()+" en "+data.getSubTitle());
				((TextView)findViewById(R.id.act_session_txt_description))
					.setText(data.getDescription());
				
				ViewGroup vg = (ViewGroup) findViewById(R.id.act_session_container_data);
				
				int speakerNum=data.getSpeakerName().length;
				if(speakerNum>1)
					((TextView)findViewById(R.id.act_session_txt_speakerheader))
						.setText(R.string.act_session_txt_speakers_plural);
				for(int i=0;i<speakerNum;i++){
					View v = getLayoutInflater().inflate(R.layout.row_speakers_detail, null);
					((TextView)v.findViewById(R.id.row_speakers_txt_name))
						.setText(data.getSpeakerName()[i]);
					((TextView)v.findViewById(R.id.row_speakers_txt_description))
						.setText(data.getSpeakerDescription()[i]);
					if(data.getSpeakerImage().length>i)
						((ImageView)v.findViewById(R.id.row_speakers_img))
							.setImageResource(data.getSpeakerImage()[i]);
					vg.addView(v);
				}
			}
		}
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			return true;
		}
		return true;
	}
}
