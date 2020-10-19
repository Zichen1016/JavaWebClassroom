package usermanagerarraylist;

/*
 * 实体类: MVC全名是Model View Controller，是模型(model)－视图(view)－控制器(controller)的缩写，
 * 一种软件设计典范，用一种业务逻辑、数据、界面显示分离的方法组织代码，将业务逻辑聚集到一个部件里面，在改进和个性化定制界面及用户
 * 交互的同时，不需要重新编写业务逻辑。MVC被独特的发展起来用于映射传统的输入、处理和输出功能在一个逻辑的图形化用户界面的结构中。
 * 主要有  get set 方法构成
 * */
 


public class User {
	
	String name;
	String password;
	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
