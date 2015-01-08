package org.cdckemri.mdot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends FragmentActivity {
	//Button btnLogin;
    EditText userName;
    EditText inputPassword;
    TextView loginErrorMsg;
    TextView btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
		// Importing all assets like buttons, text fields
		userName = (EditText) findViewById(R.id.username);
        inputPassword = (EditText) findViewById(R.id.password);

        btnCancel = (Button) findViewById(R.id.btnCancel);
       //loginErrorMsg = (TextView) findViewById(R.id.login_error);
        //btnLogin = (Button) findViewById(R.id.btnLogin);
        
  
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();

	        }

        }//closes oncreate method

    /** Called when the user touches the button */
    public void logUseronclick(View view){
        // Do something in response to button click
    	Intent intent = new Intent(MainActivity.this,Home.class); 
   		  startActivity(intent);
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
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_login, container, false);
            return rootView;
        }
    }



	//@Override
	//public void onClick(View v) {
		// TODO Auto-generated method stub
		
	//}

}
