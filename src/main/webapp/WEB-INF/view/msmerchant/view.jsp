<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商家查询</title>
</head>
<body>
<form action="add" method="post">
    商家姓名:${msmerchant.merchantname}</br>
    商家店铺名称:${msmerchant.merchantshopname}</br>
    商家账号:${msmerchant.merchantaccount}</br>
    商家密码:${msmerchant.merchantpassword}</br>
    商家经营范围:${msmerchant.merchantscope}</br>
</form>
</body>
<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
