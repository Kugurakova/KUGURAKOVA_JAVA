package ru.kugurakova.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kugurakova.app.models.UnloadData;
import java.util.List;

public interface UnloadDataRepository extends JpaRepository<UnloadData, Long> {
    List<UnloadData> findAll();
    List<UnloadData>  findAllByOrderByUnloadFileAscOrderNumAsc();

}
