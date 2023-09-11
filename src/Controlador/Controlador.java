package Controlador;

import Modelos.*;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class Controlador implements ActionListener {
    
    frmPrincipal VistaPrincipal;
    Modelo ModeloConexion;

    public Controlador(frmPrincipal VistaPrincipal, Modelo ModeloConexion) {
       
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloConexion = ModeloConexion;
        
        //Levantar Formulario Principal
        this.VistaPrincipal.setVisible(true);
        
        //Poner a la escucha el boton principal
        this.VistaPrincipal.btnCrearUsuario.addActionListener(this);
        this.VistaPrincipal.cbTodos.addActionListener(this);
        this.VistaPrincipal.cbInsertar.addActionListener(this);
        this.VistaPrincipal.cbEditar.addActionListener(this);
        this.VistaPrincipal.cbEliminar.addActionListener(this);
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == this.VistaPrincipal.btnCrearUsuario)
        {
            this.ModeloConexion.CrearUsuario(this.VistaPrincipal.txtUsuario.getText(),this.VistaPrincipal.txtContraseña.getText());
            if(this.VistaPrincipal.cbInsertar.isSelected())
            {
                this.ModeloConexion.Insertar(this.VistaPrincipal.txtUsuario.getText());
            }
            if(this.VistaPrincipal.cbEditar.isSelected())
            {
                this.ModeloConexion.Editar(this.VistaPrincipal.txtUsuario.getText());
            }
            if(this.VistaPrincipal.cbEliminar.isSelected())
            {
                this.ModeloConexion.Eliminar(this.VistaPrincipal.txtUsuario.getText());
            }
            if(this.VistaPrincipal.cbTodos.isSelected())
            {
                this.ModeloConexion.AllPrivilegios(this.VistaPrincipal.txtUsuario.getText());
            }
            JOptionPane.showMessageDialog(null, "Permisos Concedidos");
        }
         if(e.getSource() == this.VistaPrincipal.cbTodos)
         {
            this.VistaPrincipal.cbInsertar.setSelected(false);
            this.VistaPrincipal.cbEditar.setSelected(false);
            this.VistaPrincipal.cbEliminar.setSelected(false);
            
         }
         else if(e.getSource() == this.VistaPrincipal.cbEditar || e.getSource() == this.VistaPrincipal.cbInsertar ||e.getSource() == this.VistaPrincipal.cbEliminar )
         {
             this.VistaPrincipal.cbTodos.setSelected(false);
         }
        
         
    }

}