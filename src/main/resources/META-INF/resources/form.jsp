<%@ include file="/init.jsp" %>

<portlet:actionURL name="saveUser" var="saveUserURL" >

</portlet:actionURL>


<%-- <a href="${saveUserURL}" >Save</a> --%>

<h1>Please Register</h1>

<aui:form name="fm" action="${saveUserURL}">

	<aui:input name="FirstName"></aui:input>
	<aui:input name="LastName"></aui:input>
	<aui:input name="EmailAddress"></aui:input>
	<aui:input name="Username"></aui:input>
	<aui:input name="Male"></aui:input>
	<aui:input name="Birthday"></aui:input>
	<aui:input name="Password"></aui:input>
	<aui:input name="ConfirmPassword"></aui:input>
	
	<aui:button-row>
		<aui:button cssClass="btn btn-primary" type="submit" />
	</aui:button-row>
	
</aui:form>