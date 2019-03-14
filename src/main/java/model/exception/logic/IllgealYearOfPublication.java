package model.exception.logic;

import model.exception.MainProjectException;

public class IllgealYearOfPublication extends MainProjectException {
    public IllgealYearOfPublication() {
    }

    public IllgealYearOfPublication(String message) {
        super(message);
    }
}