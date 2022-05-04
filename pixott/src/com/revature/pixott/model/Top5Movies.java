package com.revature.pixott.model;

public class Top5Movies {
private int id;
private int top5Movie;
private String movieName;

public Top5Movies() {
	
}

public Top5Movies(int id, int top5Movie, String movieName) {
	super();
	this.id = id;
	this.top5Movie = top5Movie;
	this.movieName = movieName;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getTop5Movie() {
	return top5Movie;
}

public void setTop5Movie(int top5Movie) {
	this.top5Movie = top5Movie;
}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
	result = prime * result + top5Movie;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Top5Movies other = (Top5Movies) obj;
	if (id != other.id)
		return false;
	if (movieName == null) {
		if (other.movieName != null)
			return false;
	} else if (!movieName.equals(other.movieName))
		return false;
	if (top5Movie != other.top5Movie)
		return false;
	return true;
}

@Override
public String toString() {
	return  top5Movie+"."+ movieName;
}

}
