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
    <title>Города</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
    <style>
        .scroll-table {
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
<h3>ГОРОДА</h3>
<div class="scroll-table">
    <header>
        <table class="table table-bordered table-hover horizontal-align">
            <tr>
                <th hidden>ID</thhidden>
                <th style="width: 30%">Регион</th>
                <th style="width: 60%">ФИАС</th>
                <th style="width: 10%">Изменить</th>
            </tr>
        <#list cities as city>
            <tr>
                <td hidden>${city.id}</td>
                <td><a href="cities/${city.id}"> ${city.name}</td>
                <td>${city.guid}</td>
                <td><input type="button" onclick="but1()" value="Изменить"></td>

            </tr>
        </#list>
        </table>
    </header>
</div>
</body>
</html>