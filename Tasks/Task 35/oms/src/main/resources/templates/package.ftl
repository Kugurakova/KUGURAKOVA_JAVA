<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        .overflow {
            overflow: scroll;
            width: 50%;
            height: 300px;
            border: 1px solid black;
        }
        .table > tbody > tr > th {background-color: darkgray;}
        .table > tbody > tr:nth-child(2n) {background-color: lightgrey;}
        .table > tbody > tr:hover{background:#6598C7; color:#fff; outline:0;}
        .table > tbody > tr.tr_3:hover{background:#6598C7; color:#fff; outline:0;}
    </style>
</head>
<body>
<script src="alert.js"></script>
<div>
<h3>ПАКЕТЫ ИНФОРМАЦИОННОГО ВЗАИМОДЕЙСТВИЯ</h3>
<table class="table">
            <tr>
                <th>Город</th>
                <th>Наименование</th>
                <th>Нач.символы имени</th>
                <th>Тип пакета</th>
                <th>Команда для архивирования</th>
                <th>разахивирования</th>
                <th>Формат архива</th>
                <th>Дата начала действия</th>
                <th>Дата окончания действия</th>
                <th>Действия</th>
            </tr>
        <#list packages as packages>
            <tr>
                <td>${packages.getCity().name}</td>
                <td>${packages.name}</td>
                <td>${packages.code}</td>
                <td>${packages.getUnloadPackageType().name}</td>
                <td>${packages.zipCommand}</td>
                <td>${packages.unzipCommand}</td>
                <td>${packages.archiveFormat}</td>
                <td>${packages.startDate!""}</td>
                <td>${packages.endDate!""}</td>
                <td><input type="submit" value="Изменить"</td>
            </tr>
        </#list>
</table>
</div>
<div>
    <form >
        Наименование: <input type = "text"  name = "name" width="300"> <br>
        Нач.символы имени: <input type = "text" name = "code"  width="100">
        Тип пакета: <input type = "text" name = "unload_package_type_id" width="200"> <br>
        Команда для архивирования: <input type = "text" name = "zip_command">
        разахивирования: <input type = "text" name = "unzip_command">
        Формат архива: <input type = "text" name = "archive_format"> <br>
        <input type="submit" value="Найти">
    </form>
</div>
<div>
    <h3>ФАЙЛЫ ИНФОРМАЦИОННОГО ВЗАИМОДЕЙСТВИЯ</h3>
    <table class="table">
            <tr>
                <th>Пакет</th>
                <th>Наименование</th>
                <th>Нач.символы имени файла</th>
                <th>Название файла</th>
                <th>Основной файл</th>
                <th>Тип файла</th>
                <th>Кодовая страница</th>
                <th>Версия</th>
            </tr>
        <#list files as files>
            <tr>
                <td>${files.getUnloadPackage().name}</td>
                <td>${files.title}</td>
                <td>${files.code}</td>
                <td>${files.name}</td>
                <td><#if files.flMain>Да<#else>Нет</#if></td>
                <td>${files.fileType}</td>
                <td>${files.codePage}</td>
                <td>${files.version}</td>
            </tr>
        </#list>
    </table>
</div>
<h3>ЭЛЕМЕНТЫ/АТРИБУТЫ В ФАЙЛЕ ИНФОРМАЦИОННОГО ВЗАИМОДЕЙСТВИЯ</h3>
<div id="unload_data_table" class="overflow">
    <table class="table">
        <tr>
            <th>Файл</th>
            <th>Порядок</th>
            <th>Элемент-родитель</th>
            <th>Название</th>
            <th>Ид</th>
        </tr>
    <#list udata as udata>
        <tr>
            <td>${udata.getUnloadFile().title}</td>
            <td>${udata.orderNum}</td>
            <td>${udata.dbTableNm!""}</td>
            <td>${udata.name}</td>
            <td>${udata.id}</td>
        </tr>
    </#list>
    </table>
</div>

</body>
</html>