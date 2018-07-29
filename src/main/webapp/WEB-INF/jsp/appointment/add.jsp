
<jsp:include page="../common/header.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<div class="container">
    <h2>Enter Appointment Info</h2>
    <form:form method="POST" action="/appointment">
        <form:hidden path="id" />
        <spring:bind path="name">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="control-label">Patient Full Name:</label>
                <div>
                    <form:input path="name" type="text" class="form-control"
                                id="name" placeholder="Name" />
                    <form:errors path="name" class="control-label" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="date">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="control-label">Patient Telephone Number:</label>
                <div>
                    <form:input path="telephone" type="text" class="form-control"
                                id="telephone" placeholder="Telephone" />
                    <form:errors path="telephone" class="control-label" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="telephone">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="control-label">Time Of Appointment:</label>
                <div>
                    <form:input path="date" type="text" class="form-control"
                                id="date" placeholder="Time" />
                    <form:errors path="date" class="control-label" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="cause">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="control-label">Cause/Reason of Appointment:</label>
                <div>
                    <form:input path="cause" type="text" class="form-control"
                                id="cause" placeholder="Reason" />
                    <form:errors path="cause" class="control-label" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="emergency">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="control-label">Is It An Emergency?</label>
                <form:select path="emergency" class="form-control">
                    <form:option value="0" label="NO" />
                    <form:option value="1" label="YES" />
                </form:select>
                    <%--<form:errors path="apartment" class="control-label" />--%>
            </div>
        </spring:bind>

        <spring:bind path="delivery">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="control-label">Contact And Delivery By:</label>
                <form:select path="delivery" class="form-control">
                    <form:option value="0" label="Telephone" />
                    <form:option value="1" label="Mail" />
                    <form:option value="2" label="Both" />
                </form:select>
                    <%--<form:errors path="apartment" class="control-label" />--%>
            </div>
        </spring:bind>
        <button type="submit" class="btn-lg btn-primary pull-right">Add
        </button>
    </form:form>
</div>

<jsp:include page="../common/footer.jsp"/>