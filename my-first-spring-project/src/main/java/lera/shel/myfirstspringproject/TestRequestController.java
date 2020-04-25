package lera.shel.myfirstspringproject;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRequestController {
    @RequestMapping(value = "/helloget", method = {RequestMethod.GET, RequestMethod.POST},
            produces = {
            MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE
    })
    @ResponseBody
    String get() {
        return "Hello from get/post";
    }

//    @RequestMapping(value = "/helloget", method = RequestMethod.POST)
//    String post() {
//        return "Hello from post";
//    }
}
