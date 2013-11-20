package de.gravitex.processing.logic;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
}
