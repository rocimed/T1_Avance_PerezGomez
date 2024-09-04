	<header class="dashboard-header">
        <div class="logo">
            <a href="#">
	         	<img alt="logo" src="<%= request.getContextPath()%>/images/logo.png" 
	         		width="50" height="50">
	         </a>
        </div>
        <div class="user-info">
        	<img alt="logo" src="<%= request.getContextPath()%>/images/logo.png"  class="user-image">
	         <div class="user-name">
                <span><%= request.getParameter("email") %></span>
                <i class="fas fa-chevron-down"></i>
                <ul class="dropdown-menu">
                    <li><a href="#">Perfil</a></li>
                    <li><a href="<%=request.getContextPath() %>/index.jsp">Logout</a></li>
                </ul>
            </div>
        </div>
    </header>
