package ru.kugurakova.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kugurakova.app.models.UnloadColumnType;
import java.util.List;

public interface UnloadColumnTypeRepository extends JpaRepository<UnloadColumnType, Long> {
    List<UnloadColumnType> findAll();
    List<UnloadColumnType> findAllByOrderByIdAsc();
}
