/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packMain;

import Controlador.Controlador;
import Modelos.Modelo;
import Vistas.frmPrincipal;

/**
 *
 * @author umg
 */
public class main {
     public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal VistaPrincipal = new frmPrincipal();
        Modelo Conexion= new Modelo();
        
        Controlador Controlador = new Controlador(VistaPrincipal,Conexion);
        
    }
}
