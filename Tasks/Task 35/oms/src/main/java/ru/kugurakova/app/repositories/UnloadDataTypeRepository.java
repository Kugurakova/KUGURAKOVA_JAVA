package ru.kugurakova.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kugurakova.app.models.UnloadDataType;
import java.util.List;

public interface UnloadDataTypeRepository extends JpaRepository<UnloadDataType,Long> {
    List<UnloadDataType> findAll();
    List<UnloadDataType> findAllByOrderByIdAsc();


}
