<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商家添加</title>
</head>
<body>
<form action="add" method="post">
    商家姓名:<input name="merchantname"></br>
    商家店铺名称:<input name="merchantshopname"></br>
    商家账号:<input name="merchantaccount"></br>
    商家密码:<input name="merchantpassword"></br>
    商家经营范围:<input name="merchantscope"></br>
    <input type="button" value="提交" onclick="submit(this)">
</form>
</body>
<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
