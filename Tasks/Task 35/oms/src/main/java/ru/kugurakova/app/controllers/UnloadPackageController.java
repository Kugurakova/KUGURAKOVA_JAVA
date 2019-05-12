package ru.kugurakova.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kugurakova.app.dto.UnloadDataDto;
import ru.kugurakova.app.models.UnloadData;
import ru.kugurakova.app.models.UnloadFile;
import ru.kugurakova.app.models.UnloadPackage;
import ru.kugurakova.app.services.UnloadDataService;
import ru.kugurakova.app.services.UnloadFileService;
import ru.kugurakova.app.services.UnloadPackageService;

import java.util.List;

@Controller
@RequestMapping("/package")
public class UnloadPackageController {
    @Autowired
    private UnloadPackageService unloadPackageService;
    @Autowired
    private UnloadFileService unloadFileService;
    @Autowired
    private UnloadDataService unloadDataService;

    @GetMapping
    public String getUnloadPackagePage(ModelMap model,ModelMap model2,ModelMap model3 ){
        List<UnloadPackage> packages = unloadPackageService.getUnloadPackages();
        model.addAttribute("packages",packages);
        List<UnloadFile> files = unloadFileService.getUnloadFiles();
        model2.addAttribute("files", files);
        List<UnloadDataDto> udata = unloadDataService.getUnloadData();
        model3.addAttribute("udata", udata);
        return "package";
    }
}
