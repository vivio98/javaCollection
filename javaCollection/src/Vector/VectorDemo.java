package Vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		String[] heros = {"iron","thor","hulk","hawk");
		Vector<String> avengers = new Vector<String>();
		//���Ϳ� �迭�� ��� ���� addElement()
		for (int i = 0; i < heros.length; i++) {
			avengers.addElement(heros[i]);
		}
		// �丣�� �����ϴ��� üũ�ϴ� ����
		String thor = "thor";
	} if (avergens.contains(thor)) {
		int idx = avengers.indexOf(thor);
		System.out.println("�丣��"+idx+"��° ����Դϴ�.);
	} else {
     System.out.println("�丣�� �����ϴ�.");
	}
      /*
       * ù��° ���(���elemont) ������ removeElmentAt(0);      �� �����
       */
      avengers.removeElementAt(0);
      for (int i = 0; i < avengers.size; i++)
      System.out.println(avengers.elementAt(i));
      {
		
	}
}

}