package com.adolfo.gamer.flow;

import com.adolfo.gamer.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private BusinessService businessService;

    @GetMapping("/sum")
    public long displaySum(){
        return businessService.calculateSum();
    }
}




