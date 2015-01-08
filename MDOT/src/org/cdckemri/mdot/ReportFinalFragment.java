/**
 * 
 */
package org.cdckemri.mdot;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @author admin
 *
 */
public class ReportFinalFragment extends Fragment {
    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_daily_report, container, false);

        return rootView;
    }*/
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
public static ReportFinalFragment create(int pageNumber) {
	ReportFinalFragment fragment = new ReportFinalFragment();
    Bundle args = new Bundle();
    args.putInt(ARG_PAGE, pageNumber);
    fragment.setArguments(args);
    return fragment;
}

public ReportFinalFragment() {
}

@Override
public void onCreate(Bundle savedInstanceState) {
	try {
    super.onCreate(savedInstanceState);
    mPageNumber = getArguments().getInt(ARG_PAGE);
    
	} catch (Throwable any) {
        System.out.println("Java ERROR: "+any);
        any.printStackTrace();
 }
}

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
    // Inflate the layout containing a title and body text.
    ViewGroup rootView = (ViewGroup) inflater
            .inflate(R.layout.activity_report, container, false);

    // Set the title view to show the page number.
    ((TextView) rootView.findViewById(android.R.id.text1)).setText(
            getString(R.string.title_activity_daily_report, mPageNumber + 1));

    return rootView;
}

/**
 * Returns the page number represented by this fragment object.
 */
public int getPageNumber() {
    return mPageNumber;
}

}
