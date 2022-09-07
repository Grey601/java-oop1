package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;

//@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int numberOfRadioStations;
    private int currentRadioStation;
    private int numberOfDivisionsOfTheVolumeScale = 100;
    private int currentVolume;

    void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > numberOfRadioStations - 1) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > numberOfDivisionsOfTheVolumeScale) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public Radio() {
        this.numberOfRadioStations = 10;
    }

    public void setNextRadioStation() {
        if (currentRadioStation < numberOfRadioStations - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else currentRadioStation = 0;
    }

    public void setPrevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else currentRadioStation = numberOfRadioStations - 1;
    }

    public void setIncreaseVolume() {
        if (currentVolume < numberOfDivisionsOfTheVolumeScale) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}