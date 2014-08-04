package mx.androidtitlan.semanadelemprendedor.adapter;

import mx.androidtitlan.semanadelemprendedor.fragment.SessionListFragment;
import mx.androidtitlan.semanadelemprendedor.fragment.WebViewFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomPagerAdapter extends FragmentPagerAdapter{

	public final static int PAGER_HOME = 0;
	public final static int PAGER_ECOSYSTEM = 1;
	
	public final static int PAGER_HOME_NUM = 3;
	public final static int PAGER_ECOSYSTEM_NUM = 2;
	
	public final static int FRAGMENT_AGENDA = 0;
	public final static int FRAGMENT_EXPLORE = 1;
	public final static int FRAGMENT_STREAM = 2;
	
	public final static int FRAGMENT_SPEAKERS = 3;
	public final static int FRAGMENT_SESSIONS = 4;
	
	private int pagerType;
	private int ecoId;
	
	public CustomPagerAdapter(FragmentManager fm, int pagerType, int ecoId) {
		super(fm);
		this.pagerType=pagerType;
		this.ecoId=ecoId;
	}

	@Override
	public Fragment getItem(int index) {
		switch (pagerType) {
		case PAGER_HOME:
			return generateFragment(index, ecoId);
		case PAGER_ECOSYSTEM:
			return generateFragment(index+PAGER_HOME_NUM, ecoId);
		}
		return null;
	}

	@Override
	public int getCount() {
		switch (pagerType) {
		case PAGER_HOME:
			return PAGER_HOME_NUM;
		case PAGER_ECOSYSTEM:
			return PAGER_ECOSYSTEM_NUM;
		}
		return 0;
	}
	
	 public static Fragment generateFragment(int type, int id) {
		switch (type) {
		case FRAGMENT_AGENDA:
			return SessionListFragment
					.newInstance(SessionListFragment.LIST_TYPE_AGENDA,
						id);
		case FRAGMENT_EXPLORE:
			return SessionListFragment
				.newInstance(SessionListFragment.LIST_TYPE_ECOSYSTEM,
						id);
		case FRAGMENT_STREAM:
			return new WebViewFragment();
		case FRAGMENT_SPEAKERS:
			return SessionListFragment
				.newInstance(SessionListFragment.LIST_TYPE_SPEAKERS,
						id);
		case FRAGMENT_SESSIONS:
			return SessionListFragment
				.newInstance(SessionListFragment.LIST_TYPE_AGENDA,
						id);
		}
		return null;
	}
}
