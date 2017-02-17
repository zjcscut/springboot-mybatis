package org.throwable.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjinci
 * @version 2017/2/16 10:06
 * @function
 */
@RestController
public class HelloController {


    @RequestMapping(value = "/hello1", method = RequestMethod.GET,
            produces = "application/json; charset=UTF-8")
    public String hello1() {
        String result = "zjcscut";
        result += "dadasdasdasd";
        return result;
    }

}
