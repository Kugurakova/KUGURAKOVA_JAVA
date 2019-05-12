package ru.kugurakova.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.kugurakova.app.dto.UnloadDataTypeDto;
import ru.kugurakova.app.services.UnloadDataTypeService;

import java.util.List;

@RestController
@RequestMapping(value = "/udatatypes")
public class UnloadDataTypeController {

@Autowired
    private UnloadDataTypeService unloadDataTypeService;

    @GetMapping
    public List<UnloadDataTypeDto> getUnloadDataType() { return unloadDataTypeService.getUnloadDataTypes(); }

}

