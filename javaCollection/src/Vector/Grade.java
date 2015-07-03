package Vector;

public class Grade {
	private int kor,eng,math;
	private String hak,name;
	
	public Grade(){
		this("","",0,0,0);
	}
	public Grade(String hak, String name, int kor, int eng, int math) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//�л��ο� ����Ǹ鼭 �ٷ� �й�,�̸� ���� ���� ���� ������ �����
	//getter setter �� ����µ� �ʿ���� �� �� ����
	// ������ ���Ҿ� ��µ�
	
	@Override
	public String toString() {
		
		return "����ǥ [�й� : "+ hak + " ,�̸� "+name +",���� :"+kor
				+ ",���� :" +eng+",���� :"+ math
				+",���� :" +getTotal()+"] \n";
			
	}

	private String getTotal() {
		// TODO Auto-generated method stub
		return String.valueOf (kor + eng + math);
	}

	public int getKor() {
		return kor;
	}

	 

	public int getEng() {
		return eng;
	}

	 
	public int getMath() {
		return math;
	}

	 
	public String getHak() {
		return hak;
	}

	 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
