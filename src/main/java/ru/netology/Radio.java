package ru.netology;

public class Radio {

    public int currentRadioStation = 3;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else currentRadioStation = 0;
    }

    public void setPrevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else currentRadioStation = 9;
    }

    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
