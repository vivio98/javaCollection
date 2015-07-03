package hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeySetDemo {
	public static void main(String[] args) {
		//String 타입으로 키와 Interger 타입의 벨류로 이루어진 맵
		// Map 은 인터페이스, HashMap은 Map을 구현한 클래스
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("김연아", new Integer(98));//int 타입은 맵에 들어올수 없다.
		map.put("아사다마오", new Integer(60));
		map.put("소트니코바", new Integer(30));
		/*출력은 Iterator 패턴을 사용함*/
		/*
		 * 그런데,Set 을 이용합니다 
		 *  */
		//맵의 값을 출력하는 시나리오
		//1.키와 밸류를 전부 출력 entrySet()
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
		//System.out.println("참가자 :"+e.getKey())	+",점수"+e.getValue());
			
			
		}
		//2.키만 출력하는 경우
  set = map.keySet();
  // set은toString()이 내부적으로 오버라이딩 되어있다.
  // set은 인덱스 없이 입력순서에 구애받지 않는다
  System.out.println("참가자 명단 :" +set);
	// 3.벨류만 출력하는 경우 
    Collection valulse = map.values();
    Iterator it2 = valulse.iterator();	
	int total = 0;//이 대회의 통계작성 값
    while (it2.hasNext()) {
		Integer i = (Integer) it2.next();
		total += i.intValue(); // 각 선수들의 점수가 합계됨
		
	}
	System.out.println("평균 :"+total/set.size());
	//Collection vs Collections  인터페이스 이고 뒤에건 클래스
	System.out.println("최고점 :"+Collections.max(valulse));
	System.out.println("최저점:"+ Collections.min(valulse));
	}
}
