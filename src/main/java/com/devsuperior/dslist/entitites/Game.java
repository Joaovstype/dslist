package com.devsuperior.dslist.entitites;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb-game")
public class Game {

	// ATRIBUTOS //
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String platforms;
	private String imgUrl;
	private String shortDescription;
	private String longDescrispition;
	
	// CONSTRUTORES //
	
	
	public Game() {
	}

	public Game(long id, String title, Integer year, String genre, String platforms, String imgUrl,
			String shortDescription, String longDescrispition) {
		
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescrispition = longDescrispition;
	}

	// MÉTODOS //
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescrispition() {
		return longDescrispition;
	}

	public void setLongDescrispition(String longDescrispition) {
		this.longDescrispition = longDescrispition;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return id == other.id;
	}
	
	
	
	
}
