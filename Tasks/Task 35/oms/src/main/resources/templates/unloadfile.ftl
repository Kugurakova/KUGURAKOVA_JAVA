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
    <title>ФАЙЛ</title>
</head>
<body>
<div>
    <fieldset>
        <legend>ФАЙЛ</legend>
        <form name="unloadfile" action="" method="POST">
            <table>
                <tr><td>Наименование файла</td>
                    <td><input type="text" name="title" size="50" value="${unloadfile.title!""}"></td></tr>
                <tr><td>Нач.символы имени файла</td>
                    <td><input type="text" name="code" value="${unloadfile.code!""}"></td></tr>
                <tr><td>Название файла</td>
                    <td><input type="text" name="name" value="${unloadfile.name!""}"></td></tr>
                <tr><td>Тип файла</td>
                    <td><input type="text" name="fileType" value="${unloadfile.fileType!""}"></td></tr>
                <tr><td>Основной файл</td>
                    <td>
                        <input type = "radio" name = "flMain" <#if unloadfile.flMain> checked <#else> </#if> value="true" > Да
                        <input type = "radio" name = "flMain" <#if unloadfile.flMain> <#else> checked </#if> value="false"> Нет
                    </td></tr>
                <tr><td>Кодовая страница</td>
                    <td><input type="text" name="codePage" value="${unloadfile.codePage!""}"></td></tr>
                <tr><td>Версия</td>
                    <td><input type="text" name="version" value="${unloadfile.version!""}"></td></tr>
                <tr><td><input hidden type="number" name = "unloadPackage" value= "${unloadfile.getUnloadPackage().id}" ></td>
                    <td><input type="submit" value="Сохранить" /></td>
                </tr>
            </table>
        </form>
</div>
</body>
</html>