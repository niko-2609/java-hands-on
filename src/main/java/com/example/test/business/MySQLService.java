package com.example.test.business;

import com.example.test.business.DataService;
import org.springframework.stereotype.Component;

@Component
public class MySQLService implements DataService {
    public int[] retrieveData() {
        return new int[] {15, 4, 301, 2, 82 };
    }
}