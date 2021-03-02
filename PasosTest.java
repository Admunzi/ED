package practicasED;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;

class PasosTest {
  
  Pasos p;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
    System.out.println("Inicializando JUnit.");
  }

  @AfterAll
  static void setUpAfterAll() throws Exception {
    System.out.println("Ha finalizado JUnit.");
  }
  
  @BeforeEach
  void setUpBeforeTest() throws Exception {
    p = new Pasos();
    System.out.println("Inicializando Test.");
  }
  
  //No válidos
  
  @Test
  @Order(1)
  void esfuerzo1() {
    assertEquals(-1, p.esfuerzo(-4));
  }
  
  @Test
  @Order(2)
  void esfuerzo2() {
    assertEquals(1, p.esfuerzo(900));
  }
  
  @Test
  @Order(3)
  void esfuerzo3() {
    assertEquals(2, p.esfuerzo(1500));
  }
  
  @Test
  @Order(4)
  void esfuerzo4() {
    assertEquals(3, p.esfuerzo(3000));
  }
  
  @Test
  @Order(5)
  void esfuerzo5() {
    assertEquals(4, p.esfuerzo(5000));
  }
  
  @Test
  @Order(6)
  void esfuerzo6() {
    assertEquals(5, p.esfuerzo(100000));
  }
  
  @Test
  @Order(7)
  void esfuerzo7() {
    assertEquals(-2, p.esfuerzo(1999999999));
  }
}
