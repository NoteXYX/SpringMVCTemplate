<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户查询</title>
</head>
<body>
<form action="add" method="post">
    用户姓名:${msuser.username}</br>
    用户账号:${msuser.useraccount}</br>
    用户密码:${msuser.userpassword}</br>
    用户性别:${msuser.usersex}</br>
    用户年龄:${msuser.userage}</br>
    用户地址:${msuser.useraddress}</br>
    用户邮箱:${msuser.useremail}</br>
</form>
</body>
<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
