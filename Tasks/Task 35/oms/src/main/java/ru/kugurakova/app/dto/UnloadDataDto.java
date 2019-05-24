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
    private UnloadDataTypeDto unloadDataType;
    private String length;
    private String tableNm;
    private String columnNm;
    private UnloadFileDto unloadFile;
    private Integer orderNum;
    private UnloadColumnTypeDto unloadColumnType;
    private Boolean flUpdate;
    private Boolean need;
    private String dbTableNm;
    private String updateStr;
    private String checkText;
    private Boolean flConst;
    private String constValue;

    public UnloadDataDto(UnloadData unloadData){
        this.id=unloadData.getId();
        this.name=unloadData.getName();
        this.description=unloadData.getDescription();
        this.code=unloadData.getCode();
        this.unloadDataType=unloadData.getUnloadDataType() == null ? null: new UnloadDataTypeDto(unloadData.getUnloadDataType());
        this.length=unloadData.getLength();
        this.tableNm=unloadData.getTableNm();
        this.unloadFile=unloadData.getUnloadFile() == null ? null: new UnloadFileDto(unloadData.getUnloadFile());
        this.columnNm=unloadData.getColumnNm();
        this.orderNum=unloadData.getOrderNum();
        this.unloadColumnType=unloadData.getUnloadColumnType() == null ? null: new UnloadColumnTypeDto(unloadData.getUnloadColumnType());
        this.flUpdate=unloadData.getFlUpdate();
        this.need=unloadData.getNeed();
        this.dbTableNm=unloadData.getDbTableNm();
        this.updateStr=unloadData.getUpdateStr();
        this.checkText=unloadData.getCheckText();
        this.flConst=unloadData.getFlConst();
        this.constValue=unloadData.getConstValue();
    }

}