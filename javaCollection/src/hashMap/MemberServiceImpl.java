package hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements  MemberService{
	
	Map<String,Object> map = new HashMap<String,Object>();
	Member member = new Member();
	
	@Override
	public String login(String id, String password) {// if ���� treu �� �ְ� � ��Ȳ�̸� true �� ��ȯ������ ���..
		 String msg = "";
		if (map.get("id").equals(id) 
				&&map.get("password").equals(password)) {  // &&�� ���Ǹ�� ����
			msg= "ȯ���մϴ�"+"member.getAddr()"+"�����"+"�� �ǽô�"+ ""+member.getName()+"+��.+";
		 
		} else if((map.get("id").equals(id) 
				&& !map.get("password").equals(password))) {
		msg ="����� �ٸ��ϴ�. �ٽ� �Է��ϼ���";   
		}else{
			msg ="�Է��Ͻ� ID �� ���� ���� �ʰų� ��ġ ���� �ʽ��ϴ� �ٽ� �Է����ּ���";     
		}
	   
	 return msg;
	}
	@Override
	public void join(String name, String addr, int age, String id,
			String password) {
		member.setName(name);
		member.setAddr(addr);
		member.setAge(String.valueOf(age));
		member.setId(id);
		member.setPassword(password);
		map.put("id", member.getId());
        map.put("password", member.getPassword());
        map.put("name", member.getName());
        map.put("age", member.getAge());
        map.put("addr", member.getAddr());
		
	}
	










}

