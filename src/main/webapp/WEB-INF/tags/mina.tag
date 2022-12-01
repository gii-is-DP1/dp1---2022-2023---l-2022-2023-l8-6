<%@ attribute name="size" required="true" rtexprvalue="true" 
description="Tamaño de la pieza a utilizar" %>
<%@ attribute name="mina" required="true" rtexprvalue="true" type="org.springframework.samples.petclinic.mina.Mina"
description="Mina a renderizar" %>

image = document.getElementById('mina');
ctx.drawImage(image, ${mina.getPositionXInPixels(size)}, ${mina.getPositionYInPixels(size)}, ${size}, ${size});
