package com.example.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SomeBusinessImplStubTest {

    @Test
    void findTheGreatestFromAllData_basic() {
        SomeBusinessImpl business = new SomeBusinessImpl(new DataServiceStub());
        assertEquals(25, business.findTheGreatestFromAllData());
    }

}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{25, 15, 5};
    }
}
