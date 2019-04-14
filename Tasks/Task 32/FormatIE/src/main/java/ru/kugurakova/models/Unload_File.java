package ru.kugurakova.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Unload_File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String title;
    private String code;
    private String version;
    private String file_type;
    @ManyToOne
    @JoinColumn(name = "unload_package_id")
    private Unload_Package unload_package;
    private boolean fl_main;
    private String code_page;
}
