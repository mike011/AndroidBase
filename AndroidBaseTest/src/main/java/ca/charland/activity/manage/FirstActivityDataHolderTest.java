package ca.charland.activity.manage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import ca.charland.R;

public class FirstActivityDataHolderTest {

	private FirstActivityDataHolder activity;

	@Before
	public void setup() {
		activity = new FirstActivityDataHolder();
	}

	@Test
	public void constructor() {
		assertThat(activity, is(notNullValue()));
	}

	@Test
	public void testGetAdd() {
		assertThat(activity.getAdd(), is(R.string.add_new_person));
	}

	@Test
	public void testGetView() {
		assertThat(activity.getView(), is(R.string.view_person));
	}

	@Test
	public void testGetNextAddClass() {
		assertThat(activity.getNextAddClass().toString(), is(AddANewPersonActivity.class.toString()));
	}

	@Test
	public void testGetNextViewClass() {
		assertThat(activity.getNextViewClass().toString(), is(AllPeopleListActivity.class.toString()));
	}
}
