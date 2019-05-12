package ru.kugurakova.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kugurakova.app.dto.UnloadColumnTypeDto;
import ru.kugurakova.app.repositories.UnloadColumnTypeRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UnloadColumnTypeServiceImpl implements UnloadColumnTypeService {
@Autowired
private UnloadColumnTypeRepository unloadColumnTypeRepository;
@Override
public List<UnloadColumnTypeDto> getUnloadColumnTypes(){
    return unloadColumnTypeRepository.findAllByOrderByIdAsc().stream().map(UnloadColumnTypeDto::new).collect(Collectors.toList());
}
}
