package shopdemo;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryGen {
	private static SqlSessionFactory factory;
	//静态代码块。在类初始化时被执行，如第一次
	//引用类的静态变量，创建类的第一个实例
	static
	{
	String resource = "spring.xml";
	Reader reader = null;
	try{
	reader = Resources.getResourceAsReader(resource);
	}catch(IOException e)
	{
	e.printStackTrace();
	}
	factory  = new SqlSessionFactoryBuilder().build(reader);
	}
	public static SqlSessionFactory getSqlSessionFactory()
	{
	return factory;
	}

}
