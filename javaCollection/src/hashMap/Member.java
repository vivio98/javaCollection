package hashMap;

public class Member {
	private String name; // 이름
	private String addr; // 주소
	private String age; // 나이
	private String id;// ID
	private String password; // 비번

	public Member() {
		this("","","","","");
	}

	public Member(String id, String password, String name , String age,
			String saddr) {
		this.id=  id;
		this.password = password;
		this.name = name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
