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
    <title>ЭЛЕМЕНТ</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
</head>
<script>

</script>
<body>
<h3>ЭЛЕМЕНТЫ/АТРИБУТЫ В ФАЙЛЕ ИНФОРМАЦИОННОГО ВЗАИМОДЕЙСТВИЯ</h3>
<div id="unload_data_table" class="scroll-table" height="400px" width="70%">
    <table id="data" class="table">
        <tr>
            <th>Файл</th>
            <th>Порядок</th>
            <th>Элемент-родитель</th>
            <th>Название</th>
            <th hidden>Ид</th>
            <th style="width: 5%">Edit</th>
            <th style="width: 5%">Delete</th>
    </tr>
    <#list unloaddatas as unloaddata>
        <tr></tr>
            <td>${unloaddata.getUnloadFile().title}</td>
            <td>${unloaddata.orderNum}</td>
            <td>${unloaddata.dbTableNm!""}</td>
            <td><a href="unloaddatas/${unloaddata.id?string.computer}"> ${unloaddata.name}</td>
            <td hidden>${unloaddata.id?string.computer}</td>
            <td><a href="unloaddatas/${unloaddata.id}"> &#9997;</td>
            <td><a href="unloaddatas/delete/${unloaddata.id}"> &#10006; </td>


    </#list>
</table>
</div>
</body>
</html>