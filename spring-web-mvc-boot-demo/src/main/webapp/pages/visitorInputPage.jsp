

<jsp:include page="/header" />
<section style="padding:10px; min-height:400px;">

<h3>Visitor registration</h3>
<form method="post">

<label>Name:
	<input type="text" name="firstName" required />
	<input type="text" name="secondName" required/>
</label>
<label>DateOfBirth <input type="date" name="dateOfBirth" required /></label>
<br>
<button>Register</button>
</form>


</section>
<jsp:include page="/footer" />