package co.develhope.loggerExample1.controller;

import co.develhope.loggerExample1.services.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class Controller {

        @Autowired
        GreetingService greetingService;

        Logger logger = LoggerFactory.getLogger(Controller.class);

        @GetMapping("/")
        public String sayHello(){
            logger.info("this is a info logging");
            return "hello";
        }

        @GetMapping("/exp")
        public int calculate(){
            logger.debug("Starting calculation in controller");
            return greetingService.doExp(2,8);
        }

        @GetMapping("/info")
        public void info(){
            logger.info("This is a INFO logging");
        }

        @GetMapping("/warning")
        public void warning(){
            logger.warn("This is a WARNING logging");
        }

        @GetMapping("/get-errors")
        public void error(){
            Error error = new Error("This is the error");
            logger.error("This is the ERROR logging", error);
        }
    }

