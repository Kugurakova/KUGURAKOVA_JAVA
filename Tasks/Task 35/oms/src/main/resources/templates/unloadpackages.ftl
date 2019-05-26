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
    <title>ПАКЕТЫ</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
</head>
<script>
    function delData(dataId) {
        alert(dataId);
    }

    function copyPackage(packageid) {
        let json = {"id": packageid};
        $.ajax({
            type: "POST"
            url: "unloadpackages/copy/",
            data: JSON.stringify(json),
            dataType: "json",
            success: function (response) {}
            failure: function (errMsg) {
                alert(errMsg);
            }
        });
    }

    function copyData(dataid) {
        let did = {"id": dataid};
        $.ajax({
            type: "POST"
            url: "/unloaddatas/copy/",
            data: JSON.stringify(did),
            dataType: "json",
            success: function (response) {}
            failure: function (errMsg) {
                alert(errMsg);
            }
        });
    }

</script>
<body>
<h3>ПАКЕТЫ ИНФОРМАЦИОННОГО ВЗАИМОДЕЙСТВИЯ</h3>
<div class="overflow1">
    <table class="table">
            <tr>
                <th>Город</th>
                <th>Наименование</th>
                <th>Нач.символы имени</th>
                <th>Тип пакета</th>
                <th hidden>Команда для архивирования</th>
                <th hidden>разахивирования</th>
                <th hidden>Формат архива</th>
                <th>Дата начала действия</th>
                <th hidden>Дата окончания действия</th>
                <th>Действия</th>
            </tr>
        <#list packages as packages>
            <tr>
                <td>${packages.getCity().name}</td>
                <td><a href="unloadpackages/${packages.id?string.computer}"> ${packages.name}</td>
                <td>${packages.code}</td>
                <td>${packages.getUnloadPackageType().name}</td>
                <td hidden>${packages.zipCommand!""}</td>
                <td hidden>${packages.unzipCommand!""}</td>
                <td hidden>${packages.archiveFormat!""}</td>
                <td>${packages.startDate!""}</td>
                <td hidden>${packages.endDate!""}</td>
                <td><input type="submit" value="Копировать" onclick="copyPackage(${packages.id})"></td>
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
<div id="unload_data_table" class="overflow3">
    <table class="table">
        <tr>
            <th>Файл</th>
            <th>Порядок</th>
            <th>Родитель</th>
            <th>Элемент</th>
            <th>Копировать</th>
            <th>Удалить</th>
            <th hidden>Ид</th>
        </tr>
    <#list udata as udata>
        <tr>
            <td>${udata.getUnloadFile().title}</td>
            <td>${udata.orderNum}</td>
            <td>${udata.dbTableNm!""}</td>
            <td><a href="unloaddatas/${udata.id?string.computer}"> ${udata.name}</td>
            <td><input type="submit" value="Копировать" onclick= copyData(${udata.id?string.computer}) ></td>
            <td><input type="submit" value="Удалить" onclick = "delData(${udata.id?string.computer})" ></td>
            <td hidden>${udata.id?string.computer}</td>
        </tr>
    </#list>
    </table>
</div>

</body>
</html>