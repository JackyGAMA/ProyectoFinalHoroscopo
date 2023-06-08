package org.example;

import org.example.vista.VentanaHoroscopo;
import org.example.controlador.ControladorHoroscopo;
import org.example.vista.VentanaHoroscopo;

import javax.swing.*;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
        VentanaHoroscopo view = new VentanaHoroscopo("MVC");
        ControladorHoroscopo controlador = new ControladorHoroscopo(view);
    }
}