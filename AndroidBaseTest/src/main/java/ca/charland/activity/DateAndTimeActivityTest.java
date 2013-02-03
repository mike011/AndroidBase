package ca.charland.activity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.content.ContentValues;
import android.content.Intent;
import ca.charland.db.DataSource;
import ca.charland.db.DataTable;
import ca.charland.robolectric.AndroidBaseRobolectricTestRunner;

import com.google.inject.Inject;

/**
 * @author mcharland
 */
@RunWith(AndroidBaseRobolectricTestRunner.class)
public class DateAndTimeActivityTest {

	private static class ActivityUnderTest extends DateAndTimeActivity {

		@Override 
		protected DataSource getDataSource() {
			return new TestDataSource();
		}

		@Override
		protected NextButtonOnClickListener getNextButtonOnClickListener() {
			return null;
		}

		@Override
		protected Class<?> getNextClass() {
			return null;
		}
	}
	
	@Inject
	private ActivityUnderTest activity;

	@Before
	public void setup() {
		activity.setIntent(new Intent());
		activity.onCreate(null);
	}

	/**
	 * Test method for {@link ca.charland.activity.DateAndTimeActivity#getValues()}.
	 */
	@Test
	public final void testGetValues() {
		
		ContentValues values = activity.getValues();
		assertTrue(values.containsKey(DataTable.Column.DATE.toString()));
		Long object = (Long) values.get(DataTable.Column.DATE.toString());
		assertTrue(object.intValue() < 0);
	}

	/**
	 * Test method for {@link ca.charland.activity.DateAndTimeActivity#getNextClass()}.
	 */
	@Test
	public final void testGetNextClass() {
		assertEquals(null, activity.getNextClass());
	}
}