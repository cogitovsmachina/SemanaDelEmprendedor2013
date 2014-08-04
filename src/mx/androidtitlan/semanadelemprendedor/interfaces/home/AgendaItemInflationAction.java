package mx.androidtitlan.semanadelemprendedor.interfaces.home;

import mx.androidtitlan.semanadelemprendedor.R;
import mx.androidtitlan.semanadelemprendedor.entities.MainAgendaRowItem;
import mx.androidtitlan.semanadelemprendedor.interfaces.AdapterCommand;
import android.view.View;
import android.widget.TextView;

public class AgendaItemInflationAction implements AdapterCommand {
	@Override
	public View execute(Object data, View v) {
		MainAgendaRowItem d = (MainAgendaRowItem) data;
		String speaker = d.getSpeakerName()[0];
		if(d.getSpeakerName().length>1)
			speaker+=" y "+d.getSpeakerName()[1];
		((TextView) v.findViewById(R.id.row_agenda_txt_speaker)).setText(speaker);
		((TextView) v.findViewById(R.id.row_agenda_txt_title)).setText(d
				.getTitle());
		((TextView) v.findViewById(R.id.row_agenda_txt_subtitle)).setText(d
				.getSubTitle());
		((TextView) v.findViewById(R.id.row_agenda_txt_time)).setText(d
				.getStartTime() + "\na\n" + d.getEndTime());
		v.setTag(d);
		return v;
	}
}
