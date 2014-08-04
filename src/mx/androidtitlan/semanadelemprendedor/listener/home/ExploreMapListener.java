package mx.androidtitlan.semanadelemprendedor.listener.home;

import mx.androidtitlan.semanadelemprendedor.activity.MapActivity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class ExploreMapListener implements OnClickListener{
	@Override
	public void onClick(View v) {
		v.getContext().startActivity(new Intent(v.getContext(), MapActivity.class));
//		Toast.makeText(v.getContext(), "You pressed the map!", Toast.LENGTH_SHORT).show();
	}
}
