package model.exception.logic;

import model.exception.MainProjectException;

public class IllgealAmountOfPagesException extends MainProjectException {
    public IllgealAmountOfPagesException() {
    }

    public IllgealAmountOfPagesException(String message) {
        super(message);
    }
}