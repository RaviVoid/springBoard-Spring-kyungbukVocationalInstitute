<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- JSP include -->
<%-- <%@ include file="../includes/header.jsp" %> --%>
<!-- JSP 액션태그 include -->
<jsp:include page="../includes/header.jsp"></jsp:include>

			<div class="col-md-12">
				<h4 class="m-b-lg">Tables</h4>
			</div><!-- END column -->


			<div class="col-md-12">
				<div class="widget p-lg">
					<h4 class="m-b-lg">Hover rows</h4>
					<p class="m-b-lg docs">
						Add <code>.table-hover</code> to enable a hover state on table rows within a <code>&lt;tbody&gt;</code>.
					</p>

					<table class="table table-hover">
						<tr><th>#</th><th>First Name</th><th>Last Name</th><th>Username</th></tr>
						<tr><td>1</td><td>Mark</td><td>Otto</td><td>@mdo</td></tr>
						<tr><td>2</td><td>Jacob</td><td>Thornton</td><td>@fat</td></tr>
						<tr><td>3</td><td>Larry</td><td>the Bird</td><td>@twitter</td></tr>
					</table>
				</div><!-- .widget -->
			</div><!-- END column -->

<!-- JSP 액션태그 include -->
<jsp:include page="../includes/footer.jsp"></jsp:include>
<!-- JSP include -->
<%-- <%@ include file="../includes/footer.jsp" %> --%>



