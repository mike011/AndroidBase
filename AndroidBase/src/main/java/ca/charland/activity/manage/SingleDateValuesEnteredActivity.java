package ca.charland.activity.manage;

import roboguice.activity.RoboActivity;
import android.os.Bundle;
import ca.charland.R;

/**
 * Shows the data entered for a specific date.
 * 
 * @author mcharland.
 */
public abstract class SingleDateValuesEnteredActivity extends RoboActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.person_date);
	}
}
