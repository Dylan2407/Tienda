package com.Tienda.service;

import jakarta.mail.MessagingException;

/**
 *
 * @author Dylan
 */
public interface CorreoService {
    public void enviarCorreoHtml(
            String para, 
            String asunto, 
            String contenidoHtml) 
            throws MessagingException;
}
