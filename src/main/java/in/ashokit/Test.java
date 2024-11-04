package in.ashokit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new
				ClassPathXmlApplicationContext("beans.xml");
		//System.out.println(context.getBean(PasswordService.class));
		 PasswordService pwd1=context.getBean( PasswordService.class);
		 PasswordService pwd2=context.getBean( PasswordService.class);
		 PasswordService pwd3=context.getBean( PasswordService.class);
		 System.out.println(pwd1.hashCode());
		 System.out.println(pwd2.hashCode());
		 
		 System.out.println(pwd3.hashCode());
		 ConfigurableApplicationContext ca= (ConfigurableApplicationContext)
				 context;
		 ((ConfigurableApplicationContext) context).close();
		 
		 
	}

}
