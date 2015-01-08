package model;

/**
 * Created by takao on 05/01/2015.
 */
public class ResponseBean {
    private final long id;
    private final double result;

    public ResponseBean(long id, double result) {
        this.id = id;
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public long getId() {
        return id;
    }

}
