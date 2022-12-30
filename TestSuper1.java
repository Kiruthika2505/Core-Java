class Login
{
	String un,pw;
	Login(String un,String pw)
	{
		this.un = un;
		this.pw = pw;
		System.out.println("User name:"+un);
		System.out.println("Password:"+pw);
	}
}
class Kgm extends Login
{
		String un,pw;
		Kgm(String un,String pw)
		{
			super(un,pw);
		}
}
class TestSuper1
{
	public static void main(String args[])
	{
			Kgm ob = new Kgm("kgm","Student@123");
	}
}