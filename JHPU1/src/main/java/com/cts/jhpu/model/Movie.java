package com.cts.jhpu.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="movie")
public class Movie implements Comparable<Movie> {
	@Id
	private int mId;
	private String mName;
	
	@ManyToMany(mappedBy="movies")
	private Set<Artist> artists;

	public Movie() {
		super();
	}

	public Movie(int mId, String mName, Set<Artist> artists) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.artists = artists;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public Set<Artist> getArtists() {
		return artists;
	}

	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}

	public int compareTo(Movie o) {
		// TODO Auto-generated method stubreturn (this.admNo<o.admNo?-1:(this.admNo>o.admNo?1:0));
		return (this.mId<o.mId?-1:(this.mId>o.mId?1:0));
	}
	
}
