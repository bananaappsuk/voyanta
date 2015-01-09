package service;

import model.ListResponseBean;
import model.RequestBean;
import model.ResponseBean;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by takao on 09/01/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AdditionServiceImpl implements AdditionService {

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public RequestBean makeRequest(String requestJson) {
        RequestBean request = null;

        try {
            ObjectNode node = mapper.readValue(requestJson, ObjectNode.class);
            node.put("id",AdditionUtils.getId());
            request = mapper.convertValue(node, RequestBean.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return request;
    }

    @Override
    public ResponseBean doAddition(RequestBean request) {
        ResponseBean response = new ResponseBean(
                AdditionUtils.getId(),
                (double) request.getInputOne()
                        + request.getInputTwo()
        );
        return response;
    }

    @Override
    public ListResponseBean doListAddition() {
        return null;
    }

    @Override
    public ListResponseBean doCacheListAddition() {
        return null;
    }

}
