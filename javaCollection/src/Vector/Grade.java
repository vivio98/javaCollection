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
	//학생부에 등재되면서 바로 학번,이름 국어 영어 수학 점수가 기재됨
	//getter setter 을 만드는데 필요없는 것 은 삭제
	// 총점만 더불어 출력됨
	
	@Override
	public String toString() {
		
		return "성적표 [학번 : "+ hak + " ,이름 "+name +",국어 :"+kor
				+ ",영어 :" +eng+",수학 :"+ math
				+",총점 :" +getTotal()+"] \n";
			
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
