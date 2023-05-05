
import Controlador.ControladorPrincipal;
import Modelo.ModeloContacto;
import Vistas.frmAgContacto;
import Vistas.frmPrincipal;
import Vistas.frmVerContacto;


public class main {

    public static void main(String[] args) {
       
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmAgContacto VistaAgregados = new frmAgContacto(null, true);
        frmVerContacto VistaContactos = new frmVerContacto(null, true);
        ModeloContacto ContactoModel = new ModeloContacto();
        ControladorPrincipal PrincipalControler = new ControladorPrincipal (VistaPrincipal, VistaAgregados, VistaContactos, ContactoModel);
    }
    
}
