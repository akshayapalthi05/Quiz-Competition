<%@ page import="java.util.*" %>
<html>
<head>
    <title>Quiz</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<h1>Answer the Quiz</h1>
<form action="ResultServlet" method="post">
<%
    String[] questions = (String[]) request.getAttribute("questions");
    String[][] options = (String[][]) request.getAttribute("options");
    for (int i = 0; i < questions.length; i++) {
%>
    <h3><%= (i+1) + ". " + questions[i] %></h3>
    <% for (int j = 0; j < 4; j++) { %>
        <input type="radio" name="q<%=i%>" value="<%= (j+1) %>" required>
        <%= options[i][j] %><br>
    <% } %>
    <br>
<% } %>
    <button class="btn">Submit Quiz</button>
</form>
</body>
</html>