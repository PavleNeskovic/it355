
<jsp:include page="common/header.jsp" />

<spring:url value="resources/style/homepage.css"
            var="homepageCss" />
<link href="${homepageCss}" rel="stylesheet" />
<style>

    header.masthead {
        padding-top: 10rem;
        padding-bottom: calc(10rem - 56px);
        background-image: url("http://www.libertycenterdentalcare.com/wp-content/uploads/2016/09/VANAD_Enovation_ZorgMail-2.jpeg");
        background-position: center center;
        -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
        background-size: cover;
    }
</style>
<header class="masthead text-center text-white d-flex">
    <div class="container my-auto jumbotron">
        <div class="row">
            <div class="col-lg-10 mx-auto">
                <h1 class="text-uppercase">
                    <strong>Dentist Administrator Portal</strong>
                </h1>
                <h3 class="text-uppercase">
                    <strong>Manage your services easily</strong>
                </h3>
                <hr>
            </div>
            <div class="col-lg-8 mx-auto">
                <p style="color: #2FA4E7" class="mb-5">This administrator portal provides you the easiest way to securely manage dental services for your ordination. Make an appointment or create new service in no time!</p>
                <a class="btn btn-primary btn-xl js-scroll-trigger" href="/appointment">Create an appointment</a>
            </div>
        </div>
    </div>
</header>

<jsp:include page="common/footer.jsp" />