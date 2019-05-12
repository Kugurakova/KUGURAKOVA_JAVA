package ru.kugurakova.app.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String guid;

    @OneToMany(mappedBy = "city")
    private List<UnloadPackage> unloadPackages;
}
