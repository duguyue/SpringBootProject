package org.lindl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lin on 2017/1/29.
 */
@Controller
public class ViewController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 测试hello
     * @return
     */
    @RequestMapping(value = "/view",method = RequestMethod.GET)
    public String hello(Model model) {
//        model.addAttribute("name", "Dear");
        return "page1";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}
