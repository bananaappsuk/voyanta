package controller;

import model.RequestBean;
import model.RequestWrapper;
import model.ResponseBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class AdditionController {


    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value= "/addition",
            method= RequestMethod.POST,
            consumes= "application/json")
    public @ResponseBody ResponseBean addition(@RequestBody RequestBean requestBean){
        RequestWrapper request = new RequestWrapper(counter.incrementAndGet(), requestBean);
        ResponseBean response = new ResponseBean(
                counter.incrementAndGet(),
                (double) request.getRequestBean().getInputOne()
                        + request.getRequestBean().getInputTwo()
        );

        return response;
    }

}
