package com.sda.OrangeJavaPL2.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomRestContoller {

    @GetMapping("/Hello-world")
    public String helloDev() { return "Hello default Byczku";}


    @RequestMapping(method = RequestMethod.GET, path = "/hello with request mapping")
    public String helloDev1(){
        return  "Hello Byczku";
    }
    //Obie metody są tożsame
}
