<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="${f:url('/css/global.css')}"/>
</head>
<body>

<html:errors/>

<s:form>
        <html:hidden property="id" />
        <html:hidden property="versionNo" />
<table class="tablebg">
	<tr>
		<td> deptNo </td>
		<td>
		    <html:text property="deptNo" />
		</td>	
	</tr>
	<tr>
		<td> deptName </td>
		<td>
		    <html:text property="deptName" />
		</td>	
	</tr>
	<tr>
		<td> loc </td>
		<td>
		    <html:text property="loc" />
		</td>	
	</tr>

</table>

<input type="submit" name="update" value="UPDATE" />
</s:form>
<br/><br/>

<s:link href="/dept/">list page</s:link>

</body>
</html>