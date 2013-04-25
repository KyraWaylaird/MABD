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
                        <h1><s:property value="#furgoneta.idFurgoneta" /></h1>
                    </div>

                    <dl class="dl-horizontal">
                        <dt>Estao:</dt>
                        <dd><s:property value="#furgoneta.estadoFurgoneta" /></dd>
                        <hr>
                        <dt>Combustible:</dt>
                        <dd>69%</dd>
                        <hr>
                        <dt>Modelo:</dt>
                        <dd>DBS</dd>
                        <hr>
                        <dt>Pedidos asignados:</dt>
                        <dd>
                            <ul class="nav nav-list">
                                <li><a href="">Pedido #</a></li>
                                <li class="active"><a href="">Pedido #</a></li>
                                <li><a href="">Pedido #</a></li>
                                <li><a href="">Pedido #</a></li>
                                <li><a href="">Pedido #</a></li>
                                <li><a href="">Pedido #</a></li>
                            </ul>
                            <div class="btn-group btn-group-horizontal">
                                <a href="verpedido.jsp" type="submit" class="btn">Ver pedido</a>
                                <a href="#" class="btn">Desasignar</a>
                                <a href="#" class="btn">Desasignar todos</a>
                            </div>
                        </dd>
                        <hr>
                        <dt>Pedidos entregados:</dt>
                        <dd>
                            <ul class="nav nav-list">
                                <li><a href="">Pedido #</a></li>
                                <li class="active"><a href="">Pedido #</a></li>
                                <li><a href="">Pedido #</a></li>
                                <li><a href="">Pedido #</a></li>
                                <li><a href="">Pedido #</a></li>
                                <li><a href="">Pedido #</a></li>
                            </ul>
                            <div class="btn-group btn-group-horizontal">
                                <a href="verpedido.jsp" type="submit" class="btn">Ver pedido</a>
                                <a href="#" class="btn">Exportar</a>					  
                            </div>
                        </dd>

                        <hr>
                    </dl>

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