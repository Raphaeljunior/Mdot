/**
 * 
 */
package org.cdckemri.mdot;

//import org.cdckemri.mdot.Reg_p_MainActivity.RegPatientPagerAdapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.TextView;

/**
 * @author admin
 *
 */
public class Reg_p_MainActivity extends FragmentActivity implements dataListener {
		/**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 3;

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
		setContentView(R.layout.activity_p_reg);
		mPager = (ViewPager) findViewById(R.id.pagerPatientReg);
        mPagerAdapter = new RegPatientPagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        setupLocation();
        String userName ="sa";
        String password ="root";
        int port= 1433;

        String connectionurl ="jdbc:sqlserver://localhost:1433;loginTimeout=90; databaseName=MDOT";

        try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			Connection con = DriverManager.getConnection(connectionurl, userName, password);
			Log.e("Connection obtained", "Congratulations");
			Statement statemet1 = con.createStatement();
			Log.e("Statement Created", "Perfect");
			ResultSet rs = statemet1.executeQuery("SELECT COUNT (*)FROM DAILYDOT;");
			Log.e("SELECT query executed", "Perfect");
			if(rs.next()){
				Log.e("Product count:" + rs.getInt(1), "There!");
			}
			rs.close();
			statemet1.close();
			con.close();
			Log.e("Resources released", "There!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
    		// TODO Auto-generated method stubo
    		}
    		};
    		//register the locManager to get location updates:
    		locManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locListener);
    		}
         protected void showLocation(Location location) {
    	TextView lblpatientGPSlat = (TextView) findViewById(R.id.lblpatientGPSlat);
    	TextView lblpatientGPSlong = (TextView) findViewById(R.id.lblpatientGPSlong);
    	lblpatientGPSlat.setText(String.format("%f", location.getLatitude()));
    	lblpatientGPSlong.setText(String.format("%f", location.getLongitude()));
             Uri.Builder builder = new Uri.Builder();
             builder.scheme("http").authority("10.0.2.2").appendPath("Health").appendPath("add.php");
             builder.appendQueryParameter("fname","").appendQueryParameter("lname","");
            String url = builder.build().toString();
             new NetworkConnection(this).execute(url);
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
	public Reg_p_MainActivity() {
		// TODO Auto-generated constructor stub
	}

    @Override
    public void listen(String data) {
       
    }

    private  class RegPatientPagerAdapter extends FragmentStatePagerAdapter {
        public RegPatientPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
    	public Fragment getItem(int position) {
			switch (position) {
			case 0:
				return new Reg_p_Fragment1();
			case 1:
				return new Reg_p_Fragment2();
			case 2:
				return new Reg_p_Fragment3();
			
			default:
				return new Reg_p_Fragment1();

			
			}
			
		

    }


        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
