/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Tickets.Ticket;

/**
 *
 * @author Student
 */
public class Controlador {
    this.proximonumeroticket=1
     public void addTicket(String descripcion) {
        Ticket newTicket = new Ticket(nextTicketNumber, descripcion);
        this.tickets.add(newTicket);
        proximonumeroticket++; 
    }
    
    
}
