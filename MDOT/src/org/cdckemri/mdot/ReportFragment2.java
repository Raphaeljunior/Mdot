package org.cdckemri.mdot;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * The argument key for the page number this fragment represents.
 */
public class ReportFragment2 extends Fragment {
public static final String ARG_PAGE = "page";


 /** The fragment's page number, which is set to the argument value for {@link #ARG_PAGE}.
 */
private int mPageNumber;

/**
 * Factory method for this fragment class. Constructs a new fragment for the given page number.
 */
public static ReportFragment2 create(int pageNumber) {
	ReportFragment2 fragment = new ReportFragment2();
    Bundle args = new Bundle();
    args.putInt(ARG_PAGE, pageNumber);
    fragment.setArguments(args);
    return fragment;
}
public ReportFragment2() {
}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Log.e("Test", "hello");
		//this.setCancelable(true);
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
		View view = inflater.inflate(R.layout.fragment_report2, container, false);
		
		/*TextView textViewserialNolabel = (TextView)  view.findViewById(R.id.serialNolabel);
		EditText editTexttxtserialNo = (EditText) view.findViewById(R.id.txtserialNo);
		TextView textViewlblDrugTaken = (TextView)  view.findViewById(R.id.lblDrugTaken);
		TextView textViewlblReasonDrugNotTaken = (TextView)  view.findViewById(R.id.lblReasonDrugNotTaken);
		RadioButton radioButtonrbtnNo = (RadioButton) view.findViewById(R.id.rbtnNo);
		RadioButton radioButtonrbtnDontKnow = (RadioButton) view.findViewById(R.id.rbtnDontKnow);
		RadioButton radioButtonrbtnDenial = (RadioButton) view.findViewById(R.id.rbtnDenial);
		RadioButton radioButtonrbtnOtherDrugReaction = (RadioButton) view.findViewById(R.id.rbtnOtherDrugReaction);
		RadioButton radioButtonrbtnSick = (RadioButton) view.findViewById(R.id.rbtnSick);
		RadioButton radioButtonrbtnOther = (RadioButton) view.findViewById(R.id.rbtnOther);
		RadioButton radioButtonrbtnYes = (RadioButton) view.findViewById(R.id.rbtnYes);
		RadioButton radioButtonrbtnNotEatenFood = (RadioButton) view.findViewById(R.id.rbtnNotEatenFood);
		//TextView textView = (TextView) view.findViewById(R.id.detailsText);
		//textView.setText("Testing");
*/		return view;
		
	}
}


