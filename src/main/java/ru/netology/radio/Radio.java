package ru.netology.radio;


public class Radio {
    int currentStation;
    int volume;

    public void setCurrentStation(int Station) {
        currentStation = Station;
    }

    public void upCurrentStation() {
        currentStation++;
        if (currentStation > 9)
            currentStation = 0;
    }

    public void downCurrentStation() {
        currentStation--;
        if (currentStation < 0)
            currentStation = 9;
    }

    public void upVolume() {
        volume++;
        if (volume > 10)
            volume = 10;
    }

    public void downVolume() {
        volume--;
        if (volume < 0)
            volume = 0;
    }
}
