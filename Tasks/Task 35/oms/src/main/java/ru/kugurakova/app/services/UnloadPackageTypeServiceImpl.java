package ru.kugurakova.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kugurakova.app.dto.UnloadPackageTypeDto;
import ru.kugurakova.app.repositories.UnloadPackageTypeRepository;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class UnloadPackageTypeServiceImpl implements UnloadPackageTypeService{

    @Autowired
    private UnloadPackageTypeRepository unloadPackageTypeRepository;

    @Override
    public List<UnloadPackageTypeDto> getUnloadPackageTypes(){
        return unloadPackageTypeRepository.findAllByOrderByIdAsc().stream().map(UnloadPackageTypeDto::new).collect(Collectors.toList());
    }

}