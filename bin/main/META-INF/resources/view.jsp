<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="register.caption"/></b>
</p>

<portlet:renderURL var="createFormRender">
	<portlet:param name="mvcRenderCommandName" value="/create/form"/>
</portlet:renderURL>


<a href="${createFormRender}" >Registration</a>