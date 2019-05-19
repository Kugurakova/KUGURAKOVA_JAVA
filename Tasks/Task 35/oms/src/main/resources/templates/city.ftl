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
    <title>Регион</title>
    <link rel="stylesheet"
          type="text/css"
          href="<@spring.url '/css/style.css'/>"/>
</head>
<body>
<div>
    <fieldset>
        <legend>Регион</legend>
        <form name="city" action="" method="POST">
            Регион:<input type = "text" name="name" value= ${city.name} >    <br/>
            <label>ФИАС:</label><input type = "text" name="guid" value= ${city.guid} >    <br/>
            <input type="submit" value="Сохранить" />
        </form>
    </fieldset>
</div>
</body>
</html>