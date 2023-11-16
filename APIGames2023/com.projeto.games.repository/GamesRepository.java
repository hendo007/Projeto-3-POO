package com.projeto.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.projeto.games.model.Games;

@Repository
public interface GamesRepository extends JpaRepository<Games,Long> {

}
