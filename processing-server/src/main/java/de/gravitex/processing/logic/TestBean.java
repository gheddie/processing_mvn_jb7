package de.gravitex.processing.logic;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(TestRemote.class)
public class TestBean implements TestRemote {

	public void sayMoo() {
		System.out.println("moo123...");
	}
}
