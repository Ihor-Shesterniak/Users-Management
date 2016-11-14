<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:import url="layout.jsp" charEncoding="UTF-8">
    <c:param name="title" value="Edit User"/>
    <c:param name="body">
        <div class="container table-responsive text-info" role="main">
            <h2>Edit User</h2>
            <form:form method="POST" commandName="user" action="${pageContext.request.contextPath}/edit/${user.id}">
                <div class="form-group text-success">
                    <label for="firstName">First name:</label>
                    <form:input path="firstName" class="form-control"/>
                    <form:errors path="firstName" cssStyle="color: red;"/>
                </div>
                <div class="form-group text-success">
                    <label for="lastName">Last name:</label>
                    <form:input path="lastName" class="form-control"/>
                    <form:errors path="lastName" cssStyle="color: red;"/>
                </div>
                <div class="form-group text-success">
                    <label for="age">Age:</label>
                    <form:input path="age" class="form-control"/>
                    <form:errors path="age" cssStyle="color: red;"/>
                </div>

                <c:set var="admin" value="yes,no" scope="application"/>
                <div class="form-group text-success">
                    <label for="admin">Admin:</label>
                    <select name="admin" class="form-control">
                        <c:forEach items="${fn:split(admin, ',')}" var="admin">
                            <option value="${admin}">${admin}</option>
                        </c:forEach>
                    </select>
                    <form:errors path="admin" cssStyle="color: red;"/>
                </div>
                <button type="submit" class="btn btn-default">Update</button>
            </form:form>
        </div>
    </c:param>
</c:import>