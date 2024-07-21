package com.arjun.FirstSpringWeb.services;

import com.arjun.FirstSpringWeb.models.SomeData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class HomeService {
    List<SomeData> someDataList = new ArrayList<>(List.of(
            new SomeData(1, 4, 5), new SomeData(2, 4, 6), new SomeData(4, 4, 5)
    ));

    public List<SomeData> getSomeData() {
        return someDataList;
    }

    public SomeData getSomeDataByVal1(int val1) {
        try {
            return someDataList.stream().filter( someData ->
                    someData.getVal1() == val1
            ).findFirst().get();
        } catch (NoSuchElementException exp) {
            return null;
        }
    }

    public SomeData addSomeData(SomeData givenSomeData, Integer val2) {
        if(val2 != null) givenSomeData.setVal2(val2);
        someDataList.add(givenSomeData);
        return givenSomeData;
    }

    public String updateSomeData(SomeData givenSomeDataToUpdate) {
        try {
            int indexToUpdate = -1;
            for (int i = 0 ; i < someDataList.size() ; i++) {
                if (someDataList.get(i).getVal1() == givenSomeDataToUpdate.getVal1()) {
                    indexToUpdate = i; break;
                }
            }

            someDataList.set(indexToUpdate, givenSomeDataToUpdate);
            return "SomeData updated";
        } catch (Exception exception) {
            if (exception instanceof IndexOutOfBoundsException) return "Item not found";
            else return "Some error occurred";
        }
    }

    public String deleteSomeData(SomeData givenSomeDataToUpdate) {
        try {
            int indexToDelete = -1;
            for (int i = 0 ; i < someDataList.size() ; i++) {
                if (someDataList.get(i).getVal1() == givenSomeDataToUpdate.getVal1()) {
                    indexToDelete = i; break;
                }
            }

            someDataList.remove(indexToDelete);
            return "SomeData Deleted";
        } catch (Exception exception) {
            if (exception instanceof IndexOutOfBoundsException) return "Item not found";
            else return "Some error occurred";
        }
    }
}
