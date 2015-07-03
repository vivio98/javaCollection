package Vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		String[] heros = {"iron","thor","hulk","hawk");
		Vector<String> avengers = new Vector<String>();
		//벡터에 배열의 요소 저장 addElement()
		for (int i = 0; i < heros.length; i++) {
			avengers.addElement(heros[i]);
		}
		// 토르가 존재하는지 체크하는 로직
		String thor = "thor";
	} if (avergens.contains(thor)) {
		int idx = avengers.indexOf(thor);
		System.out.println("토르는"+idx+"번째 멤버입니다.);
	} else {
     System.out.println("토르는 없습니다.");
	}
      /*
       * 첫번째 멤버(요소elemont) 삭제는 removeElmentAt(0);      을 사용함
       */
      avengers.removeElementAt(0);
      for (int i = 0; i < avengers.size; i++)
      System.out.println(avengers.elementAt(i));
      {
		
	}
}

}