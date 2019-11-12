package cn.zj.ssm.pojo;

public class User {
	  private int id;
      private String username;
      private int age;
      private int dept_id;
      private String password;
      
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public User(int id, String username, int age, int dept_id, String password) {
		super();
		this.id = id;
		this.username = username;
		this.age = age;
		this.dept_id = dept_id;
		this.password = password;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getDept_id() {
		return dept_id;
	}


	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + ", dept_id=" + dept_id + ", password="
				+ password + "]";
	}


	
      
      
}
