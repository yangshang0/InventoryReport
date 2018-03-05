package test.com.rp;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;

import com.mt.db.ConnectionManager;


public class ConnectionManagerTest {
	
	@Test
	public void testConnectionManager() {
		Connection c = ConnectionManager.getConnection();
		assertNotNull(c);
	}
}
