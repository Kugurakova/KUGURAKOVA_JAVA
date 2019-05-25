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
    public UnloadData getUnloadDataById(Long id){return unloaddataRepository.getOne(id);
    };

    @Override
    public void add(UnloadData unloaddata) { unloaddataRepository.save(unloaddata);}

    @Override
    public void save(UnloadData unloaddata) { unloaddataRepository.save(unloaddata);}

    @Override
    public List<UnloadDataDto> getUnloadData(){
        return unloaddataRepository.findAllByOrderByUnloadFileAscOrderNumAsc().stream().map(UnloadDataDto::new).collect(Collectors.toList());}

    @Override
    public void copy(Long id){
        UnloadData unloadData = UnloadData.builder()
                .name(unloaddataRepository.getOne(id).getName())
                .description(unloaddataRepository.getOne(id).getDescription())
                .code(unloaddataRepository.getOne(id).getCode())
                .unloadDataType(unloaddataRepository.getOne(id).getUnloadDataType())
                .length(unloaddataRepository.getOne(id).getLength())
                .tableNm(unloaddataRepository.getOne(id).getTableNm())
                .columnNm(unloaddataRepository.getOne(id).getColumnNm())
                .unloadFile(unloaddataRepository.getOne(id).getUnloadFile())
                .orderNum(unloaddataRepository.getOne(id).getOrderNum())
                .unloadColumnType(unloaddataRepository.getOne(id).getUnloadColumnType())
                .flUpdate(unloaddataRepository.getOne(id).getFlUpdate())
                .need(unloaddataRepository.getOne(id).getNeed())
                .dbTableNm(unloaddataRepository.getOne(id).getDbTableNm())
                .updateStr(unloaddataRepository.getOne(id).getUpdateStr())
                .checkText(unloaddataRepository.getOne(id).getCheckText())
                .flConst(unloaddataRepository.getOne(id).getFlConst())
                .constValue(unloaddataRepository.getOne(id).getConstValue())
                .build();
        unloaddataRepository.save(unloadData);

    }


}
