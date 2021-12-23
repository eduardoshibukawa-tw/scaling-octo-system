package com.eduardoshibukawatw.scalingoctosystem.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaciControllerTest {

    @Test
    public void shouldGetSaci() {
        SaciController saciController = new SaciController();

        assertEquals("Saci", saciController.getSaci());
    }

}