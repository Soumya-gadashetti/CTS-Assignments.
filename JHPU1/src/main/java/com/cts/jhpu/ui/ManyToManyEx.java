package com.cts.jhpu.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.jhpu.model.Artist;
import com.cts.jhpu.model.Movie;
import com.cts.jhpu.util.JPAUtil;

public class ManyToManyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artist a1=new Artist(101,"Soumya",new TreeSet<Movie>());
		Artist a2=new Artist(102,"Julia",new TreeSet<Movie>());
		Artist a3=new Artist(103,"Senorita",new TreeSet<Movie>());
		
		Movie m1=new Movie(1,"ZNMD",new TreeSet<Artist>());
		Movie m2=new Movie(2,"Tuhiho",new TreeSet<Artist>());
		m1.getArtists().add(a1);
		m1.getArtists().add(a2);
		
		a1.getMovies().add(m1);
		a2.getMovies().add(m2);
		
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tnx=em.getTransaction();
				tnx.begin();
				em.persist(a1);
				em.persist(a2);
				em.persist(a3);
				tnx.commit();
				System.out.println("Inserted");
				JPAUtil.shutdown();
		
	}

}
