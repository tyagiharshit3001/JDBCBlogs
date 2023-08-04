package com.har.jdbc.blogs.dAO;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.har.jdbc.blogs.bean.Blogs;

public class BlogDao {
	
	public boolean addBlogs(String title, String content) {
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		int count =0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DBCreds.getConnect();
			
			if(con!=null)
				System.out.println("DB Connection Successful!!!");
				
			else {
				System.out.println("DB Connection Falied!!!");
				return false;
			}
			
			pst = con.prepareStatement("insert into blogs values(?,?)");
			
			pst.setString(1, title);
			pst.setString(2, content);
			
			count = pst.executeUpdate();
			
			//if(rs.next()) count= rs.getInt(1);
			
			//if(rs!=null) rs.close();
			if(pst!=null) pst.close();
			if(con!=null) con.close();
			System.out.println("DB Connections Closed!!!");
			
		} catch (ClassNotFoundException| SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}

		return count == 1;
	}
	
	
	public boolean deleteBlogByTitle(String title) {
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		int count =0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DBCreds.getConnect();
			
			if(con!=null)
				System.out.println("DB Connection Successful!!!");
				
			else {
				System.out.println("DB Connection Falied!!!");
				return false;
			}
			
			pst = con.prepareStatement("delete from blogs where title =?");
			
			pst.setString(1, title);
			
			count = pst.executeUpdate();
			
			//if(rs.next()) count= rs.getInt(1);
			
			//if(rs!=null) rs.close();
			if(pst!=null) pst.close();
			if(con!=null) con.close();
			System.out.println("DB Connections Closed!!!");
			
		} catch (ClassNotFoundException| SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}

		return count == 1;
	}
	
	public Blogs getBlogByTitle(String title) {
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		int count =0;
		Blogs b = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DBCreds.getConnect();
			
			if(con!=null)
				System.out.println("DB Connection Successful!!!");
				
			else {
				System.out.println("DB Connection Falied!!!");
			}
			
			pst = con.prepareStatement("select * from blogs where title =?");
			rs = pst.executeQuery();
			b = new Blogs(rs.getString(1),rs.getString(2));
			
			
			//if(rs.next()) count= rs.getInt(1);
			
			if(rs!=null) rs.close();
			if(pst!=null) pst.close();
			if(con!=null) con.close();
			System.out.println("DB Connections Closed!!!");
			
		} catch (ClassNotFoundException| SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}

		return b;
	}
	
	
public ArrayList<Blogs> getAllBlog() {
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		//int count =0;
		ArrayList<Blogs> blogArr = new ArrayList<Blogs>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DBCreds.getConnect();
			
			if(con!=null)
				System.out.println("DB Connection Successful!!!");
				
			else {
				System.out.println("DB Connection Falied!!!");
			}
			
			pst = con.prepareStatement("select * from blogs");
			rs = pst.executeQuery();
			
			while(rs.next())
				blogArr.add(new Blogs(rs.getString(1),rs.getString(2)));
			
			
			//if(rs.next()) count= rs.getInt(1);
			
			if(rs!=null) rs.close();
			if(pst!=null) pst.close();
			if(con!=null) con.close();
			System.out.println("DB Connections Closed!!!");
			
		} catch (ClassNotFoundException| SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}

		return blogArr;
	}
}
