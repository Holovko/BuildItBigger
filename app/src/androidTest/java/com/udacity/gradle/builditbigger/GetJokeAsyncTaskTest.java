package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by andreyholovko on 2/11/16.
 */
public class GetJokeAsyncTaskTest extends AndroidTestCase {

    private static int TIMEOUT = 10;

    public void testJokeDownload() {
        GetJokeAsyncTask task = new GetJokeAsyncTask();
        try {
            String joke = task.get(TIMEOUT, TimeUnit.SECONDS);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}
