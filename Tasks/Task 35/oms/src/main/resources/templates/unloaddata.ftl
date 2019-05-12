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
<body>
<div>
    <fieldset>
        <legend>ЭЛЕМЕНТ</legend>
        <form name="udata" action="" method="POST">
            Порядковый номер <input type = "text" name = "orderNum" value=${udata.orderNum} >  <br/>
            Название элемента.атрибута <input type = "text" name = "name" value=${udata.name}>  <br/>
            Наименование элемента.атрибута <input type = "text" name = "description" value=${udata.description} >  <br/>
            Тип данных<select id ="datatype"></select>  <br/>
            Длина<input type = "text" name = "length" value=${udata.length} >  <br/>
            Функция выгрузки<input type = "text" name = "tableNm" value=${udata.tableNm} >  <br/>
            Выгружаемое поле<input type = "text" name = "columnNm" value=${udata.columnNm} >  <br/>
            Тип элемента<select id ="columntype"></select> <br/>
            Элемент-родитель<input type = "text" name = "dbTableNm" value=${udata.dbTableNm}>  <br/>
            <input type="submit" value="Сохранить" />
        </form>
    </fieldset>
</div>
</body>
</html>