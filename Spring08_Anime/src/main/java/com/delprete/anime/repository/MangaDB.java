package com.delprete.anime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delprete.anime.model.Anime;
import com.delprete.anime.model.Manga;

@Repository
public interface MangaDB extends JpaRepository<Manga, String> {

}
