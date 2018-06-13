package shopdemo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
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
//	@Test
//	public void isExits(){
//		User user = new User();
//	    String username = "aaa";
//		user.setPassword("123");
//		String a = userDao.jisExist(username);
//		System.out.print(a);
//		//return a;
//		
//	}
//	
//	@Test
//	public void del(){
//		userDao.delete(1);
//	}
	

}
