package com.rp.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	      static Connection con;
	      static String url;
	      
	  	public static Connection getConnection() {
	  		Connection con = null;
	  		Properties props = new Properties();
			try {
				
				//printConnection(); -- debug for connection path
				
				//websphere server with unix install
				/*  Note:
					getresourceasStream does not work due to path difference / classloader does not work
					only happen for websphere in unix box. 
					for regular environment can use this instead:
					ConnectionManager.class.getResource("/").toURI().resolve("../databaseInfo/DbInfo.properties").getPath();
				*/
			
				String path = ConnectionManager.class.getResource("").toURI().resolve("../../../../databaseInfo/DbInfo.properties").getPath();
				props.load(new FileInputStream(path));
				
	  			// load the Driver Class
	  			Class.forName(props.getProperty("DRIVER"));
	  			
	  			// create the connection now
	  			con = DriverManager.getConnection(props.getProperty("URL"),
	  					props.getProperty("USER"),
	  					props.getProperty("PW"));
				
	  		} catch (ClassNotFoundException | SQLException | URISyntaxException | IOException e) {
	  			e.printStackTrace();
	  		} 

	  		return con;         
	}
	  	
//	  	public static void printConnection() {
//	  		BufferedWriter bw = null;
//			FileWriter fw = null;
//			try {
//				Properties props = new Properties();
//				String path = ConnectionManager.class.getResource("/").toURI().resolve("../databaseInfo/DbInfo.properties").getPath();
//				InputStream input = new FileInputStream(path);
//			
//	      		props.load(input);
//				fw = new FileWriter("con-log.txt");
//				bw = new BufferedWriter(fw);
//				bw.write(path+"\r\n");
//				bw.write(input.toString());
//				bw.write(props.getProperty("URL")+"\r\n");
//				
//			
//			} catch(Exception e) {
//				e.printStackTrace();
//			} finally {
//				try {
//					if (bw != null)
//						bw.close();
//					if (fw != null)
//						fw.close();
//				} catch (IOException ex) {
//					ex.printStackTrace();
//				}
//			}
//			
//	  	}
	
}
