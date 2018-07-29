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
            <th>Full Name</th>
            <th>Telephone</th>
            <th>Date</th>
            <th>Cause</th>
            <th>Emergency</th>
            <th>Contact</th>
            <th>Actions</th>
        </tr>
        </thead>

        <c:forEach var="appointment" items="${appointments}">

            <tr>
                <td>
                        ${appointment.name}
                </td>
                <td>
                        ${appointment.telephone}
                </td>
                <td>
                        ${appointment.date}
                </td>
                <td>
                        ${appointment.cause}
                </td>
                <td>
                        ${appointment.emergency}
                </td>
                <td>
                        ${appointment.delivery}
                </td>
                <td>
                    <div class="btn-group">
                        <button class="btn"
                                onclick="location.href='/appointment/${appointment.id}/update'">Update
                        </button>
                        <button class="btn btn-danger"
                                onclick="location.href='/appointment/${appointment.id}/delete'">Delete
                        </button>
                    </div>
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