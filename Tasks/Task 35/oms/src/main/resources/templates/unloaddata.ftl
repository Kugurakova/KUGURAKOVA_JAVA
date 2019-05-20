<#import "spring.ftl" as spring />
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script
            src="https://code.jquery.com/jquery-3.4.0.js"
            integrity="sha256-DYZMCC8HTC+QDr5QNaIcfR7VSPtcISykd+6eSmBW5qo="
            crossorigin="anonymous"></script>
    <link type="text/css" rel="stylesheet" href="styles.css" />
    <title>ЭЛЕМЕНТ</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
</head>
<script>
    function getDists() {
        $.ajax({
            type: "GET",
            url: "/udatatypes",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function(response){
                let resultPlace = document.getElementById('datatype');
                let resultString ='<option></option>';
                for (let i = 0; i < response.length; i++){
                    var current = response[i];
                    resultString +='<option value='+current['id']+'>'+current['name']+'</option>';
                }
                resultPlace.innerHTML=resultString;
            },
            failure: function (errMsg) {
                alert(errMsg);
            }
        });
        $.ajax({
            type: "GET",
            url: "/ucolumntypes",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function(response){
                let resultPlace = document.getElementById('columntype');
                let resultString ='<option></option>';
                for (let i = 0; i < response.length; i++){
                    var current = response[i];
                    resultString +='<option value='+current['id']+'>'+current['name']+'</option>';
                }
                resultPlace.innerHTML=resultString;
            },
            failure: function (errMsg) {
                alert(errMsg);
            }
        });
    }

</script>
<body  onload="getDists();">
<div>
    <fieldset>
        <legend>ЭЛЕМЕНТ</legend>
        <form name="unloaddata" action="" method="POST">
            <input hidden type="number" name = "unloadFile" value= "${unloaddata.getUnloadFile().id}" >
            Порядковый номер <input type="number" name = "orderNum" value= "${unloaddata.orderNum}" ><br/>
            Название элемента.атрибута <input type = "text" name = "name" value=  ${unloaddata.name} ><br/>
            Наименование элемента.атрибута <input type = "text" name = "description" value=${unloaddata.description} >  <br/>
            Тип данных
            <select name="unloadDataType" >
                <option> </option>
            <#list dataTypes as dataType>
                <option value=${dataType.id}
                    <#if !(unloaddata.unloadDataType??) ><#elseif unloaddata.getUnloadDataType().getId() == dataType.id > selected </#if>  >
                    ${dataType.getName()} </option>
            </#list>
            </select>
            <br/>
            Длина<input type = "text" name = "length" value=${unloaddata.length} >  <br/>
            Функция выгрузки<input type = "text" name = "tableNm" value=${unloaddata.tableNm} >  <br/>
            Выгружаемое поле<input type = "text" name = "columnNm" value=${unloaddata.columnNm} >  <br/>
            Тип элемента
            <select name ="unloadColumnType">
            <#list columnTypes as columnType>
                <option value=${columnType.id}
                    <#if !(unloaddata.unloadColumnType??) ><#elseif unloaddata.getUnloadColumnType().getId() == columnType.id > selected </#if>  >
                    ${columnType.getName()} </option>
            </#list>
            </select>
            <br/>
            Элемент-родитель<input type = "text" name = "dbTableNm" value=${unloaddata.dbTableNm} >  <br/>
            Скрипт изменения данных
            <input type = "text" name = "update_str" value=${unloaddata.update_str} >
            <br/>
            Изменять данные при загрузке реестра
            <input type="radio" name="flUpdate" <#if unloaddata.flUpdate> checked <#else> </#if> value="true" > Да
            <input type="radio" name="flUpdate" <#if unloaddata.flUpdate> <#else> checked </#if> value="false"> Нет
            <br/>
            Обязательность содержимого элемента
            <input type = "radio" name = "need" <#if unloaddata.need> checked <#else> </#if> value="true" > Да
            <input type = "radio" name = "need" <#if unloaddata.need> <#else> checked </#if> value="false" > Нет
            <br/>
            Выгружать константное значение
            <input type = "radio" name = "flConst" <#if unloaddata.flConst> checked <#else> </#if> value="true" > Да
            <input type = "radio" name = "flConst" <#if unloaddata.flConst> <#else> checked </#if> value="false"> Нет
            <br/>
            Константа<input type = "text" name = "constValue" value=${unloaddata.constValue!""} >  <br/>
            Условие при проверке на обязательность поля<input type = "text" name = "check_text" value=${unloaddata.check_text!""} >  <br/>
            <input type="submit" value="Сохранить" />
    </fieldset>
</div>
</body>
</html>