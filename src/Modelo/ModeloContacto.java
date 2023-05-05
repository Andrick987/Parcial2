
package Modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ModeloContacto {
    
    ArrayList MiLista = new ArrayList();
    DefaultTableModel ModeloTabla;
    
    public void AgregarContactos(String ape, String nom, String tel){
        Contacto nuevoContacto = new Contacto(ape, nom, tel);
        this.MiLista.add(nuevoContacto);
    }
    public DefaultTableModel ListarContactos(){
        ArrayList<Contacto>listaLocal = MiLista;
        ModeloTabla = new DefaultTableModel();
        this.ModeloTabla.setRowCount(0);
        this.ModeloTabla.addColumn("APELLIDOS");
        this.ModeloTabla.addColumn("NOMBRE");
        this.ModeloTabla.addColumn("TELEFONO");
        for(Contacto MiListaDeContactos: listaLocal){
            
            this.ModeloTabla.addRow(new Object[]{MiListaDeContactos.getApellidos()
            ,MiListaDeContactos.getNombre(), MiListaDeContactos.getTelefono()});
        }
        return ModeloTabla;
    }
    
}
