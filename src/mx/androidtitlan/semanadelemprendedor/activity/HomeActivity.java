package mx.androidtitlan.semanadelemprendedor.activity;


import mx.androidtitlan.semanadelemprendedor.R;
import mx.androidtitlan.semanadelemprendedor.adapter.CustomPagerAdapter;
import mx.androidtitlan.semanadelemprendedor.util.Utils;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBarActivity;

public class HomeActivity extends ActionBarActivity {

	private final static String BUNDLE_CURRENT_TAB = "CurrentTab";
	private CustomPagerAdapter cAdapter;
	private ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);

		mViewPager = (ViewPager) findViewById(R.id.act_main_pager);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setLogo(getResources().getDrawable(R.drawable.header));
		actionBar.setTitle("");
		
		//Checking if is Phone
		if(mViewPager!=null){

			cAdapter = new CustomPagerAdapter(getSupportFragmentManager(),
					CustomPagerAdapter.PAGER_HOME, Utils.LECTURE);
			mViewPager.setAdapter(cAdapter);
		
			actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

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
					.setText(R.string.act_main_tab_agenda)
					.setTabListener(tabListener));
			actionBar.addTab(actionBar.newTab()
					.setText(R.string.act_main_tab_explore)
					.setTabListener(tabListener));
			actionBar.addTab(actionBar.newTab()
					.setText(R.string.act_main_tab_stream)
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
			t.add(R.id.act_home_container_agenda,
					CustomPagerAdapter.generateFragment(CustomPagerAdapter.FRAGMENT_AGENDA,
							Utils.LECTURE));
			t.add(R.id.act_home_container_explore,
					CustomPagerAdapter.generateFragment(CustomPagerAdapter.FRAGMENT_EXPLORE,
							Utils.LECTURE));
			t.add(R.id.act_home_container_stream,
					CustomPagerAdapter.generateFragment(CustomPagerAdapter.FRAGMENT_STREAM,
							Utils.LECTURE));
			t.commit();
		}
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt(BUNDLE_CURRENT_TAB, getSupportActionBar()
				.getSelectedNavigationIndex());
	}
}
