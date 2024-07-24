package com.arjun.FirstSpringWeb.services;

import com.arjun.FirstSpringWeb.models.SomeData;

import com.arjun.FirstSpringWeb.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HomeService {

    @Autowired
    private HomeRepository homeRepository;

    public List<SomeData> getSomeData() {
        return homeRepository.findAll();
    }

    public SomeData getSomeDataByVal1(int val1) {
        return homeRepository.findById(val1).orElse(new SomeData());
    }

    public SomeData addSomeData(SomeData givenSomeData, Integer val2) {
        if(val2 != null) givenSomeData.setVal2(val2);
        homeRepository.save(givenSomeData);
        return givenSomeData;
    }

    public String updateSomeData(SomeData givenSomeDataToUpdate) {
        try {
            homeRepository.save(givenSomeDataToUpdate);
            return "SomeData updated";
        } catch (Exception exception) {
            if (exception instanceof IndexOutOfBoundsException) return "Item not found";
            else return "Some error occurred";
        }
    }

    public String deleteSomeData(SomeData givenSomeDataToDelete) {
        try {
            homeRepository.delete(givenSomeDataToDelete);
            return "SomeData Deleted";
        } catch (Exception exception) {
            if (exception instanceof IndexOutOfBoundsException) return "Item not found";
            else return "Some error occurred";
        }
    }
}
