package com.delprete.anime.service;

import java.util.List;

import com.delprete.anime.model.Anime;

public interface AnimeService {
	
	void addAnime(Anime a);
	void updAnime(Anime a);
	void delAnime(String animeName);
	
	List<Anime> getAnime();
}
