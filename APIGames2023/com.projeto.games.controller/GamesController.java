package com.projeto.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.games.model.Games;
import com.projeto.games.repository.GamesRepository;

@RestController
@RequestMapping("/games")
public class ClienteController {
	
	@Autowired
	private GamesRepository gamesRepository;
	
	
	@GetMapping
	public List<Games> listar() {
		return gamesRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Games adicionar (@RequestBody Games games) {
		
		return gamesRepository.save(games);
	}
	
	@DeleteMapping
	public void deletar (@RequestBody Games games) {
		gamesRepository.delete(games);
	
	}
	
	@PutMapping
	public Games atualizar (@RequestBody Games games) {
		return gamesRepository.save(games);
	
	}
	
}
