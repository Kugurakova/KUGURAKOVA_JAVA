package ru.kugurakova.repositories;

import ru.kugurakova.models.Car;
import ru.kugurakova.models.User;
import ru.kugurakova.utils.IdGenerator;
import java.io.*;

public class CarsRepositoryImpl implements CarsRepository {
    private String fileName;
    private IdGenerator idGenerator;

    public CarsRepositoryImpl(String fileName, IdGenerator idGenerator) {
        this.fileName = fileName;
        this.idGenerator = idGenerator;
    }

    @Override
    public void save(Car model) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            int id = idGenerator.generateId();
            model.setId(id);
            writer.write(model.getId() + " " + model.getName() + " " + model.getOwner());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public Car find(int id) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String carData[] = currentLine.split(" ");
                int currentId = Integer.parseInt(carData[0]);
                if (currentId == id) {
                    Car car = new Car(carData[1], Integer.parseInt(carData[2]));
                    car.setId(currentId);
                    return car;
                }
                currentLine = reader.readLine();
            }
            return null;
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public List<Car> findByOwner(User user) {
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            String currentLine = reader.readLine();
            while (currentLine != null) {
                String carData[] = currentLine.split(" ");
                if (user.getId() == Integer.parseInt(carData[2])) {
                    Car car = new Car(carData[1], Integer.parseInt(carData[2]));
                    car.setId(Integer.parseInt(carData[0]));
                    return null; //car;
                }
                currentLine = reader.readLine();
            }
            return null;
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

}
