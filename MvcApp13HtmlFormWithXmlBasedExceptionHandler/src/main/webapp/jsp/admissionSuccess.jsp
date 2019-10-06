<html>

<body>
<h1>${headermsg}</h1>
admission form submitted successfully for student with details:

${student}

<table>

<tr>
<td>${student.sname}</td>
</tr>
<tr>
<td>student id: ${student.sid}</td>
</tr>
<tr>
<td>${student.smobileno}</td>
</tr>
<tr>
<td>${student.sdob}</td>
</tr>
<tr>
<td>student skills: ${student.sskills}</td>
</tr>
<tr>
<td>${student.saddress.country}</td>
</tr>
<tr>
<td>${student.saddress.city}</td>
</tr>

<tr>
<td>${student.saddress.street}</td>
</tr>

<tr>
<td>${student.saddress.pin}</td>
</tr>


</table>


</body>
</html>

