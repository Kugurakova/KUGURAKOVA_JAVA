package ru.kugurakova.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kugurakova.app.models.UnloadColumnType;
import ru.kugurakova.app.models.UnloadData;
import ru.kugurakova.app.models.UnloadDataType;
import ru.kugurakova.app.models.UnloadFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnloadDataDto {
    private Long id;
    private String name;
    private String description;
    private String code;
    private UnloadDataType unloadDataType;
    private String length;
    private String tableNm;
    private String columnNm;
    private UnloadFile unloadFile;
    private int orderNum;
    private UnloadColumnType unloadColumnType;
    private Boolean flUpdate;
    private Boolean need;
    private String dbTableNm;
    private String update_str;
    private String check_text;
    private Boolean flConst;
    private String constValue;

    public UnloadDataDto(UnloadData unloadData){
        this.id=unloadData.getId();
        this.name=unloadData.getName();
        this.description=unloadData.getDescription();
        this.code=unloadData.getCode();
        this.unloadDataType=unloadData.getUnloadDataType();
        this.length=unloadData.getLength();
        this.tableNm=unloadData.getTableNm();
        this.unloadFile=unloadData.getUnloadFile();
        this.columnNm=unloadData.getColumnNm();
        this.orderNum=unloadData.getOrderNum();
        this.unloadColumnType=unloadData.getUnloadColumnType();
        this.flUpdate=unloadData.getFlUpdate();
        this.need=unloadData.getNeed();
        this.dbTableNm=unloadData.getDbTableNm();
        this.update_str=unloadData.getUpdate_str();
        this.check_text=unloadData.getCheck_text();
        this.flConst=unloadData.getFlConst();
        this.constValue=unloadData.getConstValue();
    }

}

