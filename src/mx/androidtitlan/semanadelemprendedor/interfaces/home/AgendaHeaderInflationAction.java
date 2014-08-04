package mx.androidtitlan.semanadelemprendedor.interfaces.home;

import mx.androidtitlan.semanadelemprendedor.R;
import mx.androidtitlan.semanadelemprendedor.interfaces.AdapterCommand;
import android.view.View;
import android.widget.TextView;

public class AgendaHeaderInflationAction implements AdapterCommand{
	@Override
	public View execute(Object data, View v) {
		((TextView)v.findViewById(R.id.header_agenda_txt)).setText((String)data);
		return v;
	}
}
