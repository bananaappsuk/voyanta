package controller;

import model.RequestBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class AdditionController {


    private final AtomicLong counter = new AtomicLong();

  //  @RequestMapping(value= "addition", method= RequestMethod.POST)
  //  @ResponseBody
//    public String add(@RequestBody RequestBean requestBean){
//        return "saved request";
//    }

    @RequestMapping("/greeting")
    public @ResponseBody RequestBean greeting(@RequestParam(value="operation", defaultValue="ADDITION") String operation) {
        return new RequestBean(counter.incrementAndGet(),1, 2,
                operation);
    }

}
