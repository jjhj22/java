package j0716;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapStudy {

	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<>();
		
		map.put("이순신", 19900405);
		map.put("김춘추",19990101);
		map.put("장영실",19851205);
		map.put("정몽주",20010127);
		map.put("장영실",19930809);// key가 중복되면 덮어씌움
		map.putIfAbsent("장영실",19900707); // map에 키가 존재한다면 저장 안함
		
		System.out.println(map);
		
		//key에 매칭되는 value 출력
		System.out.println(map.get("장영실"));
		
		//수정
		map.replace("김춘추",19580909);
		
		System.out.println(map);
		
		//확인
		System.out.println(map.containsKey("이순신"));
		System.out.println(map.containsValue(19930809));
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		//set 또는 collection 변환
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		for(String name : keys) {
			System.out.println(map.get(name));
		}
		
		List<Integer> birth = new ArrayList<>(map.values());
		System.out.println(birth);
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		System.out.println(entry);
		
		map.forEach((k,v) -> System.out.println(k+" "+v));
	}

}

/*

	HashMap
	- 순차적으로 저장되지 않는다
	- key : value
	- key 중복이 허용되지 않는다.
	- value 중복 허용된다
	- Map은 색인 검색에 특화되어있다
	- 메모리 공간을 많이 소비한다



 */
