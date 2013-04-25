/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import classes.Furgoneta;
import classes.Pedido;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Guille
 */
@Namespace(value = "/")
@Action(value = "mainpanel", results =
{
    @Result(name = "success", location = "/mainpanel.jsp")
})
public class MainPanel extends ActionSupport
{

    private Furgoneta[] furgonetas;
    private Pedido[] pedidos;

    @Override
    public String execute()
    {
        Map<String, Object> session = ActionContext.getContext().getSession();
        Object object;
        if (session.containsKey("lista_furgonetas"))
        {
            object = session.get("lista_furgonetas");
            if (object instanceof Collection)
            {
                Collection<Furgoneta> furgonetasCollection =
                        (Collection<Furgoneta>) object;
                if (furgonetasCollection != null)
                {
                    //PRUEBA
                    Integer iterador = (Integer) session.get("iterador");
                    ArrayList<Furgoneta> furgonetasArrayList = 
                            new ArrayList<Furgoneta>(furgonetasCollection);
                    Furgoneta furgoneta = new Furgoneta();
                    furgoneta.setIdFurgoneta(iterador);
                    furgoneta.setEstadoFurgoneta(iterador.toString());
                    furgonetasArrayList.add(furgoneta);
                    furgonetasCollection = furgonetasArrayList;
                    session.put("lista_furgonetas", furgonetasCollection);
                    session.put("iterador", ++iterador);
                    //FIN_PRUEBA
                    setFurgonetas(furgonetasCollection.toArray(new Furgoneta[furgonetasCollection.size()]));
                }
            }
        }
        //PRUEBA
        else
        {
            session.put("lista_furgonetas", new ArrayList<Furgoneta>());
            session.put("iterador", 0);
        }
        //FIN_PRUEBA
        if (session.containsKey("lista_pedidos"))
        {
            object = session.get("lista_pedidos");
            if (object instanceof Collection)
            {
                Collection<Pedido> pedidosCollection =
                        (Collection<Pedido>) object;
                if (pedidosCollection != null)
                {
                    setPedidos((Pedido[]) pedidosCollection.toArray());
                }
            }
        }

        return SUCCESS;
    }

    /**
     * @return the furgonetas
     */
    public Furgoneta[] getFurgonetas()
    {
        return furgonetas;
    }

    /**
     * @param furgonetas the furgonetas to set
     */
    public void setFurgonetas(Furgoneta[] furgonetas)
    {
        this.furgonetas = furgonetas;
    }

    /**
     * @return the pedidos
     */
    public Pedido[] getPedidos()
    {
        return pedidos;
    }

    /**
     * @param pedidos the pedidos to set
     */
    public void setPedidos(Pedido[] pedidos)
    {
        this.pedidos = pedidos;
    }
}
