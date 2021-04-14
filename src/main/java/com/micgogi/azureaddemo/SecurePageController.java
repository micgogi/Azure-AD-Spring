
package com.micgogi.azureaddemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurePageController {

    @RequestMapping("/secure_page")
    public ModelAndView securePage(){
        ModelAndView mav = new ModelAndView("secure_page");

        return mav;
    }

    @RequestMapping("/")
    public ModelAndView indexPage() {
        ModelAndView mav = new ModelAndView("index");

        return mav;
    }
}
