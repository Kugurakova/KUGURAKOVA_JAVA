package ru.kugurakova.app.models;

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
@Table(name = "Unload_File")
public class UnloadFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name",length = 100)
    private String name;
    @Column(name="title",length = 60)
    private String title;
    @Column(name="code",length = 30)
    private String code;
    @Column(name="version",length = 10)
    private String version;
    @Column(name="file_type",length = 10)
    private String fileType;
    @ManyToOne
    @JoinColumn(name = "unload_package_id")
    private UnloadPackage unloadPackage;
    @Column(name="fl_main")
    private Boolean flMain;
    @Column(name="code_page",length = 30)
    private String codePage;
    @OneToMany(mappedBy = "unloadFile")
    private List<UnloadData> unloadData;


}
