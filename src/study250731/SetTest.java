package study250731;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        String[] inputs = {"banana", "apple", "kiwi", "apple", "banana", "melon"};

        for (String s : inputs) {
            hashSet.add(s);
            linkedHashSet.add(s);
            treeSet.add(s);
        }

        System.out.println("HashSet (순서 X): " + hashSet);
        System.out.println("LinkedHashSet (입력 순서 유지): " + linkedHashSet);
        System.out.println("TreeSet (정렬): " + treeSet);
        
        /*
         * Set은 중복을 허용하지 않아.(인덱스가 없어서)
			그런 인터페이스야(이거 중요)
			HashSet 은 중복을 허용하지 않고 순서 무작위
			LinkedHashset 은 입력순서가 이미 'Link'되어 있어서 입력한 순서대로 조회
			TreeSet 은 입력은 되지만 내부에서 정렬을 한다. natural ordering of its elements. 이라는 정의가 있음



         * 
         * 
         */
        
	}

}
