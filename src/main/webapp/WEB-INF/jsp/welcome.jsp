<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="game" tagdir="/WEB-INF/tags" %>
<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->  

<game:layout pageName="home">
    <h2><fmt:message key="welcome"/></h2>
    <div class="row">
        <div class="col-md-8">
            <h2>Proyecto ${title}</h2>
            <p><h2>Grupo ${group}</h2></p>
            <p><ul>
                <c:forEach items="${persons}" var="persona">
                    <li>${persona.firstName}_${persona.lastName}</li>
                </c:forEach>
            </ul></p>
        </div>
<!--
        <div class="col-md-4">
            <img class="img-responsive" src="/resources/images/mina.png" width="100px" height="100px"/>
        </div>
-->
    </div>

    <div class="row">
        <div class="col-md-12 text-center">
            <game:tablero tablero="${tablero}">
                <c:forEach items="${tablero.minas}" var="mina">
                    <game:mina size="50" mina="${mina}"/>
                </c:forEach>
            </game:tablero>
        </div>
    </div>

</game:layout>
