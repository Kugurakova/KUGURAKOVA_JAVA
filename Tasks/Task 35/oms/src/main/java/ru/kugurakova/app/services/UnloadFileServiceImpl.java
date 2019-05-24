package ru.kugurakova.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kugurakova.app.dto.UnloadFileDto;
import ru.kugurakova.app.models.UnloadFile;
import ru.kugurakova.app.repositories.UnloadFileRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UnloadFileServiceImpl implements UnloadFileService {
    @Autowired
    private UnloadFileRepository unloadFileRepository;

    @Override
    public void add(UnloadFile unloadFile){unloadFileRepository.save(unloadFile);}

    @Override
    public List<UnloadFileDto> getUnloadFiles(){ return unloadFileRepository.findAll().stream().map(UnloadFileDto::new).collect(Collectors.toList());}
}