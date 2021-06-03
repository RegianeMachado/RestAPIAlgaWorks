package com.algaworks.algalog.domain.exception;

public class NegocioException extends RuntimeException {
    public static final long serialVersionID = 1L;

    public NegocioException(String message) {
        super(message);
    }
}
