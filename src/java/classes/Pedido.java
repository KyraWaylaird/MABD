/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Collection;

/**
 *
 * @author Guille
 */
public class Pedido
{
    
    private String idPedido;
    private Double precioTotal;
    private Cliente cliente;
    private Collection<Producto> carrito;
    private Direccion direccion;
    private Integer idFurgoneta;

}
