package com.eduardoshibukawatw.com.sonarqubepoc.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GrettingControllerTest {

    @InjectMocks
    private GrettingController grettingController;

    @Test
    void shouldReturnHello() {
        assertEquals("Hello!", grettingController.gretting());
    }
}