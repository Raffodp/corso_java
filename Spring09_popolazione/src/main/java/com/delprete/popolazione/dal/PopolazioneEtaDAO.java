package com.delprete.popolazione.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delprete.popolazione.entities.PopolazioneEta;

@Repository
public interface PopolazioneEtaDAO extends JpaRepository<PopolazioneEta, Integer>{

}
