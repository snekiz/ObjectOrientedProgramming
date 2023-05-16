import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.text.Text;



public class LoginController implements Initializable{
    @FXML
    TextField username;

    @FXML
    Text redflag;

    @FXML
    PasswordField password;

    @FXML
    private ChoiceBox<String> userChoicebox;

    @FXML
    Button loginButton;

    private String[] user = {"Admin", "Student"};

    private Stage stage;
    private Scene scene;
    private Parent root;
    private String userChoice;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    
        userChoicebox.getItems().addAll(user);
        // userChoicebox.setOnAction(this::choice);
       
    }
   
    public void switchtologin(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("login.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchtoregister(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("register.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    //  public void choice(ActionEvent event){
    //     userChoice = userChoicebox.getValue();
    //  }

    public void login(ActionEvent event) throws IOException {
        userChoice = userChoicebox.getValue();
        String uname = username.getText();
        String pword = password.getText();

        if (userChoice == "Admin" && uname.equals("admin") && pword.equals("pkkr")){
            System.out.println("tama");
            root = FXMLLoader.load(getClass().getResource("AdminInterface.fxml")); 
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    } else{
        redflag.setVisible(true);
    }

}
}