package com.controller;

import com.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nir.
 */
@RestController
public class ConfigValueController {

    @Autowired
    private AppConfig conf;

    @RequestMapping(method = RequestMethod.GET, value = "/refreshedValue")
    public String refreshedValue(){
        return conf.getRefreshedMessage();
    }

}
