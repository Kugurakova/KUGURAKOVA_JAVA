package ru.kugurakova.app.services;

import ru.kugurakova.app.models.UnloadFile;
import java.util.List;

public interface UnloadFileService {
List<UnloadFile> getUnloadFiles();
void add (UnloadFile unloadFile);
}

