<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
<html><body>
<h1>PTS Login Page</h1>
<h2>User Register Form</h2>

<html:form action="/RegSubmit">
<table>
<tr>
<td><h1>Name</h1></td>
<td><html:text property="name"/></td>
<td><html:errors property="name"/></td>
</tr>
<tr>
<td><h1>Mobile No</h1></td>
<td><html:text property="mobile"/></td>
<td><html:errors property="mobile"/></td>
</tr>
<tr>
<td><h1>Address:</h1></td>
<td><html:text property="address"/></td>
<td><html:errors property="address"/></td>
</tr>
<tr>
<td><h1>PIN Cod</h1></td>
<td><html:text property="pin"/></td>
<td><html:errors property="pin"/></td>
</tr>
<tr>
<td align="center" colspan="3">
<html:submit value="Register"/>
</tr> 
</table>
</html:form>
</body></html>