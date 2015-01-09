package service;

import model.ListResponseBean;
import model.RequestBean;
import model.ResponseBean;

/**
 * Created by takao on 09/01/2015.
 */
public interface AdditionService {

    public RequestBean makeRequest(String requestJson);
    public ResponseBean doAddition(RequestBean requestBean);
    public ListResponseBean doListAddition();
    public ListResponseBean doCacheListAddition();
}
