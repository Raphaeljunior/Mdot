/**
 * 
 */
package org.cdckemri.mdot;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author admin
 *
 */
public class Reg_p_Fragment3 extends Fragment {
	/**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE1 = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     
    private int mPageNumber;*/

    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static Reg_p_Fragment3 create(int pageNumber) {
    	Reg_p_Fragment3 fragment = new Reg_p_Fragment3();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE1, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }
	/**
	 * 
	 */
	public Reg_p_Fragment3() {
		// TODO Auto-generated constructor stub
	}
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	    	super.onCreate(savedInstanceState);
	    	/* 	try {
	        super.onCreate(savedInstanceState);
	  
	        mPageNumber = getArguments().getInt(ARG_PAGE);
	        
	    	} catch (Throwable any) {
	            System.out.println("Java ERROR: "+any);
	            any.printStackTrace();
	     }*/
	    }
		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);

		}
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	    	View view = inflater.inflate(R.layout.fragment_p_reg3, container, false);
			
			return view;
	    }
}
