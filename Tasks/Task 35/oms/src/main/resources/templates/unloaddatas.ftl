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
    function getDists() {
        $.ajax({
            type: "GET",
            url: "/udatatypes",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function(response){
                let resultPlace = document.getElementById('datatype');
                let resultString ='';
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
                let resultString ='';
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
    function show_popap(id_popap) {
        var id = "#" + id_popap;
        $(id).addClass('active');
    }

    $(".close_popap").click( function(){
        $(".overlay").removeClass("active");
    });
</script>
<body onload="getDists();">
<h3>ЭЛЕМЕНТЫ/АТРИБУТЫ В ФАЙЛЕ ИНФОРМАЦИОННОГО ВЗАИМОДЕЙСТВИЯ</h3>
<div id="unload_data_table" class="scroll-table" height="400px" width="70%">
    <table id="data" class="table">
        <tr>
            <th>Файл</th>
            <th>Порядок</th>
            <th>Элемент-родитель</th>
            <th>Название</th>
            <th  hidden>Ид</th>
            <th style="width: 5%">Edit</th>
            <th style="width: 5%">Delete</th>
    </tr>
    <#list udatas as udatas>
        <tr>
            <td>${udatas.getUnloadFile().title}</td>
            <td>${udatas.orderNum}</td>
            <td>${udatas.dbTableNm!""}</td>
            <td><a href="unloaddatas/${udatas.id}"> ${udatas.name}</td>
            <td hidden>${udatas.id}</td>
            <td><a href="unloaddatas/${udatas.id}"> &#9997;</td>
            <td><a href="unloaddatas/${udatas.id}"> &#10006;</td>

        </tr>
    </#list>
</table>
</div>
</body>
</html>