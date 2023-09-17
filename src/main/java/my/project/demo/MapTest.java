package my.project.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    // TODO: 2022-09-21 https://soft.plusblog.co.kr/70 

    // TODO: 2022-09-21

    /**
     * 특정 hash 코드 계산 method를 사용해서 순서 배치
     * 순서보장 X
     * 특별히 순서를 보장해야하거나 나열을 해야하는 경우가 아니라면
     * hash Map 를 사용하는것을 권장
     * treeMap 처럼 순서를 계산해서 출력하는것도 아니고
     * linkedMap 처럼 앞 뒤 순번을 기억해둘 필요도 없다
     */
    public void hashMapTest() {
        Map<String, String> map = new HashMap();
        map.put("c", "1");
        map.put("k", "1");
        map.put("1", "1");
        map.put("2", "1");
        map.put("a", "1");
        map.put("Google", "USA");
        map.put("Naver", "Korea");
        map.put("Facebook", "USA");
        System.out.println("hash");
        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }

    // TODO: 2022-09-21

    /**
     * 순서 : 숫자 -> 대문자 -> 소문자
     * if 같은 순서의 key가 있다면 두번째 값으로 순서 비교 -> 순서는 똑같다
     * 순서보장이 가능하지만 입력된 값 그대로의 순서는 아니다
     */
    public void treeMapTest() {
        Map<String, String> map = new TreeMap();
        map.put("c", "1");
        map.put("a", "1");
        map.put("1", "1");
        map.put("1A", "1");
        map.put("1B", "1");
        map.put("A1A", "1");
        map.put("2", "1");
        map.put("ba", "1");
        map.put("bA", "1");
        map.put("A", "1");
        map.put("AA", "1");
        System.out.println("tree");
        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }

    // TODO: 2022-09-21

    /**
     * 입력된 값 그대로 저장
     * 입력된 그대로의 순서를 보장
     */
    public void linkedHashMap() {
        Map<String, String> map = new LinkedHashMap();
        map.put("c", "1");
        map.put("a", "1");
        map.put("Google", "USA");
        map.put("Naver", "Korea");
        map.put("Facebook", "USA");
        map.put("b", "1");
        map.put("k", "1");
        System.out.println("linked");
        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }

}
