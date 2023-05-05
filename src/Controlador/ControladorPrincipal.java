
package Controlador;

import Modelo.ModeloContacto;
import Vistas.frmAgContacto;
import Vistas.frmPrincipal;
import Vistas.frmVerContacto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener{
    
    frmPrincipal VistaPrincipal;
    frmAgContacto VistaAgregados;
    frmVerContacto VistaContactos;
    ModeloContacto ContactoModel;

    public ControladorPrincipal(frmPrincipal VistaPrincipal, frmAgContacto VistaAgregados, frmVerContacto VistaContactos, ModeloContacto ContactoModel) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaAgregados = VistaAgregados;
        this.VistaContactos = VistaContactos;
        this.ContactoModel = ContactoModel;
        
        this.VistaAgregados.btnAgregarC.addActionListener(this);
        this.VistaPrincipal.btnAgregarContacto.addActionListener(this);
        this.VistaPrincipal.btnVerContactos.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource() == this.VistaPrincipal.btnAgregarContacto){
        this.VistaAgregados.setLocationRelativeTo(null);
        this.VistaAgregados.setVisible(true);
    }
        if(e.getSource() == this.VistaPrincipal.btnVerContactos){
            
        this.VistaContactos.jtContactos.setModel(this.ContactoModel.ListarContactos());
        
        this.VistaContactos.setLocationRelativeTo(null);
        this.VistaContactos.setVisible(true);
    }

      
        if(e.getSource() == VistaAgregados.btnAgregarC){

        this.ContactoModel.AgregarContactos(this.VistaAgregados.txtApellidos.getText(),
        this.VistaAgregados.txtNombre.getText(), this.VistaAgregados.txtTelefono.getText());
        this.VistaAgregados.txtApellidos.setText("");
        this.VistaAgregados.txtNombre.setText("");
        this.VistaAgregados.txtTelefono.setText(""); 
        
        }
        
    }

}
