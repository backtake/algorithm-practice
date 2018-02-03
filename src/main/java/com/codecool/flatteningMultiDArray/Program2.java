package com.codecool.flatteningMultiDArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program2 {

    public static Collection<Object> flatMultiList(Object object) {

        Collection<Object> flattendList = new ArrayList<>();

        if (object instanceof Iterable) {
            for (Object elem : (Iterable<?>) object) {
                flattendList.addAll(flatMultiList(elem));
            }
        } else {
            flattendList.add(object);
        }

        return flattendList;
    }

    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<Object>();
        List<Object> list2 = new ArrayList<Object>();
        List<Object> list3 = new ArrayList<Object>();
        List<Object> list4 = new ArrayList<Object>();
        list1.add("Dupka");
        list1.add(13);
        list1.add(22);
        list1.add("Jagna");

        list2.add(11);

        list3.add(12);
        list3.add("Al");
        list2.add(list1);
        list4.add(list1);
        list4.add(list2);
        list4.add(list3);
        list4.add("Domek");

        System.out.println(list4);
        System.out.println(flatMultiList(list4));
    }
}
