<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" href="/minishop/common/css/lavalamp_test.css" type="text/css" media="screen">
<script type="text/javascript" src="/minishop/common/js/jquery-1.2.3.min.js"></script>
<script type="text/javascript" src="/minishop/common/js/jquery.easing.min.js"></script>
<script type="text/javascript" src="/minishop/common/js/jquery.lavalamp.min.js"></script>
<script type="text/javascript">
    $(function() {
        $("#menu").lavaLamp({
            fx: "backout",
            speed: 700
		});
    });
</script>

<title>�ڹٳ��� ���θ�</title>

</head>
<body>
	<div style="width:80%; margin:auto;">
		<h1 style="float: left;">�ڹٳ��� ���θ�</h1>

		<div>
			<h5 style="float: right; margin-left: 10px">
			<a href="/minishop/weather.do?pathurl=../openapi/weather.jsp">������ ����</a></h5>
			<h5 style="float: right; margin-left: 10px">
			<a href="#">�Խ���</a></h5>
			<h5 style="float: right; margin-left: 10px">e-book</h5>
			
					
			<h5 style="float: right; margin-left: 10px">
				��</h5>
			<h5 style="float: right; margin-left: 10px">
				<a href="#">�α׾ƿ�</a></h5>
			
		
			
			<h5 style="float: right; margin-left: 10px">
				<a href="#">ȸ������</a></h5>
		
			<h5 style="float: right; margin-left: 10px">
				<a href="#">�α���</a></h5>
		
		</div>
		<div style="clear:both;">
			<ul class="lavaLampNoImage" id="menu">
				<li class="current">
				<a href="index.jsp">Home</a></li>
				<li><a href="/minishop/prdlist.do?category=CAT000000001&pathurl=../product/prdlist.jsp">DRESS</a></li>
				<li><a href="/minishop/prdlist.do?category=CAT000000002&pathurl=../product/prdlist.jsp">TOP</a></li>
				<li><a href="/minishop/prdlist.do?category=CAT000000003&pathurl=../product/prdlist.jsp">BOTTOM</a></li>
				<li><a href="/minishop/prdlist.do?category=CAT000000004&pathurl=../product/prdlist.jsp">OUTER</a></li>
				<li><a href="/minishop/prdlist.do?category=CAT000000005&pathurl=../product/prdlist.jsp">ACC</a></li>
				<li><a href="/minishop/prdlist.do?category=CAT000000006&pathurl=../product/prdlist.jsp">CARDIGAN</a></li>
			</ul>
		</div>
	</div>
</body>
</html>