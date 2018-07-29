<%--
    Document   : view
    Created on : May 30, 2018, 6:42:24 PM
    Author     : Neskovic
--%>
<jsp:include page="../common/header.jsp"/>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <h2>Services details</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Created</th>
            <th>Last Modified</th>
        </tr>
        </thead>

        <c:forEach var="dentalService" items="${dentalServices}">

            <tr>
                <td>
                        ${dentalService.name}
                </td>
                <td>
                        ${dentalService.description}
                </td>
                <td>
                    <button class="btn"
                            onclick="location.href='/dentalService/${dentalService.id}/update'">Update
                    </button>
                </td>
                <td>
                    <button class="btn btn-danger"
                            onclick="location.href='/dentalService/${dentalService.id}/delete'">Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>

    <button class="btn"
            onclick="location.href='/dentalService/create'">Create
    </button>

</div>

<jsp:include page="../common/footer.jsp"/>
<jsp:include page="../common/datatables.jsp" />