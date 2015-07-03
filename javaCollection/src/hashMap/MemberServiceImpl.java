package hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements  MemberService{
	
	Map<String,Object> map = new HashMap<String,Object>();
	Member member = new Member();
	
	@Override
	public String login(String id, String password) {// if 문을 treu 로 주고 어떤 상황이면 true 를 반환할지를 고민..
		 String msg = "";
		if (map.get("id").equals(id) 
				&&map.get("password").equals(password)) {  // &&두 조건모두 충족
			msg= "환영합니다"+"member.getAddr()"+"에사는"+"세 되시는"+ ""+member.getName()+"+님.+";
		 
		} else if((map.get("id").equals(id) 
				&& !map.get("password").equals(password))) {
		msg ="비번이 다릅니다. 다시 입력하세요";   
		}else{
			msg ="입력하신 ID 는 존재 하지 않거나 일치 하지 않습니다 다시 입력해주세요";     
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

