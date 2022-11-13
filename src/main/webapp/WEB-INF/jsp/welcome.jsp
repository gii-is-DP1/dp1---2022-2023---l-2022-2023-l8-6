<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>
<!-- %@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %-->  

<petclinic:layout pageName="home">
    <h2>Bienvenido</h2>
    <div class="row">
        <div class="col-md-8">
            <h2>Proyecto ${title}</h2>
            <p><h2>Grupo ${group}</h2></p>
            <p><ul>
                <c:forEach items="${persons}" var="persona">
                    <li>${persona.firstName} ${persona.lastName}</li>
                </c:forEach>
            </ul></p>
        </div>

        <div class="col-md-4">
            <img class="img-responsive" src="/resources/images/Drip_Goku.jpg"/>
        </div>
    </div>

</petclinic:layout>
