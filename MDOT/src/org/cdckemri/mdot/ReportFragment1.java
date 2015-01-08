package org.cdckemri.mdot;

import org.cdckemri.mdot.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ReportFragment1 extends Fragment {

	   
	/**
     * The argument key for the page number this fragment represents.
     */
    public static final String ARG_PAGE = "page";

    /**
     * The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
     */
    private int mPageNumber;

    /**
     * Factory method for this fragment class. Constructs a new fragment for the given page number.
     */
    public static ReportFragment1 create(int pageNumber) {
    	ReportFragment1 fragment = new ReportFragment1();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ReportFragment1() {
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
    	View view = inflater.inflate(R.layout.fragment_report1, container, false);
		TextView textView = (TextView) view.findViewById(R.id.lblPageNumber);
		textView.setText("trial fragment");
		return view;
     /*          
    	ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_report1, container, false);
    	
        // Set the title view to show the page number.
        ((TextView) rootView.findViewById(R.id.lblPageNumber)).setText(
               getString(R.string.title_fragment_report1, mPageNumber + 1));

        return rootView;*/
    }

    /**
     * Returns the page number represented by this fragment object.
     
   public int getPageNumber() {
        return mPageNumber;
    }*/


	}//end ReportFragment1

