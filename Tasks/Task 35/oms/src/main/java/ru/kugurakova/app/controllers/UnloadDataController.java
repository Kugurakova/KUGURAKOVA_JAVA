package ru.kugurakova.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.kugurakova.app.dto.UnloadColumnTypeDto;
import ru.kugurakova.app.dto.UnloadDataDto;
import ru.kugurakova.app.dto.UnloadDataTypeDto;
import ru.kugurakova.app.models.UnloadColumnType;
import ru.kugurakova.app.models.UnloadData;
import ru.kugurakova.app.models.UnloadDataType;
import ru.kugurakova.app.services.UnloadColumnTypeService;
import ru.kugurakova.app.services.UnloadDataService;
import ru.kugurakova.app.services.UnloadDataTypeService;

import java.util.List;

@Controller
@RequestMapping(value = "/unloaddatas")
public class UnloadDataController {
    @Autowired
    private UnloadDataService unloadDataService;
    @Autowired
    private UnloadDataTypeService unloadDataTypeService;
    @Autowired
    private UnloadColumnTypeService unloadColumnTypeService;

    @GetMapping
    public String getUnloadData(ModelMap model, ModelMap modtype) {
        List<UnloadDataDto> udatas = unloadDataService.getUnloadData();
        model.addAttribute("unloaddatas", udatas);
        return "unloaddatas";
    }

    @GetMapping("/{id}")
    public String edit(@PathVariable Long id, ModelMap model, ModelMap model2, ModelMap model3) {
        UnloadData udata = unloadDataService.getUnloadDataById(id);
        model.addAttribute("unloaddata", udata);
        List<UnloadDataTypeDto> dataTypeDtos = unloadDataTypeService.getUnloadDataTypes();
        model2.addAttribute("dataTypes", dataTypeDtos);
        List<UnloadColumnTypeDto> columnTypeDtos = unloadColumnTypeService.getUnloadColumnTypes();
        model3.addAttribute("columnTypes", columnTypeDtos);
        return "unloaddata";
    }

    @PostMapping("/{id}")
    public String save(@PathVariable Long id, @ModelAttribute("unloaddata") UnloadData unloadData) {
//        unloadData.setUnloadDataType(unloadDataTypeService.getUnloadDataType(Long.parseLong(dataTypeId)));
        unloadDataService.save(unloadData);
        return "redirect:/unloadpackages";
    }

    @PostMapping("/copy/{id}")
    public String copyData(@PathVariable Long id) {
        unloadDataService.copy(id);
        return "redirect:/unloadpackages";
    }
}

