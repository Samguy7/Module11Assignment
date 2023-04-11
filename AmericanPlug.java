/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module11assignment;

/**
 *
 * @author sam
 */
public class AmericanPlug extends ElectricalSocket implements SocketAdapter{
    
	@Override
	public Socket getA120Socket() {
		return getSocket();
	}

	@Override
	public Socket getE220Socket() {
		Socket s = getSocket();
		return convertSocket(s);
	}
	
	private Socket convertSocket(Socket s) {
		return new Socket(s.getSocket());
	}


}

