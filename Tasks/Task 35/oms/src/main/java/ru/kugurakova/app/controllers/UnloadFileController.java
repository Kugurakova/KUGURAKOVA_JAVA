package ru.kugurakova.app.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.kugurakova.app.dto.UnloadFileDto;
import ru.kugurakova.app.models.UnloadFile;
import ru.kugurakova.app.services.UnloadFileService;

import java.util.List;
@Controller
@RequestMapping("/unloadfiles")
public class UnloadFileController {
@Autowired
    private UnloadFileService unloadFileService;
@GetMapping
    public String getUnloadFilePage(ModelMap model) {
    List<UnloadFileDto> files = unloadFileService.getUnloadFiles();
    model.addAttribute("files", files);
    return "unloadfiles";
}

    @GetMapping("/{id}")
    public String edit(@PathVariable Long id, ModelMap model) {
        UnloadFile unloadFile = unloadFileService.getUnloadFileById(id);
        model.addAttribute("unloadfile", unloadFile);
        return  "unloadfile";
    }

    @PostMapping("/{id}")
    public String save(@PathVariable Long id, @ModelAttribute("unloadfile") UnloadFile unloadFile) {
        unloadFileService.save(unloadFile);
        return  "redirect:/unloadpackages";
    }

}

