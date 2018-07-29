<%--
  Created by IntelliJ IDEA.
  User: Neskovic
  Date: 26.12.2017.
  Time: 23.13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link href="/resources/datatables/jquery.dataTables.min.css" rel="stylesheet" />
<%--<script--%>
        <%--src="${pageContext.request.contextPath}/scripts/jquery/jquery-1.11.0.min.js"--%>
        <%--type="text/javascript"></script>--%>
<script
        src="/resources/datatables/jquery.dataTables.min.js"
        type="text/javascript">
</script>
<script>
    $(document).ready(function() {
        $('.table').DataTable({
            //TODO Should exclude column 'Options' from search, but it's not working, see: http://legacy.datatables.net/usage/columns
            aoColumnDefs: [
                { bSearchable: false, aTargets: [ "Options" ] }
            ],
            //Dropdown values of how many entries should be on the page
            aLengthMenu: [
                [5, 20, 50, 100, -1],
                [5, 20, 50, 100, "All"]
            ],
            iDisplayLength: -1
        });
    } );
</script>