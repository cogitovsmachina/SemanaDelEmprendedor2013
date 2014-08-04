package mx.androidtitlan.semanadelemprendedor.listener.home;

import mx.androidtitlan.semanadelemprendedor.activity.ExploreActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class EcosystemsOnItemClickListener implements OnItemClickListener{
	@Override
	public void onItemClick(AdapterView<?> arg0, View view, int position,
			long arg3) {
		Intent intent = new Intent(view.getContext(), ExploreActivity.class);
		intent.putExtra(ExploreActivity.BUNDLE_INTENT_ECOID, (Integer)view.getTag());
		view.getContext().startActivity(intent);
//		Toast.makeText(view.getContext(),
//				"Pressed: "+Integer.toString((Integer)view.getTag()),
//				Toast.LENGTH_SHORT).show();
	}
}
