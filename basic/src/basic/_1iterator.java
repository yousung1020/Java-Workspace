package basic;

import java.util.ArrayList;
import java.util.Iterator;

public class _1iterator {
    public static void main(String[] args) {
        // iterator: 모든 데이터를 순회
        ArrayList<String> list = new ArrayList<>();
        list.add("철수");
        list.add("영희");

        Iterator<String> it = list.iterator();
        // hasNext 다음 요소 확인
        // next: 다음 요소 가져오기
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
