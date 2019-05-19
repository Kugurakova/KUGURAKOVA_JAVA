package ru.kugurakova.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kugurakova.app.dto.UnloadDataTypeDto;
import ru.kugurakova.app.models.UnloadDataType;
import ru.kugurakova.app.repositories.UnloadDataTypeRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UnloadDataTypeServiceImpl implements UnloadDataTypeService {
    @Autowired
    private UnloadDataTypeRepository unloadDataTypeRepository;

    @Override
    public List<UnloadDataTypeDto> getUnloadDataTypes(){
    return unloadDataTypeRepository.findAllByOrderByIdAsc().stream().map(UnloadDataTypeDto::new).collect(Collectors.toList());
    }

    @Override
    public UnloadDataType getUnloadDataType(Long id) {
        return unloadDataTypeRepository.getOne(id);
    }
}
