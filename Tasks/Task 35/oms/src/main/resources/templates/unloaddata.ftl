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
            <table>
                <tr><td>Порядковый номер</td>
                    <td> <input type="number" name = "orderNum" value= "${unloaddata.orderNum}" ></td></tr>
                <tr><td>Название элемента.атрибута</td>
                    <td> <input type = "text" name = "name" value=  ${unloaddata.name} ></td></tr>
                <tr><td>Наименование элемента.атрибута</td>
                    <td><input type = "text" name = "description" value=${unloaddata.description} ></td></tr>
                <tr><td>Тип данных</td>
                    <td><select name="unloadDataType" >
                            <option> </option>
                            <#list dataTypes as dataType>
                                <option value=${dataType.id}
                                <#if !(unloaddata.unloadDataType??) ><#elseif unloaddata.getUnloadDataType().getId() == dataType.id > selected </#if>  >
                                ${dataType.getName()} </option>
                            </#list>
                        </select></td></tr>
                <tr><td>Длина</td>
                    <td><input type = "text" name = "length" value=${unloaddata.length} ></td></tr>
                <tr><td>Функция выгрузки</td>
                    <td><input type = "text" name = "tableNm" value=${unloaddata.tableNm} ></td></tr>
                <tr><td>Выгружаемое поле</td>
                    <td><input type = "text" name = "columnNm" value=${unloaddata.columnNm} ></td></tr>
                <tr><td>Тип элемента</td>
                    <td><select name ="unloadColumnType">
                            <option> </option>
                            <#list columnTypes as columnType>
                                <option value=${columnType.id}
                                <#if !(unloaddata.unloadColumnType??) ><#elseif unloaddata.getUnloadColumnType().getId() == columnType.id > selected </#if>  >
                                ${columnType.getName()} </option>
                            </#list>
                        </select></td></tr>
                <tr><td>Элемент-родитель</td>
                    <td><input type = "text" name = "dbTableNm" value=${unloaddata.dbTableNm} ></td></tr>
                <tr><td>Скрипт изменения данных</td>
                    <td><textarea name="updateStr" rows="2" cols="60"> ${unloaddata.updateStr}</textarea>
                    </td></tr>
                <tr><td>Изменять данные при загрузке реестра</td>
                    <td>
                        <input type="radio" name="flUpdate" <#if unloaddata.flUpdate> checked <#else> </#if> value="true" > Да
                        <input type="radio" name="flUpdate" <#if unloaddata.flUpdate> <#else> checked </#if> value="false"> Нет
                    </td></tr>
                <tr><td>Обязательность содержимого элемента</td>
                    <td>
                        <input type = "radio" name = "need" <#if !(unloaddata.need??)> checked <#else> </#if> value="true" > Да
                        <input type = "radio" name = "need" <#if !(unloaddata.need??)> <#else> checked </#if> value="false" > Нет
                        <input type = "radio" name = "need" <#if !(unloaddata.need??)> checked </#if> value="" > По условию
                    </td></tr>
                <tr><td>Выгружать константное значение</td>
                    <td>
                        <input type = "radio" name = "flConst" <#if unloaddata.flConst> checked <#else> </#if> value="true" > Да
                        <input type = "radio" name = "flConst" <#if unloaddata.flConst> <#else> checked </#if> value="false"> Нет
                    </td></tr>
                <tr><td>Константа</td>
                    <td><input type = "text" name = "constValue" value=${unloaddata.constValue!""} >
                    </td></tr>
                <tr><td>Условие при проверке на обязательность поля</td>
                    <td>
                        <textarea name="checkText" rows="2" cols="60">${unloaddata.checkText!""}</textarea>
                    </td></tr>
                 <tr><td><input hidden type="number" name = "unloadFile" value= "${unloaddata.getUnloadFile().id}" ></td>
                     <td><input type="submit" value="Сохранить" /></td>
                </tr>
            </table>
    </fieldset>
</div>
</body>
</html>