<!doctype html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>TeleCafé Xeco</title>

        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/bootstrap-responsive.css">
        <link rel="stylesheet" href="css/estilos.css">

    </head>
    <body>

        <div class="container">

            <div class="row">
                <div class="span2"></div>
                <div class="span8">
                    <div class="page-header">
                        <h1>Lista de furgonetas</h1>
                    </div>


                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Id Vehiculo</th>
                                <th>Estado</th>
                                <th>Localización</th>

                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="furgonetas" var="furgoneta">
                                <tr>
                                    <td><s:property value="#furgoneta.idFurgoneta"/></td>
                                    <td><s:property value="#furgoneta.estadoFurgoneta"/></td>
                                    <td><s:property value="#furgoneta.idFurgoneta.direccion.calle"/></td>
                                    <td><s:a action="verfurgoneta" cssClass="btn btn-primary">Ver Furgoneta</s:a></td>
                                </tr>
                            </s:iterator>
                        </tbody>
                    </table>
                    <hr>
                    <a href="index.jsp" class="btn btn-primary">Atras</a>

                </div>
                <div class="span2"></div>
            </div>







            <hr>

            <footer>
                <p>TeleCafé ©  2013</p>
            </footer>

        </div>

        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/bootstrap-tab.js"></script>
    </body>
</html>