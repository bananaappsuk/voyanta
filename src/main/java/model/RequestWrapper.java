package model;

/**
 * Created by takao on 08/01/2015.
 */
public class RequestWrapper {
    private final long id;
    private final RequestBean requestBean;

    public RequestWrapper(long id, RequestBean requestBean) {
        this.id = id;
        this.requestBean = requestBean;
    }

    public RequestBean getRequestBean(){
        return requestBean;
    }

    public long getId(){
        return id;
    }
}
