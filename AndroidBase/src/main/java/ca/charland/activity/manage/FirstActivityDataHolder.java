package ca.charland.activity.manage;

import android.app.Activity;
import ca.charland.R;

public class FirstActivityDataHolder implements MultipleActivityData {

	@Override
	public int getAdd() {
		return R.string.add_new_person;
	}

	@Override
	public int getView() {
		return R.string.view_person;
	}

	@Override
	public void onKeyBackDown(Activity activity) {
		exit(activity);		
	}

	public static void exit(Activity activity) {
		activity.finish();
		System.exit(0);
	}

	@Override
	public Class<?> getNextAddClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getNextViewClass() {
		// TODO Auto-generated method stub
		return null;
	}
}
