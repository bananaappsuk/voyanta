package service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by takao on 09/01/2015.
 */
public class AdditionUtils {

    private final static AtomicLong counter = new AtomicLong();

    public static long getId(){
        return counter.getAndIncrement();
    }

}

