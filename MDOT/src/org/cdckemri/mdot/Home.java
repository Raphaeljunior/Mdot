package org.cdckemri.mdot;

import android.support.v4.app.FragmentActivity;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class Home extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}// closes onCreate method

    /** Called when the user touches the button */
    public void btnDailyReport(View view){
        // Do something in response to button click
    	Intent intent = new Intent(Home.this, Report_MainActivity.class); 
   		  startActivity(intent);
    }
    public void btnRegisterPatient(View view){
        // Do something in response to button click
    	Intent intent = new Intent(Home.this, Reg_p_MainActivity.class); 
   		  startActivity(intent);
    }
    public void btnRegisterAmbassador(View view){
        // Do something in response to button click
    	Intent intent = new Intent(Home.this, AmbassadorRegistration.class); 
   		  startActivity(intent);
    }
    public void btnViewPatients(View view){
        // Do something in response to button click
    	Intent intent = new Intent(Home.this, ViewPatientRecords.class); 
   		  startActivity(intent);
    }
   
   	public void btntreatmentInfo(View view){
        // Do something in response to button click
    	Intent intent = new Intent(Home.this, TreatmentInfo.class); 
   		  startActivity(intent);
 }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	   
    @Override
protected void onStart() {
    super.onStart();
    // The activity is about to become visible.
}
@Override
protected void onResume() {
    super.onResume();
    // The activity has become visible (it is now "resumed").
}
@Override
protected void onPause() {
    super.onPause();
    // Another activity is taking focus (this activity is about to be "paused").
}
@Override
protected void onStop() {
    super.onStop();
    // The activity is no longer visible (it is now "stopped")
}
@Override
protected void onDestroy() {
    
    // The activity is about to be destroyed.
     // Always call the superclass
	super.onDestroy();
    // Stop method tracing that the activity started during onCreate()
    android.os.Debug.stopMethodTracing();
}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_home,
					container, false);
			return rootView;
		}
	}

}
