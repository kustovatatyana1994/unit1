package ru.netology.service;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest2 {

    @Test
    public void shouldRemainLessBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainEquallyBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainMoreBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1100;

        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
        }
}