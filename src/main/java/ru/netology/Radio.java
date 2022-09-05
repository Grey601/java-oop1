package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    int numberOfRadioStations;
    public int numberOfDivisionsOfTheVolumeScale = 100;
    public int currentRadioStation = 3;
    public int currentVolume;

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations - 1;
    }

    public Radio() {
        this.numberOfRadioStations = 10 - 1;
    }

    public int getNumberOfRadioStations() {
        this.numberOfRadioStations = numberOfRadioStations + 1;
        return numberOfRadioStations;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > numberOfRadioStations) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > numberOfDivisionsOfTheVolumeScale) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextRadioStation() {
        if (currentRadioStation < numberOfRadioStations) {
            currentRadioStation = currentRadioStation + 1;
        } else currentRadioStation = 0;
    }

    public void setPrevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else currentRadioStation = numberOfRadioStations;
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
