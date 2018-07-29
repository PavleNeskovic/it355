<%-- 
    Document   : view
    Created on : May 30, 2018, 6:42:24 PM
    Author     : Neskovic
--%>
<jsp:include page="../common/header.jsp"/>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <h2>Appointment details</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Created</th>
            <th>Last Modified</th>
        </tr>
        </thead>

        <c:forEach var="appointment" items="${appointments}">

            <tr>
                <td>
                        ${appointment.name}
                </td>
                <td>
                        ${appointment.description}
                </td>
                <td>
                    <button class="btn"
                            onclick="location.href='/appointment/${appointment.id}/update'">Update
                    </button>
                </td>
                <td>
                    <button class="btn btn-danger"
                            onclick="location.href='/appointment/${appointment.id}/delete'">Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>

    <button class="btn"
            onclick="location.href='/appointment/create'">Create
    </button>

</div>

<jsp:include page="../common/footer.jsp"/>
<jsp:include page="../common/datatables.jsp" />