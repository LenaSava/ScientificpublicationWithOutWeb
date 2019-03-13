package model.exception.logic;

import model.exception.MainProjectException;

public class IllegalPopularityException extends MainProjectException {

    public IllegalPopularityException() {
    }

    public IllegalPopularityException(String message) {
        super(message);
    }
}
