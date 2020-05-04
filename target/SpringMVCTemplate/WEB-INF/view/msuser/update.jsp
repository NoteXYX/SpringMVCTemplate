<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户更新</title>
</head>
<body>
<form action="update" method="post">
    <input name="id" value="${msuser.id}" type="hidden">
    用户姓名:<input name="username" value="${msuser.username}"></br>
    用户账号:<input name="useraccount" value="${msuser.useraccount}"></br>
    用户密码:<input name="userpassword" value="${msuser.userpassword}"></br>
    用户性别:<input name="usersex" value="${msuser.usersex}"></br>
    用户年龄:<input name="userage" value="${msuser.userage}"></br>
    用户地址:<input name="useraddress" value="${msuser.useraddress}"></br>
    用户邮箱:<input name="useremail" value="${msuser.useremail}"></br>
    <input type="button" value="提交" onclick="submit(this)">
</form>
</body>
<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
