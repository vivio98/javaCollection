package Vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
     private Vector<Grade> grades = new Vector<Grade>();
     private Grade grade = new Grade();
     /*
      * �Ķ���� Ÿ���� ��ü ��ü �̹Ƿ�, ������ ����, ���� �̷� ������ �ڵ鸵 �� �ʿ� �� ����.
      */
	
     
     @Override
	
	public void input(Grade grade) {
		 grades.add(grade);
		 grades.addElement(grade);
		
	}

	@Override
	public void printList() {
	/*
	 * ���� ���ο� toString ()  �� ȣ���ϸ� 
	 * ���(�Ḯ��Ʈ) ���ο� ���ǵ� toString() �� 
	 * ���� ȣ���� �ش�.
	 */
		System.out.println(grades.toString());
		
	}

	@Override
	public String searchGradeByHak(String hak) {
		System.out.println("�Էµ� �й�:"+hak);
		String msg = "";
		String serchedHak = "",name =""; //�˻��Ϸ��� �й�
		int kor = 0,eng=0,math=0;
		for (int i = 0; i < grades.size(); i++) {
			serchedHak = grades.elementAt(i).getHak();
             if (hak.equalsIgnoreCase(serchedHak)) {
				name = grades.elementAt(i).getName();
				kor = grades.elementAt(i).getKor();
				eng = grades.elementAt(i).getEng();
				math =grades.elementAt(i).getMath();
				//��ü�� �̷�� �ʵ� ���� �� �˾Ƴ� ����.......
			break;
             } else {
                
				grade = new Grade(serchedHak, name, kor, eng, math);
			}	msg= "�˻��Ϸ��� �й��� �����ϴ�";
		}
		return msg;
	}
/*
 * �̸����� ������ȸ�ε� ���ϰ��� ���� �� ������ �������� ���������� ����϶�� �߱� �����Դϴ�. ����� �ϳ��̵� �������̵� ��� �˰�����
 * forloop + if ������ ����Ѵ�.
 */
	@Override
	public Vector<Grade> serachGradesByName(String name) {
		/*
		 * �ڵ�����
		 * 1.�������̽� �� ������ ������ �������̽� �̸� + Impl Ŭ���� ����
		 * 2. �� Ŭ������ �������̽��� ������ implements ��
		 * 3.�޼ҵ� �� ����� ���� ��� ��(����) �ڷᱸ���� �ʵ忡 ����
		 * -�ڷᱸ���� ����ÿ��� �ڷᱸ�� ���ο� �ִ� ��ü ���� ���Ҿ� ����
		 * 4.�޼ҵ� ���ο� ����Ÿ���� ������ �����ϰ� �ʱ�ȭ ���� ���ϰ��� ��ġ
		 * -�ڷᱸ���� ����ÿ��� �ڷᱸ�� ���ο� �ִ� ��ü ���� ���Ҿ� ����
		 * 5.�˰����� �ʿ��� ��Ȳ���� �� ��°��� �˻���� ��� for+if �� ��ġ
		 */
		Vector<Grade> temp = new Vector<Grade>();
		Grade grade = null; //��ü �ʱ�ȭ �ϴ� null
		 
		for (int i = 0; i < grades.size(); i++) {
			String searchedName = grades.elementAt(i).getName();
			if (name.equalsIgnoreCase(searchedName)) {
			   String tmepName = grades.elementAt(i).getName();
				temp.add(new Grade(grades.elementAt(i).getName(),tempName,
						grades.elementAt(i).getHak()	0,
						grades.elementAt(i).getName()	0,
						grades.elementAt(i).getKor()	0));	
				        grades.elementAt(i).getEng()
                       grades.elementAt(i).getMath()
			} else {
                 temp.remove(new Grade()); 
			}
		}
		return temp;
	}

}