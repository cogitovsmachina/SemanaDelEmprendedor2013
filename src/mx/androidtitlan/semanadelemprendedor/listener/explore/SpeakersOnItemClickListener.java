package mx.androidtitlan.semanadelemprendedor.listener.explore;

import mx.androidtitlan.semanadelemprendedor.activity.SpeakerDetailActivity;
import mx.androidtitlan.semanadelemprendedor.entities.ExploreSpeakerRowItem;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class SpeakersOnItemClickListener implements OnItemClickListener{
	@Override
	public void onItemClick(AdapterView<?> arg0, View view, int position,
			long arg3) {
		Intent intent = new Intent(view.getContext(), SpeakerDetailActivity.class);
		intent.putExtra(SpeakerDetailActivity.BUNDLE_INTENT_DATA, (ExploreSpeakerRowItem)view.getTag());
		view.getContext().startActivity(intent);
//		Toast.makeText(view.getContext(),
//				"Pressed: "+Integer.toString((Integer)view.getTag()),
//				Toast.LENGTH_SHORT).show();
	}
}
