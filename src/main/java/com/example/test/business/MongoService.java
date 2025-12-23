package com.example.test.business;

import com.example.test.business.DataService;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;


@Component
@Primary
public class MongoService implements DataService{
    
    public int[] retrieveData() {
        return new int[] {1, 40, 30, 28, 8 };
    }
}