package mx.androidtitlan.semanadelemprendedor.interfaces.home;

import mx.androidtitlan.semanadelemprendedor.R;
import mx.androidtitlan.semanadelemprendedor.entities.MainExploreRowItem;
import mx.androidtitlan.semanadelemprendedor.interfaces.AdapterCommand;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EcosystemsItemInflationAction implements AdapterCommand{
	@Override
	public View execute(Object data, View v) {
		MainExploreRowItem d = (MainExploreRowItem) data;
		((TextView)v.findViewById(R.id.row_ecosystems_txt_title)).setText(d.getTitle());
		((ImageView)v.findViewById(R.id.row_ecosystems_img)).setImageResource(d.getDrawableId());
		v.setTag(d.getAction());
		return v;
	}
}
