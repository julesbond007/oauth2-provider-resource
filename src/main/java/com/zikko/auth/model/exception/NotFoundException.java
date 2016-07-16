package com.zikko.auth.model.exception;

/**
 * Exception to throw when a user object was expected for a given id, but none
 * was found.
 *
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
public class NotFoundException extends AbstractBaseException {
    private static final long serialVersionUID = 1567846893330865463L;

    public NotFoundException(final String message) {
        super(message);
    }

    @Override
    public int getStatus() {
        return 404;
    }
}