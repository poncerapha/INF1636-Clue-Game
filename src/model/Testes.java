package model;


import org.junit.Test;
import static org.junit.Assert.*;

public class Testes {

    @Test
	public void envelopeTest() {
		Envelope envelope;
		envelope.setArma("arma");
		envelope.setAssasino("assassino");
		envelope.setLugar("lugar");
		
		assertEquals(envelope, new Envelope("arma", "assassino", "lugar"));
	}
}
