package org.danielgallo84;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SemanaTest {
        private Semana semana;
    
        @BeforeEach
        void setUp() {
            semana = new Semana();
            semana.crearDias();
        }
    
        @Test
        void testCrearDias() {
            assertEquals(7, semana.longitudDeLaLista());
        }
    
        @Test
        void testObtenerDias() {
            List<String> dias = semana.obtenerDias();
            assertTrue(dias.contains("Lunes"));
            assertTrue(dias.contains("Domingo"));
        }
    
        @Test
        void testLongitudDeLaLista() {
            assertEquals(7, semana.longitudDeLaLista());
        }
    
        @Test
        void testEliminarDia() {
            semana.eliminarDia("Lunes");
            assertFalse(semana.existeDia("Lunes"));
        }
    
        @Test
        void testObtenerDia() {
            assertEquals("Lunes", semana.obtenerDia(0));
        }
    
        @Test
        void testExisteDia() {
            assertTrue(semana.existeDia("Lunes"));
            assertFalse(semana.existeDia("Festividad"));
        }
    
        @Test
        void testOrdenarDias() {
            semana.ordenarDias();
            semana.eliminarDia("Lunes");
            assertEquals(6, semana.longitudDeLaLista());
        }
    
        @Test
        void testVaciarLista() {
            semana.vaciarLista();
            assertEquals(0, semana.longitudDeLaLista());
        }
    }

