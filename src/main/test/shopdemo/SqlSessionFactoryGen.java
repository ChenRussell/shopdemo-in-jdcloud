package shopdemo;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryGen {
	private static SqlSessionFactory factory;
	//��̬����顣�����ʼ��ʱ��ִ�У����һ��
	//������ľ�̬������������ĵ�һ��ʵ��
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
