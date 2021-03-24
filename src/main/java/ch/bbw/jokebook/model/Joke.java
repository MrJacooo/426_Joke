package ch.bbw.jokebook.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Joke implements Comparable<Joke> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String text;
	private int rating;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String author;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthor() { return author;}
	public void setAuthor(String author) { this.author = author; };

	@Override
	public int compareTo(Joke o) {
		if(this.rating < o.getRating()) return -1;
		if(this.rating > o.getRating()) return 1;
		return 0;
	}

}
