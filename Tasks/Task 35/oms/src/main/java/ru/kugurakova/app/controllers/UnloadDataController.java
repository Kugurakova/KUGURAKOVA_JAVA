package ru.kugurakova.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.kugurakova.app.dto.UnloadDataDto;
import ru.kugurakova.app.models.UnloadData;
import ru.kugurakova.app.services.UnloadDataService;

import java.util.List;

@Controller
@RequestMapping(value = "/unloaddatas")
public class UnloadDataController {
@Autowired
    private UnloadDataService unloaddatsService;

@GetMapping
    public String getUnloadData(ModelMap model, ModelMap modtype){
    List<UnloadDataDto> udatas = unloaddatsService.getUnloadData();
    model.addAttribute("unloaddatas", udatas);
    return "unloaddatas";
}

    @GetMapping("/{id}")
    public String edit (@PathVariable Long id, ModelMap model) {
        UnloadData udata = unloaddatsService.getUnloadDataById(id);
        model.addAttribute("unloaddata",udata);
        return  "unloaddata";
    }

    @PostMapping("/{id}")
    public String save (@PathVariable Long id, @ModelAttribute("unloaddata") UnloadData unloadData) {
        unloaddatsService.save(unloadData);
        return  "redirect:/unloaddatas";
    }
}
