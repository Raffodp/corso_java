package com.delprete.anime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delprete.anime.model.Anime;
import com.delprete.anime.repository.AnimeDB;

@Service
public class AnimeServiceImpl implements AnimeService {
	
	@Autowired
	AnimeDB aDB;

	@Override
	public void addAnime(Anime a) {
		this.aDB.save(a);
		
	}

	@Override
	public void updAnime(Anime a) {
		this.aDB.save(a);
		
	}

	@Override
	public void delAnime(String animeName) {
		this.aDB.deleteById(animeName);
	}

	@Override
	public List<Anime> getAnime() {
		return this.aDB.findAll();
	}

}
