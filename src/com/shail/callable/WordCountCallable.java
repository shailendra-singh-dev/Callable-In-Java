package com.shail.callable;

import java.util.concurrent.Callable;

public class WordCountCallable implements Callable<Integer> {

    private String mWord;

    public WordCountCallable(String word) {
	mWord = word;
    }

    @Override
    public Integer call() throws Exception {
	return mWord.length();
    }

}
