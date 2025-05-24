package com.luanalves.dslist.controllers;

import com.luanalves.dslist.dto.GameMinDTO;
import com.luanalves.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    public GameService gameService;

    @GetMapping
    public List<GameMinDTO> findall() {
        return gameService.findAll();
    }
}
