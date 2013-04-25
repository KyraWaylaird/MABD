/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import classes.Direccion;
import classes.Furgoneta;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
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
@Action(value = "listafurgoneta", results =
{
    @Result(name = "success", location = "/listafurgoneta.jsp")
})
public class ListaFurgoneta extends ActionSupport
{

    private Furgoneta[] furgonetas;

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
                    setFurgonetas((Furgoneta[]) furgonetasCollection.toArray());
                }
            }
        }

        //PRUEBAS
        Direccion direccion = new Direccion();
        direccion.setCalle("calle_prueba1");
        Furgoneta furgoneta1 = new Furgoneta();
        furgoneta1.setIdFurgoneta(1);
        furgoneta1.setEstadoFurgoneta("bien");
        furgoneta1.setDireccion(direccion);
        direccion = new Direccion();
        direccion.setCalle("calle_prueba2");
        Furgoneta furgoneta2 = new Furgoneta();
        furgoneta2.setIdFurgoneta(2);
        furgoneta2.setEstadoFurgoneta("mal");
        furgoneta2.setDireccion(direccion);
        direccion = new Direccion();
        direccion.setCalle("calle_prueba3");
        Furgoneta furgoneta3 = new Furgoneta();
        furgoneta3.setIdFurgoneta(3);
        furgoneta3.setEstadoFurgoneta("bien");
        furgoneta3.setDireccion(direccion);
        Furgoneta[] furgonetasPrueba = new Furgoneta[3];
        furgonetasPrueba[0] = furgoneta1;
        furgonetasPrueba[1] = furgoneta2;
        furgonetasPrueba[2] = furgoneta3;
        setFurgonetas(furgonetasPrueba);
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
}
