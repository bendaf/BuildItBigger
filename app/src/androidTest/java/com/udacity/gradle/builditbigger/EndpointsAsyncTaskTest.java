package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestCase;
import android.test.mock.MockContext;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by bendaf on 2018. 08. 23. BuildItBigger.
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest extends InstrumentationTestCase{

    @Test
    public void testVerifyJokeResponse() {
        MainActivity.EndpointsAsyncTask a = new MainActivity.EndpointsAsyncTask();
        String s = a.doInBackground(new MockContext());
        assertNotNull(s);
        assertNotSame(s, "");
    }
}
