package com.arjun.FirstSpringWeb.services;

import com.arjun.FirstSpringWeb.models.SomeData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {
    List<SomeData> someDataList = List.of(
            new SomeData(1, 4, 5), new SomeData(2, 4, 6), new SomeData(4, 4, 5)
    );

    public List<SomeData> getSomeData() {
        return someDataList;
    }
}
