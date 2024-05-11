package com.example.springlogging.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

   // Logger log  =  LoggerFactory.getLogger(TestController.class);


    @GetMapping("/test")
    public String test(){
      /*  log.info("test executing started");

        //
        log.debug("customer : "+customer)
          // response

        log.debug("response is : "+response);

        catch{
            log.error("customer value cames null ");
            throw new Exception("customer not found");
        }

        log.info("test executing finished");
        */

        // log.trace("test executed - level is Trace");
        //log.debug("test executed - level is Debug");
        //log.warn("test executed - level is warn");
        //log.error("test executed - level is error");
        return "test";
    }

}
