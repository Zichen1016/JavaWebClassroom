package usermanagerarraylist;

/*
 * ʵ����: MVCȫ����Model View Controller����ģ��(model)����ͼ(view)��������(controller)����д��
 * һ�������Ƶ䷶����һ��ҵ���߼������ݡ�������ʾ����ķ�����֯���룬��ҵ���߼��ۼ���һ���������棬�ڸĽ��͸��Ի����ƽ��漰�û�
 * ������ͬʱ������Ҫ���±�дҵ���߼���MVC�����صķ�չ��������ӳ�䴫ͳ�����롢��������������һ���߼���ͼ�λ��û�����Ľṹ�С�
 * ��Ҫ��  get set ��������
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
