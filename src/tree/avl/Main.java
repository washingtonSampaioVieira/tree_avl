package tree.avl;

import tree.avl.model.*;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// 1- Listar pessoas por categoria
// 2-
        try {
            Controle controle = new Controle();
            controle.menu();
        } catch (ParseException e) {
            System.out.println("Deu erro no cadastro");
        }
    }
    //


}
