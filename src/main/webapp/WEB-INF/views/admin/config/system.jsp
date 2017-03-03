<%@page pageEncoding="UTF-8" isELIgnored="false" session="false" errorPage="/WEB-INF/views/commons/errors/jsp_error.jsp"%>
<%@page import="org.support.project.common.config.INT_FLAG"%>
<%@page import="org.support.project.web.logic.HttpRequestCheckLogic"%>
<%@page import="org.support.project.web.util.JspUtil"%>
<%@page import="org.support.project.knowledge.config.SystemConfig"%>
<%@page import="org.support.project.knowledge.vo.Roles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<% JspUtil jspUtil = new JspUtil(request, pageContext); %>

<c:import url="/WEB-INF/views/commons/layout/layoutMain.jsp">

<c:param name="PARAM_HEAD">
<style>
.radio_block {
    margin-bottom: 10px;
}
</style>
</c:param>

<c:param name="PARAM_SCRIPTS">
</c:param>



<c:param name="PARAM_CONTENT">
<h4 class="title"><%= jspUtil.label("knowledge.config.system.title") %></h4>

<form action="<%= request.getContextPath()%>/admin.config/save_params" method="post" role="form">
    <input type="hidden" name="<%= HttpRequestCheckLogic.REQ_ID_KEY %>"
        value="<%= jspUtil.out(HttpRequestCheckLogic.REQ_ID_KEY) %>" />
    <div class="form-group">
        <label for="host"><%= jspUtil.label("knowledge.config.system.label.url") %></label>
        <input type="text" class="form-control" name="systemurl" id="host" placeholder="URL" value="<%= jspUtil.out("systemurl") %>" />
    </div>
    
    
    <div class="form-group">
        <label for="authType_lock"><%= jspUtil.label("knowledge.config.system.open") %></label><br/>
        <label class="radio-inline radio_block">
            <input type="radio" value="<%=SystemConfig.SYSTEM_EXPOSE_TYPE_OPEN%>" name="system_open_type" 
                id="system_open_type_open" <%=jspUtil.checked(SystemConfig.SYSTEM_EXPOSE_TYPE_OPEN, "system_open_type", true)%>/>
            <i class="fa fa-gavel fa-lg"></i>&nbsp;<%= jspUtil.label("knowledge.config.system.open") %>
        </label>
        <br/>
        <label class="radio-inline radio_block">
            <input type="radio" value="<%=SystemConfig.SYSTEM_EXPOSE_TYPE_CLOSE%>" name="system_open_type" 
                id="system_open_type_close" <%=jspUtil.checked(SystemConfig.SYSTEM_EXPOSE_TYPE_CLOSE, "system_open_type", false)%>/>
            <i class="fa fa-lock fa-lg"></i>&nbsp;<%= jspUtil.label("knowledge.config.system.close") %>
        </label>
    </div>
    
    <button type="submit" class="btn btn-primary"><i class="fa fa-save"></i>&nbsp;<%= jspUtil.label("label.save") %></button>
</form>


</c:param>

</c:import>

