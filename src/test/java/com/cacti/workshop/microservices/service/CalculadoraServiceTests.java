package com.cacti.workshop.microservices.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by domix on 8/13/16.
 */
public class CalculadoraServiceTests {
  @Test
  public void test_sum() {
    CalculadoraService service = new CalculadoraService();

    assertEquals("La suma de 1 y 3 debe ser 3", Integer.valueOf(3), service.sum(1, 2));
  }
}
