package com.renjie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: fan
 * @Date: 2020/11/9
 * @Description:
 */
@RestController
public class TestController {
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/index")
    public Object index(){
        for (int i=0;i<10;i++){
            logger.info("info==============="+i);
            logger.debug("debug==============="+i);
            logger.warn("warn==============="+i);
            logger.error("error==============="+i);
        }
        return "success";
    }
}
