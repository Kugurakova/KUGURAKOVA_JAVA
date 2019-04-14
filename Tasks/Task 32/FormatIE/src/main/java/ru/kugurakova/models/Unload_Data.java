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
public class Unload_Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;
    private String code;
    @ManyToOne
    @JoinColumn(name = "unload_data_type_id")
    private Unload_Data_Type unload_data_type;
    private String length;
    private String table_nm;
    private String column_nm;
    @ManyToOne
    @JoinColumn(name = "unload_file_id")
    private Unload_File unload_file;
    private int order_num;
    @ManyToOne
    @JoinColumn(name = "unload_column_type_id")
    private Unload_Column_Type unload_column_type;
    private boolean fl_update;
    private boolean need;
    private String db_table_nm;
    private String update_str;
    private String check_text;
    private boolean fl_const;
    private String const_value;
    private String start_date;
    private String end_date;

}
