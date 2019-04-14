package ru.kugurakova.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Unload_Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String code;
    private String zip_command;
    private String unzip_command;
    private String archive_format;
    @ManyToOne
    @JoinColumn(name = "unload_package_type_id")
    private Unload_Package_Type unload_package_type;
    private int order_num;
    private String start_date;
    private String end_date;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(mappedBy = "unload_package")
    private List<Unload_File> unload_files;
}
