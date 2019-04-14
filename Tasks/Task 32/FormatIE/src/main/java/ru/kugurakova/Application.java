package ru.kugurakova;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.kugurakova.models.City;
import ru.kugurakova.models.Unload_Package_Type;
import ru.kugurakova.models.Unload_Package;
import ru.kugurakova.models.Unload_File;
import ru.kugurakova.models.Unload_Data_Type;
import ru.kugurakova.models.Unload_Column_Type;
import ru.kugurakova.models.Unload_Data;

public class Application {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/unload_center");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "postgres");
        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
        configuration.setProperty("hibernate.hbm2ddl.auto", "update");
        configuration.setProperty("hibernate.show_sql", "true");

        configuration.addAnnotatedClass(City.class);
        configuration.addAnnotatedClass(Unload_Package_Type.class);
        configuration.addAnnotatedClass(Unload_Package.class);
        configuration.addAnnotatedClass(Unload_File.class);
        configuration.addAnnotatedClass(Unload_Data_Type.class);
        configuration.addAnnotatedClass(Unload_Column_Type.class);
        configuration.addAnnotatedClass(Unload_Data.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.close();
    }

}
