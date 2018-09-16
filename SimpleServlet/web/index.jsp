<html>
<body>
<h1>Simple Servlet</h1>

<form action = "simple" method = "GET">
    <fieldset>
        <legend>Please Select Which Col To Search</legend>
        <input type = "radio" name = "column" value="ACCTNUM"/>Account<br>
        <input type = "radio" name = "column" value="LNAME"/>Last Name<br>
        <input type = "radio" name = "column" value="FNAME"/>First Name<br>
        <input type = "radio" name = "column" value="EMAIL"/>Email<br>
        <input type = "radio" name = "column" value="IPADDR"/>IP Address<br>
    </fieldset>
    Input Value: <input type = "text" name = "value">

    <input type = "submit" value = "Submit" />
</form>
</body>
</html>

