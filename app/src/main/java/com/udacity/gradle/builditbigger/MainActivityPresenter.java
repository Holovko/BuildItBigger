package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.udacity.jokedisplay.JokeActivity;

/**
 * Created by andreyholovko on 2/10/16.
 */
public class MainActivityPresenter {

    Context mContext;
    MainActivityView mView;

    public MainActivityPresenter(Context context, MainActivityView view)
    {
        mContext = context;
        mView = view;
    }

    void showJoke() {
        mView.setMyProgressBarVisibility(true);
        new GetJokeAsyncTask(){
            @Override
            protected void onPostExecute(String jokeString) {
                super.onPostExecute(jokeString);
                if(jokeString!=null){
                    startJokeActivity(jokeString);
                }else{
                    Toast.makeText(mContext, R.string.msg_error_retrieve, Toast.LENGTH_LONG).show();
                }
                mView.setMyProgressBarVisibility(false);
            }
        }.execute();
    }

    private void startJokeActivity(String jokeString) {
        Intent intent = new Intent(mContext, JokeActivity.class);
        intent.putExtra(JokeActivity.EXTRA_JOKE_KEY, jokeString);
        mContext.startActivity(intent);
    }
}
