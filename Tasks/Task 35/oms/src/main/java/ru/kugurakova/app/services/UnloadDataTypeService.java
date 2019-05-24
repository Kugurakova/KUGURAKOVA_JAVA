package ru.kugurakova.app.services;

        import ru.kugurakova.app.dto.UnloadDataTypeDto;
        import ru.kugurakova.app.models.UnloadDataType;

        import java.util.List;

public interface UnloadDataTypeService {
    List<UnloadDataTypeDto> getUnloadDataTypes();
    UnloadDataType getUnloadDataType(Long id);
}