<jsp:include page="../common/header.jsp"/>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<div class="container">
    <h2>Enter Dental Service Info</h2>
    <form:form method="POST" action="/dentalService">
        <form:hidden path="id" />
        <spring:bind path="name">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="control-label">Room Display Name</label>
                <div>
                    <form:input path="name" type="text" class="form-control"
                                id="name" placeholder="Name" />
                    <form:errors path="name" class="control-label" />
                </div>
            </div>
        </spring:bind>

        <spring:bind path="description">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <label class="control-label">Room Display Name</label>
                <div>
                    <form:input path="description" type="text" class="form-control"
                                id="description" placeholder="Description" />
                    <form:errors path="description" class="control-label" />
                </div>
            </div>
        </spring:bind>
        <button type="submit" class="btn-lg btn-primary pull-right">Add
        </button>
    </form:form>
</div>
<jsp:include page="../common/footer.jsp"/>