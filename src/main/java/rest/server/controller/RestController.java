package rest.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import rest.server.domain.User;

import java.util.UUID;

@Controller
public class RestController {

    private static final Logger logger = LoggerFactory.getLogger(RestController.class);


    @RequestMapping(value = RestURIConstant.DEFAULT, method = RequestMethod.GET)
    @ResponseBody
    public String showIndex() {
        return "Hello world";
    }


    @RequestMapping(value = RestURIConstant.GET_USER, method = RequestMethod.GET)
    @ResponseBody
    public User getUser() {
        logger.info("Start getDummyEmployee");
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("Dummy");
        user.setEmail("2004.viper@gmail.com");
        return user;
    }
}