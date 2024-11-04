package in.ashokit;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordService {
public PasswordService ()
{
	System.out.println("password service called");
}
public void start()
{
	System.out.println("start method start");
}
	public String encodepwd(String pwd)
	{
		Encoder encoder=Base64.getEncoder();
		byte[] encodedpwd = encoder.encode(pwd.getBytes());
		return new String(encodedpwd);
	}
	
	public void stop()
	{
		System.out.println("stop start");
	}

}
