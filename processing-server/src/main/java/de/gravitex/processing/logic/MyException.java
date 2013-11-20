package de.gravitex.processing.logic;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class MyException extends Exception {

}
