package mx.androidtitlan.semanadelemprendedor.interfaces.explore;

import mx.androidtitlan.semanadelemprendedor.R;
import mx.androidtitlan.semanadelemprendedor.entities.ExploreSpeakerRowItem;
import mx.androidtitlan.semanadelemprendedor.interfaces.AdapterCommand;
import android.view.View;
import android.widget.TextView;

public class SpeakerItemInflationAction implements AdapterCommand{
	@Override
	public View execute(Object data, View v) {
		ExploreSpeakerRowItem d = (ExploreSpeakerRowItem) data;
		((TextView)v.findViewById(R.id.row_speakers_txt_title)).setText(d.getTitle());
//		((ImageView)v.findViewById(R.id.row_speakers_img)).setImageDrawable(d.getImage());
		v.setTag(d);
		return v;
	}
}
