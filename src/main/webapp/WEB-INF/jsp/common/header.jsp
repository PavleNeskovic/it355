<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
    <title>Dentist App</title>
    <spring:url value="/resources/bootstrap/bootstrap.min.css"
                var="bootstrapCss" />
    <link href="${bootstrapCss}" rel="stylesheet" />
</head>

<spring:url value="/" var="urlHome" />
<spring:url value="/appointment" var="appointment" />
<spring:url value="/dentalService" var="dentalService" />
<spring:url value="/v1/appointments" var="appointmentAPI" />
<spring:url value="/v1/dentalServices" var="dentalServiceAPI" />
<spring:url value="/appointment/create" var="appointmentCreate" />
<spring:url value="/dentalService/create" var="dentalServiceCreate" />
<spring:url value="/admin/room/add" var="urlRoomAdd" />
<spring:url value="/admin/microcontroller/add" var="urlMicrocontrollerAdd" />
<spring:url value="/admin/device/add" var="urlDeviceAdd" />
<spring:url value="/admin/irdevice/add" var="urlIRDeviceAdd" />
<spring:url value="/admin/ircode/add" var="urlIRCodeAdd" />
<spring:url value="/admin/settings/settings" var="urlSettingsAdd" />
<spring:url value="/admin/settings/manage" var="urlSettingsList" />

<spring:url value="/admin/logout" var="urlLogout" />

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <a class="navbar-brand" href="${urlHome}">Dentist</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarColor01">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="${urlHome}">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${appointment}">Appointments</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${dentalService}">Services</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">REST API</a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="${appointmentAPI}">GET /appointments</a>
                    <a class="dropdown-item" href="${dentalServiceAPI}">GET /dentalServices</a>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Create new</a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="${appointmentCreate}">Appointment</a>
                    <a class="dropdown-item" href="${dentalServiceCreate}">Service</a>
                </div>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Search">
            <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
