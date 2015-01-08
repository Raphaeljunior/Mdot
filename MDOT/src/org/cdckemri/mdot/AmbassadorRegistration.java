package org.cdckemri.mdot;

import android.support.v4.app.*;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;

public class AmbassadorRegistration extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_a_reg);
		 setupLocation();
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}
	private void setupLocation() {
		// TODO Auto-generated method stub
    	// get the location manager service:
    	LocationManager locManager = (LocationManager)
    	this.getSystemService(Context.LOCATION_SERVICE);
    	// set up a location listener for the service:
    	LocationListener locListener = new LocationListener() {
    		@Override
    		public void onLocationChanged(Location location) {
    		// TODO Auto-generated method stub
    		showLocation(location);
    		}
    		@Override
    		public void onProviderDisabled(String provider) {
    		// TODO Auto-generated method stub
    		}
    		@Override
    		public void onProviderEnabled(String provider) {
    		// TODO Auto-generated method stub
    		}
    		@Override
    		public void onStatusChanged(String provider, int status,
    		Bundle extras) {
    		// TODO Auto-generated method stub
    		}
    		};
    		//register the locManager to get location updates:
    		locManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locListener);
    		}
         protected void showLocation(Location location) {
    	TextView lblambassadorGPSlat = (TextView) findViewById(R.id.lblambassadorGPSlat);
    	TextView lblambassadorGPSlong = (TextView) findViewById(R.id.lblambassadorGPSlong);
    	lblambassadorGPSlat.setText(String.format("%f", location.getLatitude()));
    	lblambassadorGPSlong.setText(String.format("%f", location.getLongitude()));
    	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ambassador_registration, menu);
		return true;
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
			View rootView = inflater
					.inflate(R.layout.fragment_a_reg,
							container, false);
			return rootView;
		}
	}

}
