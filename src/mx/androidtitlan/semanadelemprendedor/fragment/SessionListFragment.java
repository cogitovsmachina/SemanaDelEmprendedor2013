package mx.androidtitlan.semanadelemprendedor.fragment;

import java.util.ArrayList;
import java.util.Arrays;

import mx.androidtitlan.semanadelemprendedor.R;
import mx.androidtitlan.semanadelemprendedor.adapter.UniversalListAdapter;
import mx.androidtitlan.semanadelemprendedor.entities.HeadedList;
import mx.androidtitlan.semanadelemprendedor.entities.MainAgendaRowItem;
import mx.androidtitlan.semanadelemprendedor.entities.MainExploreRowItem;
import mx.androidtitlan.semanadelemprendedor.interfaces.explore.SpeakerItemInflationAction;
import mx.androidtitlan.semanadelemprendedor.interfaces.home.AgendaHeaderInflationAction;
import mx.androidtitlan.semanadelemprendedor.interfaces.home.AgendaItemInflationAction;
import mx.androidtitlan.semanadelemprendedor.interfaces.home.EcosystemsItemInflationAction;
import mx.androidtitlan.semanadelemprendedor.listener.explore.SpeakersOnItemClickListener;
import mx.androidtitlan.semanadelemprendedor.listener.home.AgendaOnItemClickListener;
import mx.androidtitlan.semanadelemprendedor.listener.home.EcosystemsOnItemClickListener;
import mx.androidtitlan.semanadelemprendedor.listener.home.ExploreMapListener;
import mx.androidtitlan.semanadelemprendedor.util.Utils;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SessionListFragment extends Fragment{

	public static final int LIST_TYPE_AGENDA = 0;
	public static final int LIST_TYPE_ECOSYSTEM = 1;
	public static final int LIST_TYPE_SPEAKERS = 2;

	private int dataType;
	private int dataId;

	private Bundle b;
	public final static String BUNDLE_TYPE = "dataType";
	public final static String BUNDLE_ID = "dataId";

	private ListView sessionsList;
	private LayoutInflater inflater;
	private DataGetterAsyncTask task;
	private TextView tv;

	private final static String ECOSYSTEM_TITLE = "Ecosistemas";
	
	public static Fragment newInstance(Object dataType,
			Object dataId) {
        Fragment f = new SessionListFragment();

        Bundle args = new Bundle();
        args.putInt(BUNDLE_TYPE, (Integer)dataType);
        args.putInt(BUNDLE_ID, (Integer)dataId);
        f.setArguments(args);
        return f;
    }
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		b = getArguments();
		dataType = b.getInt(BUNDLE_TYPE);
		dataId = b.getInt(BUNDLE_ID);			
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_sessionlist, container,
				false);
		this.inflater = inflater;
		tv = (TextView) v.findViewById(R.id.frag_sessions_noinfo);
		sessionsList = (ListView) v.findViewById(R.id.frag_sessions_lv);

		//Checking if user selected Explore tab
		if (dataType == LIST_TYPE_ECOSYSTEM && dataId == Utils.LECTURE) {
			ViewGroup vg = (ViewGroup) v
					.findViewById(R.id.frag_sessions_header);
			View view = inflater.inflate(R.layout.view_minimap, null);

			final ImageView iv = (ImageView) view
					.findViewById(R.id.frag_explore_map_img);
			
			ViewTreeObserver vto = iv.getViewTreeObserver();
			vto.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {

			    @SuppressWarnings("deprecation")
				@SuppressLint("NewApi")
				@Override
			    public void onGlobalLayout() {
			    	int width = iv.getWidth();
			        ViewTreeObserver obs = iv.getViewTreeObserver();
			        
			        int mapDimension = getResources().getDimensionPixelSize(
							R.dimen.frag_explore_minimap);
					Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
							R.drawable.full_map);
					Bitmap finalBitmap;
					finalBitmap = Bitmap.createBitmap(bitmap, bitmap.getWidth() / 2
							- bitmap.getHeight() / 2, 0, width, mapDimension);
					
					iv.setImageBitmap(finalBitmap);
					iv.setOnClickListener(new ExploreMapListener());

			        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
			            obs.removeOnGlobalLayoutListener(this);
			        } else {
			            obs.removeGlobalOnLayoutListener(this);
			        }
			    }

			});
			
			vg.addView(view);
		}
		

		task = new DataGetterAsyncTask();
		task.execute();
		return v;
	}

	@Override
	public void onStop() {
		task.cancel(true);
		super.onStop();
	}

	private class DataGetterAsyncTask extends AsyncTask<Void, Void, Void> {
		ArrayList<Object> data;

		@Override
		protected Void doInBackground(Void... params) {
			switch (dataType) {
			case LIST_TYPE_AGENDA:
				renderAgenda();
				break;
			case LIST_TYPE_ECOSYSTEM:
				renderEcosystem();
				break;
			case LIST_TYPE_SPEAKERS:
				renderSpeakers();
			}
			return null;
		}

		private void renderSpeakers() {
			data = new ArrayList<Object>(Arrays.asList(Utils.speakers[dataId]));
		}

		private void renderEcosystem() {
			data = new ArrayList<Object>();
			for (int i = 0; i < 1; i++) {
				ArrayList<MainExploreRowItem> list = new ArrayList<MainExploreRowItem>();
				for (int j = 0; j < Utils.ECOSYSTEM_NAMES.length-1; j++)
					list.add(new MainExploreRowItem(
							Utils.ECOSYSTEM_NAMES[j], i * 100 + j,
							Utils.ECOSYSTEM_ICONS[j]));
				data.add(new HeadedList<String, MainExploreRowItem>(
						ECOSYSTEM_TITLE, list));
			}			
		}

		private void renderAgenda() {
			data = new ArrayList<Object>();
			for (int i = 0; i < Utils.EVENT_DATES.length; i++) {
				MainAgendaRowItem[] eventsForDay = Utils.events[i];
				ArrayList<MainAgendaRowItem> list = new ArrayList<MainAgendaRowItem>();
				if (dataId != -1){
					for(int j = 0; j < eventsForDay.length; j++)
						if(dataId==eventsForDay[j].getEcosystemId())
							list.add(eventsForDay[j]);
				}else
					list = new ArrayList<MainAgendaRowItem>(Arrays.asList(eventsForDay));
				
				if(list.size() != 0) 
					data.add(new HeadedList<String, MainAgendaRowItem>(
						Utils.EVENT_DATES[i], list));
			}
		}

		@Override
		protected void onPostExecute(Void result) {
			super.onPostExecute(result);
			if(data.isEmpty()){
				sessionsList.setVisibility(View.GONE);
				tv.setVisibility(View.VISIBLE);
				return;
			}
			
			switch (dataType) {
			case LIST_TYPE_AGENDA:
				sessionsList.setAdapter(new UniversalListAdapter(inflater,
						R.layout.row_agenda, data,
						new AgendaItemInflationAction(),
						R.layout.header_agenda,
						new AgendaHeaderInflationAction()));
				sessionsList
						.setOnItemClickListener(new AgendaOnItemClickListener());
				break;
			case LIST_TYPE_ECOSYSTEM:
				sessionsList.setAdapter(new UniversalListAdapter(inflater,
						R.layout.row_ecosystems, data,
						new EcosystemsItemInflationAction(),
						R.layout.header_agenda,
						new AgendaHeaderInflationAction()));
				sessionsList
						.setOnItemClickListener(new EcosystemsOnItemClickListener());
				break;
			case LIST_TYPE_SPEAKERS:
				sessionsList.setAdapter(new UniversalListAdapter(inflater,
						R.layout.row_speakers, data,
						new SpeakerItemInflationAction()));
				sessionsList
						.setOnItemClickListener(new SpeakersOnItemClickListener());
				break;
			}
		}
	}
}