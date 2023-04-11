/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module11assignment;

/**
 * Class to set the socket
 * 
 * @author sam
 */
public class Socket {
    
    private int socket;    
    /**
     * Constructor
     * @param socket
     */
    public Socket(int socket){
        this.socket = socket;
    }
    
    /**
     * Method to set the socket
     * @param socket 
     */
    public void setSocket(int socket) {
      this.socket = socket;
	}
    /**
     * Method to return the socket
     * @return 
     */
    public int getSocket() {
	return socket;
	}
}

	