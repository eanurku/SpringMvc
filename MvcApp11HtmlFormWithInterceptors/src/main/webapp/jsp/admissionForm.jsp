
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<title>
    admission form
</title>

<body>
<h1> Student Admission Form</h1>
<form:errors path="student.*" />
<form action="/MvcAppHtmlFormWithInterceptors/submitAdmissionForm.html" method="post">
<table>

<tr>
<td> Student name:</td>
<td> <input type="text" name="sname"/></td>
</tr>

<tr>
<td> student id:</td>
<td> <input type="text" name="sid"/> </td>
</tr>

<tr>
<td> student mobile no:</td>
<td> <input type="text" name="smobileno"/> </td>
</tr>

<tr>
<td> student dob:</td>
<td> <input type="text" name="sdob"/> </td>
</tr>

<tr>
<td> student skills:</td>
<td>
<select name="sskills" multiple>
<option value="java">java progg</option>
<option value="cpp">c plus plus</option>
<option value="php">php progg</option>
<option value="c">c progg </option>
</select>
 </td>
</tr>

<tr>
<td>student address :</td>
<td>country:</td> <td> <input type="text" name="saddress.country"/> </td>
<td>city:</td> <td> <input type="text" name="saddress.city"/> </td>
<td>street:</td> <td> <input type="text" name="saddress.street"/> </td>
<td>pin:</td> <td> <input type="text" name="saddress.pin"/> </td>
</tr>

<tr>
 <td> <input type="submit" value="submit by clicking here"/></td>
</tr>

</table>




</form>
</body>

</html>