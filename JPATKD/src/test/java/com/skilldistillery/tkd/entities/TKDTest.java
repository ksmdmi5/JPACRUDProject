package com.skilldistillery.tkd.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TKDTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private TKD tkd;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("TKDPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em  = emf.createEntityManager();
		tkd = em.find(TKD.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		tkd = null;
	}

	@Test
	void test_TKD_entity_mapping() {
		assertEquals(1, tkd.getId());
		assertEquals("Front Punch", tkd.getTechnique());
		assertTrue(tkd.getDescription().startsWith("Using a "));
		assertEquals("Strike", tkd.getType());
		assertEquals("White Belt", tkd.getBelt());

	}

}
