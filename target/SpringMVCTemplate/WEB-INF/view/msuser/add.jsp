<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户添加</title>
</head>
<body>
<form action="add" method="post">
    用户姓名:<input name="username"></br>
    用户账号<input name="useraccount"></br>
    用户密码:<input name="userpassword"></br>
    用户性别:<input name="usersex"></br>
    用户年龄:<input name="userage"></br>
    用户地址:<input name="useraddress"></br>
    用户邮箱:<input name="useremail"></br>
    <input type="button" value="提交" onclick="submit(this)">
</form>
</body>
<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
