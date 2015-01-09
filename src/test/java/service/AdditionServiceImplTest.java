package service;

import model.RequestBean;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by takao on 09/01/2015.
 */
public class AdditionServiceImplTest {

    AdditionServiceImpl additionService;
    String requestJson;

    @Before
    public void setup(){
        System.out.println("Setting up tests");
        this.additionService = new AdditionServiceImpl();
        requestJson = "{\"inputOne\":5,\"inputTwo\":2,\"operation\":\"ADDITION\"}";
    }

    @Test
    public void testMakeRequest(){
        RequestBean request = additionService.makeRequest(requestJson);

        assertNotNull(request);
    }

    @Test
    public void testRequestInputValues(){
        RequestBean request = additionService.makeRequest(requestJson);

        assertNotEquals(request.getId(),0);
        assertEquals(request.getInputOne(), 5);
        assertEquals(request.getInputTwo(), 2);
        assertEquals(request.getOperation(), "ADDITION");

    }
}
