package Vector;

import java.util.Vector;

public interface GradeService {
/*
 * �л��� ������ �Է��ϴ� ���
 */
	
	
public void input(Grade grade);
/*
 * ��ü �л�����ǥ ���
 */
public void printList();
/*
 * �й����� ������ ��ȸ�ϴ� ���
 */
public String searchGradeByHak(String hak);
/*
 * �̸����� ������ ��ȸ�ϴ� ��� (��, ���������� ������ ��� ���� ���)
 */
public Vector<Grade> serachGradesByName(String name);

}