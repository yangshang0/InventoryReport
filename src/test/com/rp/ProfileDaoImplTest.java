package test.com.rp;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.rt.db.Profile;
import com.rt.db.ProfileDaoImpl;

public class ProfileDaoImplTest {
	
	public static Profile p;

	@Before
	public void setUp() {
		p = new Profile();
		p.setId(1);
		p.setUsers("admin");
		p.setPassword("admin");
		p.setValid(true);
	}
	
	@After
	public void tearDown() {
		p = null;
	}
	
	@Test
	public void testLogin() {
		ProfileDaoImpl profileDao = new ProfileDaoImpl();
		
		setUp();
		assertTrue(profileDao.login(p));
		
	}
}
