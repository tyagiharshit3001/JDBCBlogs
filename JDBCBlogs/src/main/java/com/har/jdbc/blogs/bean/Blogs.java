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
		String s = blogContent;
		int count =0;
		List<String> st1 = new List<String>(s.split(" "));
		for(int i =0; i<s.split(" ").length; i++) {
			count++;
			if (count==11) {
				st1.addAtPosition("\n", i);
				count=0;
			}
		}
		String fs ="";
		for(String p:st1.a)
			fs += " "+p;
		return "Blog:-\n-----------------------------------------------------------\nBlog Title: " + blogTitle + "\nBlog Content: " + fs + "\n-----------------------------------------------------------\n";
	}
	
	

}
