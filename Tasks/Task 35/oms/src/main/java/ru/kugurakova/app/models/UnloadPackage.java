package ru.kugurakova.app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Unload_Package")
public class UnloadPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name",length = 100)
    private String name;
    @Column(name="description",length = 512)
    private String description;
    @Column(name="code",length = 30, nullable =false)
    private String code;
    @Column(name="zip_command",length = 200)
    private String zipCommand;
    @Column(name="unzip_command",length = 200)
    private String unzipCommand;
    @Column(name="archive_format",length = 10)
    private String archiveFormat;
    @ManyToOne
    @JoinColumn(name = "unload_package_type_id")
    private UnloadPackageType unloadPackageType;
    @Column(name="order_num",length = 10)
    private Long orderNum;
    @Column(name="start_date")
    private LocalDateTime startDate;
    @Column(name="end_date",nullable = false )
    private LocalDateTime endDate;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(mappedBy = "unloadPackage")
    private List<UnloadFile> unloadFiles;
}
