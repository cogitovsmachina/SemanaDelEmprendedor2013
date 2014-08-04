package mx.androidtitlan.semanadelemprendedor.fragment;

import mx.androidtitlan.semanadelemprendedor.R;
import mx.androidtitlan.semanadelemprendedor.entities.MainAgendaRowItem;
import mx.androidtitlan.semanadelemprendedor.util.Utils;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.renderscript.Element.DataType;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SessionDetailFragment extends Fragment {
	public final static String BUNDLE_TYPE = "dataType";
	public final static String BUNDLE_ID = "dataId";
	private Bundle b;
	private MainAgendaRowItem data;
	private String BUNDLE_INTENT_DATA = "Data";
	private int dataType;
	private int dataId;

	public static SessionDetailFragment newInstance(Object dataType,
			Object dataId) {
		SessionDetailFragment fragment = new SessionDetailFragment();
		Bundle bundle = new Bundle();
		bundle.putInt(BUNDLE_TYPE, (Integer) dataType);
		bundle.putInt(BUNDLE_ID, (Integer) dataId);
		fragment.setArguments(bundle);
		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		b = getArguments();
		dataType = b.getInt(BUNDLE_INTENT_DATA);
		dataId = b.getInt(BUNDLE_ID);
	}

	@SuppressLint("NewApi")
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View frag = inflater.inflate(R.layout.fragment_sessiondetail,
				container, false);
		Bundle b = getActivity().getIntent().getExtras();
		if (b != null) {
			data = (MainAgendaRowItem) b.getSerializable(BUNDLE_INTENT_DATA);
			String title = Utils.ECOSYSTEM_NAMES[data.getEcosystemId()];
			if (title != null)
				getActivity().getActionBar().setTitle(title);
			getActivity().getActionBar().setIcon(
					Utils.ECOSYSTEM_ICONS[data.getEcosystemId()]);
			if (data != null) {
				((TextView) frag.findViewById(R.id.act_session_txt_title))
						.setText(data.getTitle());
				((TextView) frag.findViewById(R.id.act_session_txt_subtitle))
						.setText(data.getStartTime() + " a "
								+ data.getEndTime() + " en "
								+ data.getSubTitle());
				((TextView) frag.findViewById(R.id.act_session_txt_description))
						.setText(data.getDescription());

				ViewGroup vg = (ViewGroup) frag
						.findViewById(R.id.act_session_container_data);

				int speakerNum = data.getSpeakerName().length;
				if (speakerNum > 1)
					((TextView) frag
							.findViewById(R.id.act_session_txt_speakerheader))
							.setText(R.string.act_session_txt_speakers_plural);
				for (int i = 0; i < speakerNum; i++) {
					View v = getActivity().getLayoutInflater().inflate(
							R.layout.row_speakers_detail, null);
					((TextView) v.findViewById(R.id.row_speakers_txt_name))
							.setText(data.getSpeakerName()[i]);
					((TextView) v
							.findViewById(R.id.row_speakers_txt_description))
							.setText(data.getSpeakerDescription()[i]);
					if (data.getSpeakerImage().length > i)
						((ImageView) v.findViewById(R.id.row_speakers_img))
								.setImageResource(data.getSpeakerImage()[i]);
					vg.addView(v);
				}
			}
		}
		return frag;
	}
}
