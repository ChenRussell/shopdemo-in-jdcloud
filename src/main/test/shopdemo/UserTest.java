package shopdemo;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jd.dao.UserDao;
import com.jd.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class UserTest {
	@Resource
	private UserDao userDao;
//	@Test
//	public void save(){
//		User user = new User();
//		user.setUsername("aaa");
//		user.setPassword("123");
//		userDao.save(user);
//	}
//	@Test
//	public void find(){
//		userDao.findAll();
//	}
//	

//	@Test
//	public void upate(){
//		User user = new User();
//		user.setUsername("aaa");
//		user.setPassword("123");
//		String name = "aaa";
//		String password = "111";
//		userDao.jupdateUser(password, name);
//	}
//	
	@Test
	public void isExits(){
		User user = new User();
	    String username = "qqqq";
		String password = "1111";
		List<User> l = userDao.isExist(username,password);
		System.out.print(l);
		
//		AbstractApplicationContext ac;
//		ac.close();
		
		//return a;
		
	}
//	
//	@Test
//	public void del(){
//		userDao.delete(1);
//	}
	

}
