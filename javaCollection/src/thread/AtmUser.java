package thread;

public class AtmUser implements Runnable{
     Atm atm;
	 String name;
     public AtmUser() {
		this(null,"");
	}
	 public AtmUser(Atm atm, String name) {
	super();//�θ��� ����� ������ ���� ���� �θ��� �����ڸ�
	        // �ڽ��� ������ ���ο� ȣ����
		this.atm = atm;
		this.name =name;
	}
	@Override
	public void run() {
		 atm.inchul(name);
		
	}
	

}
