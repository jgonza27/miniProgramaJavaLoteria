package com.iescelia;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    TextField salida;

    @FXML
    private void loteriaPrimitiva() throws IOException {
        ArrayList<Integer> loteria = new ArrayList<>();
        String s = "";

        for (int i = 0; i <= 6; i++) {

            int a = (int) (Math.random() * 49) + 1;
            loteria.add(a);
            s = s + a + " ";
        }
        salida.setText(s);
        System.out.println(s);

    }

}
