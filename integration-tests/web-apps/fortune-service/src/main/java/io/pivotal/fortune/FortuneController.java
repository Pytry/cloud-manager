package io.pivotal.fortune;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FortuneController {

    private final FortuneService fortuneService;

    Logger logger = LoggerFactory
     .getLogger(FortuneController.class);

    public FortuneController(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    @RequestMapping("/")
    String getQuote() {

        logger.debug("Fetching fortune");
        return fortuneService.getFortune();
    }
}
