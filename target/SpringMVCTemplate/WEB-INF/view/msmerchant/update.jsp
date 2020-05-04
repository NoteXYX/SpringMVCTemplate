<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商家更新</title>
</head>
<body>
<form action="update" method="post">
    <input name="id" value="${msmerchant.id}" type="hidden">
    商家姓名:<input name="merchantname" value="${msmerchant.merchantname}"></br>
    商家店铺名称:<input name="merchantshopname" value="${msmerchant.merchantshopname}"></br>
    商家账号:<input name="merchantaccount" value="${msmerchant.merchantaccount}"></br>
    商家密码:<input name="merchantpassword" value="${msmerchant.merchantpassword}"></br>
    商家经营范围:<input name="merchantscope" value="${msmerchant.merchantscope}"></br>
    <input type="button" value="提交" onclick="submit(this)">
</form>
</body>
<script type="text/javascript">
    function submit(obj) {
        obj.parent.submit();
    }
</script>
</html>
