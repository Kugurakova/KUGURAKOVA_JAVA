package ru.kugurakova.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.kugurakova.app.dto.UnloadDataDto;
import ru.kugurakova.app.dto.UnloadFileDto;
import ru.kugurakova.app.dto.UnloadPackageDto;
import ru.kugurakova.app.dto.UnloadPackageTypeDto;
import ru.kugurakova.app.models.UnloadPackage;
import ru.kugurakova.app.services.UnloadDataService;
import ru.kugurakova.app.services.UnloadFileService;
import ru.kugurakova.app.services.UnloadPackageService;
import ru.kugurakova.app.services.UnloadPackageTypeService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/unloadpackages")
public class UnloadPackageController {
    @Autowired
    private UnloadPackageService unloadPackageService;
    @Autowired
    private UnloadPackageTypeService unloadPackageTypeService;
    @Autowired
    private UnloadFileService unloadFileService;
    @Autowired
    private UnloadDataService unloadDataService;

    @GetMapping
    public String getUnloadPackagePage(ModelMap model, ModelMap model2, ModelMap model3) {
        List<UnloadPackageDto> packages = unloadPackageService.getUnloadPackages();
        model.addAttribute("packages", packages);
        List<UnloadFileDto> files = unloadFileService.getUnloadFiles();
        model2.addAttribute("files", files);
        List<UnloadDataDto> udata = unloadDataService.getUnloadData();
        model3.addAttribute("udata", udata);
        return "unloadpackages";
    }

    @GetMapping("/{id}")
    public String edit(@PathVariable Long id, ModelMap model, ModelMap model2, ModelMap model3) {
        UnloadPackage unloadPackage = unloadPackageService.getUnloadPackageById(id);
        model.addAttribute("unloadpackage", unloadPackage);
        List<UnloadPackageTypeDto> unloadPackageTypeDtos = unloadPackageTypeService.getUnloadPackageTypes();
        model2.addAttribute("packagetypes",unloadPackageTypeDtos);
        return  "unloadpackage";
    }

    @PostMapping("/{id}")
    public String save(@PathVariable Long id, @ModelAttribute("unloadpackage") UnloadPackage unloadPackage) {
        unloadPackageService.save(unloadPackage);
        return  "redirect:/unloadpackages";
    }
}