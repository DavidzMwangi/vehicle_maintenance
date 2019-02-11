<%@ include file="/foreman/layouts/header.html" %>
<%@ page import="model.User" %>
            <!-- End Navbar -->
            <div class="content">
                <div class="container-fluid">
                    <div class="row">
<%
    
    
    User user=(User)session.getAttribute("user");
    
    
    %>

<h1>Welcome ${user.getName()}</h1>
                    </div>
              
                </div>
            </div>
          
            
            <%@ include file="/foreman/layouts/footer.html" %>

