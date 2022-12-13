package org.copy;

public class Book implements Cloneable{

	private String title;

	private Author author;

	public Book(String title, Author author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Book{" +
				"title='" + title + '\'' +
				", author=" + author +
				'}';
	}
}
