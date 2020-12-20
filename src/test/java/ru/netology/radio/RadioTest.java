package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio changeparametres = new Radio();

    @Test
    void shouldSetCurrentStation() {
        changeparametres.setCurrentStation(5);
        int setStation = changeparametres.currentStation;
        System.out.println("Номер станции:" + setStation);
        assertEquals(5, setStation);

    }

    @Test
    void shouldUpCurrentStation() {
        int currentStation;
        do {
            changeparametres.upCurrentStation();
            currentStation = changeparametres.currentStation;
            System.out.println("Номер станции:" + currentStation);
        }
        while (currentStation != 0);
        assertEquals(0, currentStation);
    }

    @Test
    void shouldDownCurrentStation() {
        int currentStation;
        changeparametres.setCurrentStation(9);
        do {
            changeparametres.downCurrentStation();
            currentStation = changeparametres.currentStation;
            System.out.println("Номер станции:" + currentStation);
        }
        while (currentStation != 9);
        assertEquals(9, currentStation);
    }

    @Test
    void shouldUpVolume() {
        int volume;
        do {
            changeparametres.upVolume();
            volume = changeparametres.volume;
            System.out.println("Громкость:" + volume);
        }
        while (volume != 10);
        assertEquals(10, volume);
        changeparametres.upVolume();
        volume = changeparametres.volume;
        assertEquals(10, volume);
    }

    @Test
    void shouldDownVolume() {
        int volume;
        changeparametres.volume = 10;
        do {
            changeparametres.downVolume();
            volume = changeparametres.volume;
            System.out.println("Громкость:" + volume);
        }
        while (volume != 0);
        assertEquals(0, volume);
        changeparametres.downVolume();
        volume = changeparametres.volume;
        assertEquals(0, volume);
    }
}