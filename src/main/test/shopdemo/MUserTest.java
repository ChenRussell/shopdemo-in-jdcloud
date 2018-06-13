package shopdemo;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jd.domain.User;
import com.jd.mapper.UserMapper;

public class MUserTest {
	private static SqlSessionFactory factory;
	static{
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
	
	public static void main(String[] args)
	{
		add();
	}
	
	public static void add()
	{
	   SqlSession sqlSession = factory.openSession();
	   User user = new User();
	   user.setUsername("bbb");
	   user.setPassword("456");
	   UserMapper mapper = sqlSession.getMapper(UserMapper.class);
	   mapper.addUser(user);
	   //�ύ���񣬷��򲻻�ʵ����ӵ����ݿ���
	   sqlSession.commit();
	   System.out.println("���ݿ����ɵ�ID�� "
	   + user.getUserid());
	   sqlSession.close();
	}
}
