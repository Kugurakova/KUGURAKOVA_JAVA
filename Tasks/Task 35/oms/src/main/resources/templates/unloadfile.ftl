<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<div>
    <h1>Привет!</h1>
    <h2>ПАКЕТЫ ИНФОРМАЦИОННОГО ВЗАИМОДЕЙСТВИЯ</h2>
    <h3>ПАКЕТЫ ИНФОРМАЦИОННОГО ВЗАИМОДЕЙСТВИЯ</h3>
    <table cellpadding="2" border="0">
    <#list files as files>
        <tr bgcolor=#d3d3d3 align="center">
            <td>${files.getUnload_package().name}</td>
            <td>${files.title}</td>
            <td>${files.code}</td>
            <td>${files.name}</td>
            <td>${files.id}</td>
            <td><#if files.fl_main>Да<#else>Нет</#if></td>
            <td>${files.file_type}</td>
            <td>${files.code_page}</td>
            <td>${files.version}</td>

        </tr>
    </#list>
    </table>
</div>
<div>
    <form >
        Наименование пакета: <input type = "text"  name = "name" width="300"> <br>
        Нач.символы имени пакета: <input type = "text" name = "code"  width="100">
        Тип пакета: <input type = "text" name = "unload_package_type_id" width="200"> <br>
        Команда для архивирования: <input type = "text" name = "zip_command">
        разахивирования: <input type = "text" name = "unzip_command">
        Формат архива: <input type = "text" name = "archive_format"> <br>
        <input type="submit" value="Найти">
    </form>
</div>
</body>
</html>