package study250731;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		
	    // 요소 추가
        for (int i = 0; i < 100000; i++) {
            arrayList.add("A" + i);
            linkedList.add("A" + i);
        }

        // 요소 중간 삽입 시간 측정
        int middle = 50000;
        long start = System.nanoTime();
        arrayList.add(middle, "inserted");
        long end = System.nanoTime();
        System.out.println("ArrayList 중간 삽입 시간: " + (end - start) + "ns");

        start = System.nanoTime();
        linkedList.add(middle, "inserted");
        end = System.nanoTime();
        System.out.println("LinkedList 중간 삽입 시간: " + (end - start) + "ns");

        // 전체 순회: for, iterator, stream
        System.out.println("== ArrayList 순회 시간 측정 ==");

        start = System.nanoTime();
        for (String s : arrayList) {}
        end = System.nanoTime();
        System.out.println("for-each: " + (end - start) + "ns");

        start = System.nanoTime();
        Iterator<String> iter = arrayList.iterator();
        while (iter.hasNext()) iter.next();
        end = System.nanoTime();
        System.out.println("Iterator: " + (end - start) + "ns");

        start = System.nanoTime();
        arrayList.stream().forEach(e -> {});
        end = System.nanoTime();
        System.out.println("Stream:  " + (end - start) + "ns");
	}
}
