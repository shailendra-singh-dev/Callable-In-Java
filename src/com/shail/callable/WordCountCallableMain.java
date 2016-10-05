package com.shail.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WordCountCallableMain {

    private static final int POOL_THREADS = 5;

    /**
     * @param args
     */
    public static void main(String[] args) {
	final WordCountCallable wordCountCallable = new WordCountCallable(
		args[0]);
	final ExecutorService executorService = Executors
		.newFixedThreadPool(POOL_THREADS);
	Future<Integer> futue = executorService.submit(wordCountCallable);
	int length = 0;
	try {
	    length = futue.get();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	} catch (ExecutionException e) {
	    e.printStackTrace();
	}
	System.out.print("length:" + length);
    }

}
