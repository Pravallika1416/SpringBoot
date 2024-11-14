package org.example.Java_SpringBoot;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//@Controller
@SpringBootApplication
@RestController
@RequestMapping("/v1")
public class ControllerDemo2 {
    private static final Log logger = LogFactory.getLog(ControllerDem.class);
    @GetMapping("/modelanddemo")
    // @ResponseBody
    public ModelAndView getDemo(){
        ModelAndView modelAndView =new ModelAndView("DynamicDemo.html");
        modelAndView.getModelMap().addAttribute("name","Pravallia");
        return modelAndView;


    }

}
