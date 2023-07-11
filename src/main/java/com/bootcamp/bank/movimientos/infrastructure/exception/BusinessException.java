package com.bootcamp.bank.movimientos.infrastructure.exception;

/**
 * Clase Exception de Negocio
 */
public class BusinessException extends RuntimeException{
    private String errorCode;
    private String messageError;

    public BusinessException(String messageError) {
        super(messageError);
        this.messageError = messageError;
    }


}