package Vector;

import java.util.Scanner;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		Grade hong = new Grade("1111",  "ȫ�浿", 90,80, 70);
		Grade kang = new Grade("2222",  "������", 80,50, 30);
		Grade kim = new Grade("3333",  "������", 40,20, 10);
		Grade lee = new Grade("4444",  "�̼���", 100,100, 100);
		service.input(hong);
		service.input(kim);
		service.input(kang);
		service.input(lee);
		System.out.println("==��ü ��ȸ==");
		service.printList();
		System.out.println("====�й����� ��ȸ=====");
		Scanner scanner = new Scanner(System.in);
		service.searchGradeByHak(scanner.next());
	}

}
