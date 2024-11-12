package course.udemy.Part_16;

import java.util.ArrayList;
import java.util.List;

public class ListArrayListLinkedList {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(0,9);
        list.set(1,3);
        System.out.println(list.get(0));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
