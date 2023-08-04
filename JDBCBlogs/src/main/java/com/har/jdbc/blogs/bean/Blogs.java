package com.har.jdbc.blogs.bean;

public class Blogs {
	private String blogTitle;
	private String blogContent;
	public Blogs() {
	}
	public Blogs(String blogTitle, String blogContent) {
		this.blogTitle = blogTitle;
		this.blogContent = blogContent;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogContent() {
		return blogContent;
	}
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}
	@Override
	public String toString() {
		return "Blog:-\n-----------------------------------------------------------\nBlog Title: " + blogTitle + "\nBlog Content: " + blogContent + "\n-----------------------------------------------------------\n";
	}
	
	

}
