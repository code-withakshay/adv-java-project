<jsp:useBean id="u" class="com.codeWithAkshay.www.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

Records are <br>

<jsp:getProperty property="username" name="u"/>
<jsp:getProperty property="password" name="u"/>
<jsp:getProperty property="email" name="u"/>