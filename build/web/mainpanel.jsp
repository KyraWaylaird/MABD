<!doctype html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html lang="es">
    <head>
        <meta http-equiv="refresh" content="5" />
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
                        <h1>Mapa de flagonetas</h1>				
                    </div>
                </div>
                <div class="span2"></div>
            </div>

            <div class="row">
                <div class="span2">
                    <div class="well sidebar-nav">
                        <ul class="nav nav-list">
                            <li class="nav-header">Pedidos</li>
                            <li class="active"><a href="#">Pedido #</a></li>
                            <li><a href="#">Pedido #</a></li>
                            <li><a href="#">Pedido #</a></li>
                            <li><a href="#">Pedido #</a></li>
                            <li><a href="#">Pedido #</a></li>
                            <li><a href="#">Pedido #</a></li>
                            <li><a href="#">Pedido #</a></li>
                            <li><a href="#">Pedido #</a></li>
                            <li><a href="#">Pedido #</a></li>
                            <li><a href="#">Pedido #</a></li>
                            <li><a href="#">Pedido #</a></li>
                            <li><a href="#">Pedido #</a></li>
                            <li><a href="#">Pedido #</a></li>
                            <li class="nav-header"></li>
                        </ul>
                        <div class="btn-group btn-group-vertical">
                            <a href="verpedido.jsp" type="submit" class="btn">Ver pedido</a>
                            <a href="listapedido.jsp" class="btn">Lista detallada</a>
                        </div>			          
                    </div><!--/.well -->

                </div><!--/span-->

                <div class="span8">         
                    <div class="tabbable tabs">
                        <ul class="nav nav-tabs">
                            <li class=active>
                                <a href="#1" data-toggle="tab">Todas</a>
                            </li>
                            <li>
                                <a href="#2" data-toggle="tab">Libres</a>
                            </li>
                            <li>
                                <a href="#3" data-toggle="tab">Asignadas</a>
                            </li>
                            <li>
                                <a href="#4" data-toggle="tab">Vacias</a>
                            </li>
                        </ul>

                        <div class="tab-content">
                            <div class="tab-pane fade active in" id="1">Mi contenido de las sección 1</div>
                            <div class="tab-pane fade" id="2">Mi contenido de las sección 2</div>
                            <div class="tab-pane fade" id="3">Mi contenido de las sección 3</div>		
                        </div>

                    </div>

                </div><!--/span-->

                <div class="span2">
                    <div class="well sidebar-nav">
                        <ul class="nav nav-list">
                            <li class="nav-header">Furgonetas</li>
                            <s:iterator value="furgonetas" var="furgoneta">
                                <li><s:a action="verfurgoneta"><s:property value="#furgoneta.idFurgoneta" /></s:a></li>
                            </s:iterator>
                            <li class="nav-header"></li>              
                        </ul>

                        <div class="btn-group btn-group-vertical">
                            <s:a action="verfurgoneta" namespace="/" cssClass="btn">Ver Furgoneta</s:a>
                            <s:a action="listafurgoneta" namespace="/" cssClass="btn">Lista detallada</s:a>
                        </div>


                    </div><!--/.well -->







                </div><!--/span-->


            </div><!--/row-->

            <div class="row">
                <div class="span2">      			

                    <form class="form-search">
                        <div class="input-append">
                            <input type="text" class="span1 search-query">
                            <button type="submit" class="btn  btn-primary">Buscar</button>
                        </div>
                    </form>

                </div>
                <div class="span8">

                    <form class="form-search">
                        <div class="input-append">
                            <input type="text" class="span5 search-query">
                            <button type="submit" class="btn btn-primary">Buscar</button>
                        </div>
                        <a href="#" class="btn btn-success">Asignar pedido</a>
                    </form>


                </div>
                <div class="span2">

                    <form class="form-search">
                        <div class="input-append">
                            <input type="text" class="span1 search-query">
                            <button type="submit" class="btn btn-primary">Buscar</button>
                        </div>
                    </form>

                </div>

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