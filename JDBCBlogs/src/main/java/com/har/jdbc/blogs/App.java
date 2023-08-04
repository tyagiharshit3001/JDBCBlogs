package com.har.jdbc.blogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.har.jdbc.blogs.bean.Blogs;
import com.har.jdbc.blogs.dAO.BlogDao;

/**
 * Hello world!
 *
 */
public class App 
{
    
	

	public static void main( String[] args )
    {
		BlogDao bdao = new BlogDao();
		
		//bdao.addBlogs("Hello", "World");
		
		//bdao.deleteBlogByTitle("Hello");
		/*
		for(Blogs b : bdao.getAllBlog())
			System.out.println(b);
		*/
    }
}
