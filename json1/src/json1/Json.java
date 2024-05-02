package json1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Json extends JFrame{

	public Json() {
        boton();
    }

    private void boton() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Leer JSON");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leer();
            }
        });
        panel.add(button);
        add(panel);
        setTitle("Leer JSON");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Json boton = new Json();
        boton.setVisible(true);
    }

    public static void leer() {
    	
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre", "Joji");
        jsonObject.put("edad", 31);
        jsonObject.put("ciudad", "Australia");
        jsonObject.put("cancion", "afterthoght");
        
        System.out.println(jsonObject);

        FileWriter file = null;
        try {
            file = new FileWriter("persona.json");
            file.write(jsonObject.toString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    
    }
}

