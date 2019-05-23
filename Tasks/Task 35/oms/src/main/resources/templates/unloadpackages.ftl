<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        .overflow1 {
            overflow: scroll;
            width: 100%;
            height: 150px;
            border: 1px solid black;
        }
        .overflow2 {
            overflow: scroll;
            width: 100%;
            height: 150px;
            border: 1px solid black;
        }
        .overflow3 {
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
<h3>ПАКЕТЫ ИНФОРМАЦИОННОГО ВЗАИМОДЕЙСТВИЯ</h3>
<div class="overflow1">
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
                <td><a href="unloadpackages/${packages.id?string.computer}"> ${packages.name}</td>
                <td>${packages.code!""}</td>
                <td>${packages.getUnloadPackageType().name}</td>
                <td>${packages.zipCommand!""}</td>
                <td>${packages.unzipCommand!""}</td>
                <td>${packages.archiveFormat!""}</td>
                <td>${packages.startDate!""}</td>
                <td>${packages.endDate!""}</td>
                <td><input type="submit" value="Копировать"</td>
            </tr>
        </#list>
</table>
</div>
<h3>ФАЙЛЫ ИНФОРМАЦИОННОГО ВЗАИМОДЕЙСТВИЯ</h3>
<div id="unload_file_table" class="overflow2">
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
                <td><a href="unloadfiles/${files.id?string.computer}"> ${files.title}</td>
                <td>${files.code!""}</td>
                <td>${files.name!""}</td>
                <td><#if files.flMain>Да<#else>Нет</#if></td>
                <td>${files.fileType!""}</td>
                <td>${files.codePage!""}</td>
                <td>${files.version!""}</td>
            </tr>
        </#list>
    </table>
</div>
<h3>ЭЛЕМЕНТЫ/АТРИБУТЫ В ФАЙЛЕ ИНФОРМАЦИОННОГО ВЗАИМОДЕЙСТВИЯ</h3>
<div id="unload_data_table" class="overflow3">
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
            <td><a href="unloaddatas/${udata.id?string.computer}"> ${udata.name}</td>
            <td>${udata.id?string.computer}</td>
        </tr>
    </#list>
    </table>
</div>

</body>
</html>