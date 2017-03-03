<%@page import="org.support.project.web.util.JspUtil"%>
<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"
    errorPage="/WEB-INF/views/commons/errors/jsp_error.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
    JspUtil jspUtil = new JspUtil(request, pageContext);
%>

<c:import url="/WEB-INF/views/commons/layout/layoutMain.jsp">

    <c:param name="PARAM_HEAD">
    </c:param>

    <c:param name="PARAM_SCRIPTS">
<!-- build:js(src/main/webapp) js/page-knowledge-history.js -->
    <script type="text/javascript" src="bower/echojs/dist/echo.min.js"></script>
<!-- endbuild -->
    <script>
    echo.init();
    </script>
    </c:param>

    <c:param name="PARAM_CONTENT">
<h4 class="title"><%= jspUtil.label("knowledge.histories.title") %></h4>

<p>
<img src="<%= request.getContextPath()%>/images/loader.gif" 
    data-echo="<%= request.getContextPath()%>/open.account/icon/<%= jspUtil.out("history.updateUser") %>" 
    alt="icon" width="36" height="36" style="float:left" />
<br/>
<i class="fa fa-user"></i>&nbsp;<%= jspUtil.out("history.userName") %>&nbsp;
<i class="fa fa-calendar"></i>&nbsp;<%= jspUtil.date("history.updateDatetime")%>
</p>

<h5 class="sub_title"><%= jspUtil.label("knowledge.histories.label.diff") %></h5>
<pre><c:if test="${empty changes}"><%= jspUtil.label("knowledge.histories.list.label.empty") %></c:if>
<c:forEach var="change" items="${changes}" varStatus="status"><%= jspUtil.out("change") %></c:forEach>
</pre>

<br/>
<h5 class="sub_title"><%= jspUtil.label("knowledge.histories.label.history") %></h5>
<div class="form-group">
    <label for="input_content"><%= jspUtil.label("knowledge.add.label.content") %></label>
    <textarea class="form-control" name="content" rows="5" placeholder="<%= jspUtil.label("knowledge.add.label.content") %>" id="content" readonly="readonly"><%= jspUtil.out("history.content") %></textarea>
</div>

<br/>
<h5 class="sub_title"><%= jspUtil.label("knowledge.histories.label.now") %></h5>
<div class="form-group">
    <label for="input_content"><%= jspUtil.label("knowledge.add.label.content") %></label>
    <textarea class="form-control" name="content" rows="5" placeholder="<%= jspUtil.label("knowledge.add.label.content") %>" id="content" readonly="readonly"><%= jspUtil.out("now.content") %></textarea>
</div>



<a href="<%= request.getContextPath() %>/open.knowledge/histories/<%= jspUtil.out("knowledgeId") %><%= jspUtil.out("params") %>&page=<%= jspUtil.out("page") %>"
    class="btn btn-warning" role="button"><i class="fa fa-undo"></i>&nbsp;<%= jspUtil.label("label.back") %>
</a>

    </c:param>

</c:import>

