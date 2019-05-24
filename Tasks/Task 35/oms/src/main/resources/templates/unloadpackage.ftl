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
    <title>ПАКЕТ</title>
</head>
<body>
<div>
    <fieldset>
        <legend>ПАКЕТ</legend>
        <form name="unloadpackage" action="" method="POST">
            <table>
                <tr><td>Наименование</td><td><input type = "text" name = "name" size="60" value="${unloadpackage.name}" ></td></tr>
                <tr><td>Тип пакета</td>
                    <td><select name ="unloadPackageType">
                        <option> </option>
                            <#list packagetypes as packagetype>
                                <option value=${packagetype.getId()}
                                <#if !(unloadpackage.unloadPackageType??) ><#elseif unloadpackage.getUnloadPackageType().getId() == packagetype.getId() > selected </#if>  >
                                    ${packagetype.getName()} </option>
                            </#list>
                    </select></td></tr>
                <tr><td>Нач.символы имени</td><td><input type = "text" name = "code"  value="${unloadpackage.code}" ></td></tr>
                <tr><td>Команда для архивирования</td><td><input type = "text" name = "zip_command" value="${unloadpackage.zipCommand}"></td></tr>
                <tr><td>разахивирования</td><td><input type = "text" name = "unzipCommand" value="${unloadpackage.unzipCommand}"></td></tr>
                <tr><td>Формат архива</td><td><input type = "text" name = "archiveFormat" value="${unloadpackage.archiveFormat}"></td></tr>
                <tr><td>Дата начало</td><td><input type = "datetime-local" name = "startDate" size="20" value=${unloadpackage.startDate}></td></tr>
                <tr><td>Дата окончания</td><td><input type = "datetime-local" name = "endDate" size="20" value=${unloadpackage.endDate!""}></td></tr>
                <tr><td></td><td><input type="submit" value="Сохранить"></td></tr>
        </form>
</div>
</body>
</html>