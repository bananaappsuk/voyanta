package model;

/**
 * Created by takao on 05/01/2015.
 */
public class RequestBean {
    private long id;
    private int inputOne;
    private int inputTwo;
    private String operation;

    public int getInputOne() {
        return inputOne;
    }

    public void setInputOne(int inputOne) {
        this.inputOne = inputOne;
    }

    public int getInputTwo() {
        return inputTwo;
    }

    public void setInputTwo(int inputTwo) {
        this.inputTwo = inputTwo;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
