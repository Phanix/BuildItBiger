package com.udacity.gradle;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest implements EndpointsAsyncTask.AsyncTaskListener {

    @Test
    public void testEndpointsAsyncTask(){
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.setListener(this).execute();
    }

    @Override
    public String onComplete(String result) {
        Assert.assertEquals(result, "Whatâ€™s brown and sticky? A stick.");
        Assert.assertNotNull(result);
        return null;
    }
}
