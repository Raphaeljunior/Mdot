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
public class ReportFragment5 extends Fragment {
	public static final String ARG_PAGE = "page";


	 /** The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
	 */
	private int mPageNumber;

	/**
	 * Factory method for this fragment class. Constructs a new fragment for the given page number.
	 */
	public static ReportFragment5 create(int pageNumber) {
		ReportFragment5 fragment = new ReportFragment5();
	    Bundle args = new Bundle();
	    args.putInt(ARG_PAGE, pageNumber);
	    fragment.setArguments(args);
	    return fragment;
	}
	/**
	 * 
	 */
	public ReportFragment5() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	/**private void setCancelable(boolean b) {
		// TODO Auto-generated method stub
		
	}**/

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_report5, container, false);
		
		return view;
		
	}
}
