package org.lindl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lin on 2017/1/29.
 */
@Controller
public class ViewController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/view/{id}",method = RequestMethod.GET)
    public String redirectToPage(@PathVariable("id") String id){
        return id;
    }

}
