package com.udacity.gradle.builditbigger.backend;

import com.jokesgn.jokes;

/**
 * Created by osama on 5/24/2018.
 */

public class MyJoke {
    private String myData;
    jokes j = new jokes();

    public String getData() {
        return myData;
    }

    public void setData() {
        myData = j.getJoke();;
    }
}
