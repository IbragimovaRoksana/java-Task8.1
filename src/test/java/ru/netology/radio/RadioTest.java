package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio myRadio = new Radio();

    @Test
    void shouldSetCurrentStation() {
        myRadio.setCurrentStation(5);
        int setStation = myRadio.currentStation;
        System.out.println("Номер станции:" + setStation);
        assertEquals(5, setStation);
    }

    @Test
    void shouldCheckOverLimit() {
        myRadio.setCurrentStation(10);
        int setStation = myRadio.currentStation;
        System.out.println("Номер станции:" + setStation);
        assertEquals(0, setStation);
    }

    @Test
    void shouldCheckUnderLimit() {
        myRadio.setCurrentStation(-1);
        int setStation = myRadio.currentStation;
        System.out.println("Номер станции:" + setStation);
        assertEquals(0, setStation);
    }

    @Test
    void shouldUpCurrentStation() {
        myRadio.setCurrentStation(5);
        int currentStation;
        myRadio.upCurrentStation();
        currentStation = myRadio.currentStation;
        System.out.println("Номер станции:" + currentStation);
        assertEquals(6, currentStation);
    }

    @Test
    void shouldUpCurrentStationToZero() {
        myRadio.setCurrentStation(9);
        int currentStation;
        myRadio.upCurrentStation();
        currentStation = myRadio.currentStation;
        System.out.println("Номер станции:" + currentStation);
        assertEquals(0, currentStation);
    }

    @Test
    void shouldDownCurrentStation() {
        myRadio.setCurrentStation(5);
        int currentStation;
        myRadio.downCurrentStation();
        currentStation = myRadio.currentStation;
        System.out.println("Номер станции:" + currentStation);
        assertEquals(4, currentStation);
    }

    @Test
    void shouldDownCurrentStationToNine() {
        myRadio.setCurrentStation(0);
        int currentStation;
        myRadio.downCurrentStation();
        currentStation = myRadio.currentStation;
        System.out.println("Номер станции:" + currentStation);
        assertEquals(9, currentStation);
    }

    @Test
    void shouldUpVolume() {
        myRadio.volume = 5;
        int volume;
        myRadio.upVolume();
        volume = myRadio.volume;
        System.out.println("Громкость:" + volume);
        assertEquals(6, volume);
    }

    @Test
    void shouldHoldVolumeAtTen() {
        myRadio.volume = 10;
        int volume;
        myRadio.upVolume();
        volume = myRadio.volume;
        System.out.println("Громкость:" + volume);
        assertEquals(10, volume);
    }

    @Test
    void shouldDownVolume() {
        myRadio.volume = 10;
        int volume;
        myRadio.downVolume();
        volume = myRadio.volume;
        System.out.println("Громкость:" + volume);
        assertEquals(9, volume);
    }

    @Test
    void shouldHoldVolumeAtZero() {
        myRadio.volume = 0;
        int volume;
        myRadio.downVolume();
        volume = myRadio.volume;
        System.out.println("Громкость:" + volume);
        assertEquals(0, volume);
    }

}