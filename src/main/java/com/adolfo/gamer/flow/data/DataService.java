package com.adolfo.gamer.flow.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService{
    public List<Integer> retrieveData(){
        return Arrays.asList(12,23,24,51);
    }
}
