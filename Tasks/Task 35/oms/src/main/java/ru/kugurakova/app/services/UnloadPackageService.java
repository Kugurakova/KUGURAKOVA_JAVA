package ru.kugurakova.app.services;

import ru.kugurakova.app.models.UnloadPackage;
import java.util.List;

public interface UnloadPackageService {
    List<UnloadPackage> getUnloadPackages();
    void add (UnloadPackage unload_package);
}
