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
<body  onload="getDists();">
<div>
    <fieldset>
        <legend>ЭЛЕМЕНТ</legend>
        <form name="unloaddata" action="" method="POST">
            Порядковый номер <input type="number" name = "orderNum" value= "${unloaddata.orderNum}" >  <br/>
            Название элемента.атрибута <input type = "text" name = "name" value=  ${unloaddata.name} >  <br/>
            Наименование элемента.атрибута <input type = "text" name = "description" value=${unloaddata.description} >  <br/>

            Тип данных<select id ="datatype"> </select>  <br/>

            Длина<input type = "text" name = "length" value=${unloaddata.length} >  <br/>
            Функция выгрузки<input type = "text" name = "tableNm" value=${unloaddata.tableNm} >  <br/>
            Выгружаемое поле<input type = "text" name = "columnNm" value=${unloaddata.columnNm} >  <br/>
    </fieldset>
</div>
</body>
</html>