package co.develhope.loggerExample1.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

    @Service
    public class GreetingService {
        Logger logger = LoggerFactory.getLogger(GreetingService.class);


        public int doExp(int a, int b){
            try {
                logger.debug("Starting calculation: ");
                int intResult = (int) Math.pow(a,b);

                return intResult;
            }finally {
                logger.info("Ending calculation");
            }
        }
    }


