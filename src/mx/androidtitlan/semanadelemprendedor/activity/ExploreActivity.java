package mx.androidtitlan.semanadelemprendedor.activity;

import mx.androidtitlan.semanadelemprendedor.R;
import mx.androidtitlan.semanadelemprendedor.adapter.CustomPagerAdapter;
import mx.androidtitlan.semanadelemprendedor.fragment.SessionDetailFragment;
import mx.androidtitlan.semanadelemprendedor.util.Utils;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

public class ExploreActivity extends ActionBarActivity {

	private CustomPagerAdapter cAdapter;
	private ViewPager mViewPager;
	private int ecoId;

	private final static String BUNDLE_CURRENT_TAB = "CurrentTab";
	public final static String BUNDLE_INTENT_ECOID = "EcoId";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_explore);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);

		if (getIntent().getExtras() != null) {
			ecoId = getIntent().getExtras().getInt(BUNDLE_INTENT_ECOID);
			String title = Utils.ECOSYSTEM_NAMES[ecoId];
			if (title != null)
				actionBar.setTitle(title);
			actionBar.setIcon(Utils.ECOSYSTEM_ICONS[ecoId]);
		}

		
		mViewPager = (ViewPager) findViewById(R.id.act_explore_pager);
		if (mViewPager != null) {
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
			cAdapter = new CustomPagerAdapter(getSupportFragmentManager(),
					CustomPagerAdapter.PAGER_ECOSYSTEM, ecoId);
			mViewPager.setAdapter(cAdapter);

			ActionBar.TabListener tabListener = new ActionBar.TabListener() {
				@Override
				public void onTabSelected(Tab tab, FragmentTransaction ft) {
					mViewPager.setCurrentItem(tab.getPosition());
				}

				@Override
				public void onTabUnselected(Tab tab, FragmentTransaction ft) {
				}

				@Override
				public void onTabReselected(Tab tab, FragmentTransaction ft) {
				}
			};

			actionBar.addTab(actionBar.newTab()
					.setText(R.string.act_explore_tab_speakers)
					.setTabListener(tabListener));
			actionBar.addTab(actionBar.newTab()
					.setText(R.string.act_explore_tab_sessions)
					.setTabListener(tabListener));

			mViewPager
					.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
						@Override
						public void onPageSelected(int position) {
							getSupportActionBar().setSelectedNavigationItem(
									position);
						}
					});

			if (savedInstanceState != null)
				actionBar.setSelectedNavigationItem(savedInstanceState
						.getInt(BUNDLE_CURRENT_TAB));
		}else{
			FragmentManager fm = getSupportFragmentManager();
			FragmentTransaction t = fm.beginTransaction();
			//Add SessionList 
//			t.add(R.id.act_explore_container_speakers,
//					CustomPagerAdapter.generateFragment(CustomPagerAdapter.FRAGMENT_SPEAKERS,
//							ecoId));
			t.add(R.id.act_explore_container_speakers, CustomPagerAdapter.generateFragment(CustomPagerAdapter.FRAGMENT_SESSIONS,ecoId));
			
			//Then Details
//			t.add(R.id.act_explore_container_sessions,
//					CustomPagerAdapter.generateFragment(CustomPagerAdapter.FRAGMENT_SESSIONS,
//							ecoId));
			t.add(SessionDetailFragment.newInstance(ecoId, 0), "");
			t.commit();
		}
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt(BUNDLE_CURRENT_TAB, getSupportActionBar()
				.getSelectedNavigationIndex());
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			return true;
		}
		return true;
	}
}
