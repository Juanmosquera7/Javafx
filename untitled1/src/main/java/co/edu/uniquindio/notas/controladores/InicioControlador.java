package co.edu.uniquindio.notas.controladores;
import co.edu.uniquindio.notas.modelo.NotaPrincipal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;


public class InicioControlador {
    @FXML
    private TextField txtTitulo;


    @FXML
    private TextField txtCategoria;


    @FXML
    private TextArea txtNota;

    private final NotaPrincipal notaPrincipal;


    public InicioControlador() {
        notaPrincipal = new NotaPrincipal();
    }
    public void crearNota(ActionEvent e){
        notaPrincipal.agregarNota(txtTitulo.getText(), txtNota.getText(), txtCategoria.getText());


        txtTitulo.clear();
        txtNota.clear();
        txtCategoria.clear();


    }


}
