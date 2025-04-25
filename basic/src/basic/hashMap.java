package basic;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        // 키 : 밸류 형태, 중복 허용X
        HashMap<String, Integer> map = new HashMap<>();
        map.put("철수", 100);
        map.put("영희", 90);
        System.out.println(map.get("철수"));
    }
}
