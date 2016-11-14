<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/WEB-INF/views/layout.jsp" charEncoding="UTF-8">
    <c:param name="title" value="New User"/>
    <c:param name="body">
        <div class="container table-responsive text-info" role="main">
            <h2>
                Welcome
            </h2>
            <h4>The time on the server is ${serverTime}</h4>
        </div>
    </c:param>
</c:import>