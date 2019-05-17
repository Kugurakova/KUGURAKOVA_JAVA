package ru.kugurakova.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kugurakova.app.dto.UnloadDataDto;
import ru.kugurakova.app.models.UnloadData;
import ru.kugurakova.app.repositories.UnloadDataRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UnloadDataServiceImpl implements UnloadDataService {
    @Autowired
    private UnloadDataRepository unloaddataRepository;
    @Override
    public UnloadData getUnloadDataById(Long id){return unloaddataRepository.getOne(id);};

    @Override
    public void add(UnloadData unloaddata) { unloaddataRepository.save(unloaddata);}

    @Override
    public void save(UnloadData unloaddata) { unloaddataRepository.save(unloaddata);}

    @Override
    public List<UnloadDataDto> getUnloadData(){
        return unloaddataRepository.findAllByOrderByUnloadFileAscOrderNumAsc().stream().map(UnloadDataDto::new).collect(Collectors.toList());

    }

}
