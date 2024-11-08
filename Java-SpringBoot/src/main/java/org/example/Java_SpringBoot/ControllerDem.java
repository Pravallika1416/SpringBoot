package org.example.Java_SpringBoot;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
@RequestMapping("/v1")
public class ControllerDem {
    private static final Log logger = LogFactory.getLog(ControllerDem.class);
    @GetMapping("/demo")
   // @ResponseBody
    public String getDemo(){
        logger.debug("Error Meessage");
        return "Demo";
    }
    @PostMapping("/post/demo")
    public String postDemo(){
        return "Post Demo";
    }
    @PutMapping("/put/demo")
    public String ptDemo(){
        return "Put Demo";
    }
    @RequestMapping(value = "/demo/header", method = RequestMethod.HEAD)
    public ResponseEntity<Void> handleHeadRequest() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "CustomHeaderValue");

        // You can add any relevant headers here
        headers.add("Content-Type", "application/json");
        headers.add("Cache-Control", "max-age=3600");

        // Return the headers with a 200 OK status, but no body
        return new ResponseEntity<>(headers, HttpStatus.OK);
    }
}
