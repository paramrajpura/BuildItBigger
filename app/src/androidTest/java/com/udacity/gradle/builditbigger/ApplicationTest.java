package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.content.Context;
import android.test.ApplicationTestCase;
import android.util.Pair;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }
    public void testAsyncTask(){
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        String result = task.doInBackground(getContext());
        assertFalse(result.isEmpty());
    }
}