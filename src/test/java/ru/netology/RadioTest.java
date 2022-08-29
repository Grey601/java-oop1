package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(7);

        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetInvalidRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(11);

        int expected = 3;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(6);
        station.setNextRadioStation();

        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationCyclical() {
        Radio station = new Radio();

        station.setCurrentRadioStation(9);
        station.setNextRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(4);
        station.setPrevRadioStation();

        int expected = 3;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationCyclical() {
        Radio station = new Radio();

        station.setCurrentRadioStation(0);
        station.setPrevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();

        volume.currentVolume = 4;
        volume.increaseVolume();

        int expected = 5;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeGreaterMaxValue() {
        Radio volume = new Radio();

        volume.currentVolume = 10;
        volume.increaseVolume();

        int expected = 10;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();

        volume.currentVolume = 1;
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeLessMinValue() {
        Radio volume = new Radio();

        volume.currentVolume = 0;
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

}
