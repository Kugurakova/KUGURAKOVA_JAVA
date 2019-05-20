package ru.kugurakova.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kugurakova.app.dto.UnloadColumnTypeDto;
import ru.kugurakova.app.services.UnloadColumnTypeService;

import java.util.List;

@RestController
@RequestMapping(value = "/ucolumntypes")
public class UnloadColumnTypeController {
@Autowired
    private UnloadColumnTypeService unloadColumnTypeService;

@GetMapping
    public List<UnloadColumnTypeDto> getUnloadColumnType(){
    return unloadColumnTypeService.getUnloadColumnTypes();}
}
