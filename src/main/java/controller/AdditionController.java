package controller;

import model.RequestBean;
import model.ResponseBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AdditionServiceImpl;

@Controller
public class AdditionController {

    AdditionServiceImpl additionService;

    @Autowired
    public AdditionController(AdditionServiceImpl additionService){
        this.additionService = additionService;
    }

    Logger logger = LoggerFactory.getLogger(AdditionController.class);

    /**
     * Part 1 of task - Create an API that does addition.
     * Request and Result returned as JSON
     */
    @RequestMapping(value= "addition",
            method= RequestMethod.POST,
            consumes= "application/json")
    public @ResponseBody ResponseBean addition(@RequestBody String requestJson){
        RequestBean request = additionService.makeRequest(requestJson);
        ResponseBean response = additionService.doAddition(request);
        return response;
    }

//    /**
//     * Part 2 of task - Create an API that does addition.
//     * Request and Result returned as JSON
//     */
//    @RequestMapping(value= "Listaddition",
//            method= RequestMethod.POST,
//            consumes= "application/json")
//    public @ResponseBody ResponseBean listAddition(@RequestBody String requestJson){
//        RequestBean request = additionService.makeListRequest(requestJson);
//        ResponseBean response = additionService.doAddition(request);
//        return response;
//    }

}
