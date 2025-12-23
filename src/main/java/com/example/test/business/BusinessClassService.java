package com.example.test.business;

import com.example.test.business.DataService;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.Arrays; 

@Component
public class BusinessClassService {

    DataService dataservice;

    public BusinessClassService(@Qualifier("mySQLService") DataService dataservice) {
        super();
        this.dataservice = dataservice;
    }

    public int findMax() {
        return Arrays.stream(this.dataservice.retrieveData()).max().orElse(0);
    }
}