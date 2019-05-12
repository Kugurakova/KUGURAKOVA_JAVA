package ru.kugurakova.app.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "unload_Data")
public class UnloadData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name",length = 100)
    private String name;
    @Column(name="description",length = 512)
    private String description;
    @Column(name="code",length = 30, nullable =false)
    private String code;
    @ManyToOne
    @JoinColumn(name = "unload_data_type_id", nullable =false)
    private UnloadDataType unloadDataType;
    @Column(name="length",length = 20, nullable =false)
    private String length;
    @Column(name="table_nm",length = 60, nullable =false)
    private String tableNm;
    @Column(name="column_nm",length = 60, nullable =false)
    private String columnNm;
    @ManyToOne
    @JoinColumn(name = "unload_file_id")
    private UnloadFile unloadFile;
    @Column(name="order_num")
    private int orderNum;
    @ManyToOne
    @JoinColumn(name = "unload_column_type_id")
    private UnloadColumnType unloadColumnType;
    @Column(name="fl_update")
    private Boolean flUpdate;
    @Column(name = "need",nullable = false)
    private Boolean need;
    @Column(name="db_table_nm",length = 60, nullable =false)
    private String dbTableNm;
    @Column(name="updateStr", nullable =false)
    private String update_str;
    @Column(name="checkText",length = 255, nullable =false)
    private String check_text;
    @Column(name="fl_const")
    private Boolean flConst;
    @Column(name="const_value",length = 250, nullable =false)
    private String constValue;
}
