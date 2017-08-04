package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Claude on 7/10/17.
 */
@Controller
public class IndexController {
    private static final String HOME_VIEW_NAME = "index";
    @RequestMapping("")
    public String home(){
        return HOME_VIEW_NAME;
    }
}
