package com.timwang.tracingart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class TracingNameApplication {

    private static Logger LOG = Logger.getLogger(TracingNameApplication.class.getName());
    public static void main(String[] args) {
        SpringApplication.run(TracingNameApplication.class, args);
    }

    @RequestMapping(value = "/")
    public String index(){
        LOG.log(Level.INFO, "Index API is calling");
        return "Welcome Sleuth!";
    }

}
