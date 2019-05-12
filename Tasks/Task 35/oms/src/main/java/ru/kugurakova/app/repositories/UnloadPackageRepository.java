package ru.kugurakova.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kugurakova.app.models.UnloadPackage;

import java.util.List;

public interface UnloadPackageRepository  extends JpaRepository<UnloadPackage, Long> {
    List<UnloadPackage> findAll();
}
