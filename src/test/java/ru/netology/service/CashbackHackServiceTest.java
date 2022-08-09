package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain999Test() {

        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain1000Test() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain1001Test() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldZeroTest() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldUnderZeroTest() {

        CashbackHackService service = new CashbackHackService();
        int amount = -1;

        int actual = service.remain(amount);
        int expected = 1001;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemain999TestApi() {

        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemain1000TestApi() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldRemain1001TestApi() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldZeroTestApi() {

        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void shouldUnderZeroTestApi() {

        CashbackHackService service = new CashbackHackService();
        int amount = -1;

        int actual = service.remain(amount);
        int expected = 1001;

        assertEquals(actual, expected);
    }
}