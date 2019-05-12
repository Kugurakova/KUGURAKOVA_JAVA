package ru.kugurakova.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kugurakova.app.models.UnloadPackage;
import ru.kugurakova.app.repositories.UnloadPackageRepository;

import java.util.List;
@Service
public class UnloadPackageServiceImpl implements UnloadPackageService  {
    @Autowired
    private UnloadPackageRepository unloadPackageRepository;

    @Override
    public void add(UnloadPackage unloadPackage){unloadPackageRepository.save(unloadPackage);}

    @Override
    public List<UnloadPackage> getUnloadPackages(){  return unloadPackageRepository.findAll();}

}
