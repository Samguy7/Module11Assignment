/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.module11assignment;

/**
 *
 * @author sam
 */
public class Module11Assignment {

    public static void main(String[] args) {

        SocketAdapter plugAdapter = new AmericanPlug();
        Socket aPlug = getSocket(plugAdapter, 120);
        System.out.println("Plug for American " + aPlug.getSocket());

        SocketAdapter europeanAdapter = new EuropeanSocket();
        Socket eSocket = getSocket(europeanAdapter, 220);
        System.out.println("Socket for European " + eSocket.getSocket());
    }

    private static Socket getSocket(SocketAdapter sockAdapter, int i) {
        return switch (i) {
            case 120 -> sockAdapter.getA120Socket();
            case 220 -> sockAdapter.getE220Socket();
            default -> sockAdapter.getE220Socket();
        };
    }
}

