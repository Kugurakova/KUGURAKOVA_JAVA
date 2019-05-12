package ru.kugurakova.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kugurakova.app.models.UnloadFile;
import java.util.List;

public interface UnloadFileRepository  extends JpaRepository<UnloadFile,Long> {
    List<UnloadFile> findAll();
}
