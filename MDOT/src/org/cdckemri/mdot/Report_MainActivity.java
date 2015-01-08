package org.cdckemri.mdot;

//import org.cdckemri.mdot.ReportFragment2.ScreenSlidePagerAdapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class Report_MainActivity extends FragmentActivity {
	/**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 6;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager mPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_report);
      //try {
		// Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ReportPagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        /*mPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @TargetApi(Build.VERSION_CODES.HONEYCOMB)
 			@Override
            public void onPageSelected(int position) {
                // When changing pages, reset the action bar actions since they are dependent
                // on which page is currently active. An alternative approach is to have each
                // fragment expose actions itself (rather than the activity exposing actions),
                // but for simplicity, the activity provides the actions in this sample.
                invalidateOptionsMenu();
            }
        });
       }
       catch (Throwable any) {
           System.out.println("Java ERROR: "+any);
           any.printStackTrace();
           }*/
	}
	   @Override
	    public void onBackPressed() {
	        if (mPager.getCurrentItem() == 0) {
	            // If the user is currently looking at the first step, allow the system to handle the
	            // Back button. This calls finish() on this activity and pops the back stack.
	            super.onBackPressed();
	        } else {
	            // Otherwise, select the previous step.
	            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
	        }
	     
       
       
   }// onBackpressed

  /* @TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@Override
   public boolean onCreateOptionsMenu(Menu menu) {
       super.onCreateOptionsMenu(menu);
       *//** Handle action bar item clicks here. The action bar will
       *automatically handle clicks on the Home/Up button, so long
       *as you specify a parent activity in AndroidManifest.xml.
       *//*
       getMenuInflater().inflate(R.menu.fragment_report1, menu);

      menu.findItem(R.id.action_previous).setEnabled(mPager.getCurrentItem() > 0);

       // Add either a "next" or "finish" button to the action bar, depending on which page
       // is currently selected.
       MenuItem item = menu.add(Menu.NONE, R.id.action_next, Menu.NONE,
               (mPager.getCurrentItem() == mPagerAdapter.getCount() - 1)
                       ? R.string.action_finish
                       : R.string.action_next);
       item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
       return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId()) {
           case android.R.id.home:
               // Navigate "up" the demo structure to the launchpad activity.
               // See http://developer.android.com/design/patterns/navigation.html for more.
               NavUtils.navigateUpTo(this, new Intent(this, MainActivity.class));
               return true;

           case R.id.action_previous:
               // Go to the previous step in the wizard. If there is no previous step,
               // setCurrentItem will do nothing.
               mPager.setCurrentItem(mPager.getCurrentItem() - 1);
               return true;

           case R.id.action_next:
               // Advance to the next step in the wizard. If there is no next step, setCurrentItem
               // will do nothing.
               mPager.setCurrentItem(mPager.getCurrentItem() + 1);
      
       }

       return super.onOptionsItemSelected(item);
   }*/

	    /**
	     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
	     * sequence.
	     */
	 private  class ReportPagerAdapter extends FragmentStatePagerAdapter {
	        public ReportPagerAdapter(FragmentManager fm) {
	            super(fm);
	        }

	        @Override
	    	public Fragment getItem(int position) {
				switch (position) {
				case 0:
					return new ReportFragment1();
				case 1:
					return new ReportFragment2();
				case 2:
					return new ReportFragment3();
				case 3:
					return new ReportFragment4();
				case 4:
					return new ReportFragment5();
				case 5:
					return new ReportFragment6();
				default:
					return new ReportFinalFragment();

				
				}
				
			

	    }


	        @Override
	        public int getCount() {
	            return NUM_PAGES;
	        }
	    }
}
