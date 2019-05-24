package ru.kugurakova.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kugurakova.app.models.UnloadPackageType;

import java.util.List;

public interface UnloadPackageTypeRepository extends JpaRepository <UnloadPackageType, Long> {
    List<UnloadPackageType> findAll();
    List<UnloadPackageType> findAllByOrderByIdAsc();
}