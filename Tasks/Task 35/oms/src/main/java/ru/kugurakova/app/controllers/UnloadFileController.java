package ru.kugurakova.app.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kugurakova.app.models.UnloadFile;
import ru.kugurakova.app.services.UnloadDataServiceImpl;
import ru.kugurakova.app.services.UnloadFileService;

import java.util.List;
@Controller
@RequestMapping("/unloadfile")
public class UnloadFileController {
@Autowired
    private UnloadFileService unloadFileService;
@GetMapping
    public String getUnloadFilePage(ModelMap model){
    List<UnloadFile> files = unloadFileService.getUnloadFiles();
    model.addAttribute("files",files);
    return "unloadfile";
}
}

