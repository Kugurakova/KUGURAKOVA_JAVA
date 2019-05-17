package ru.kugurakova.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.kugurakova.app.dto.CityDto;
import ru.kugurakova.app.models.City;
import ru.kugurakova.app.services.CitiesService;

import java.util.List;

@Controller
@RequestMapping(value = "/cities")
public class CitiesController {
    @Autowired
    private CitiesService citiesService;

    @GetMapping()
    public String getCitiesPage(ModelMap model){
        List<CityDto> cities = citiesService.getCities();
        model.addAttribute("cities", cities);
        return  "cities";
    }

    @GetMapping("/{id}")
    public String edit (@PathVariable Long id, ModelMap model) {
        City city = citiesService.getCityById(id);
        model.addAttribute("city",city);
        return "city";
    }

    @PostMapping("/{id}")
    public String save (@PathVariable Long id, @ModelAttribute("city") City city) {
        citiesService.save(city);
        return  "redirect:/cities";
    }

}
