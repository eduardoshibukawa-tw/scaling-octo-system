package com.eduardoshibukawatw.scalingoctosystem.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaciControllerTest {

    @Test
    void shouldGetSaci() {
        SaciController saciController = new SaciController();

        String result = saciController.getSaci();

        assertEquals("Saci", result);
    }

}