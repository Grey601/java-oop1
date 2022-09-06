package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        ru.netology.Radio station = new ru.netology.Radio(12);

        station.setCurrentRadioStation(7);

        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDefaultRadioStation() {
        ru.netology.Radio station = new ru.netology.Radio(12);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDefaultNumberOfRadioStations() {
        ru.netology.Radio station = new ru.netology.Radio();

        int expected = 10;
        int actual = station.getNumberOfRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetInvalidRadioStation() {
        ru.netology.Radio station = new ru.netology.Radio(11);

        station.setCurrentRadioStation(11);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        ru.netology.Radio station = new ru.netology.Radio(12);

        station.setCurrentRadioStation(6);
        station.setNextRadioStation();

        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationCyclical() {
        ru.netology.Radio station = new ru.netology.Radio(12);

        station.setCurrentRadioStation(11);
        station.setNextRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation() {
        ru.netology.Radio station = new ru.netology.Radio(12);

        station.setCurrentRadioStation(4);
        station.setPrevRadioStation();

        int expected = 3;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationCyclical() {
        ru.netology.Radio station = new ru.netology.Radio(12);

        station.setCurrentRadioStation(0);
        station.setPrevRadioStation();

        int expected = 11;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        ru.netology.Radio volume = new ru.netology.Radio(4);

        volume.setCurrentVolume(7);

        int expected = 7;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetInvalidVolume() {
        ru.netology.Radio volume = new ru.netology.Radio(4);

        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNumberOfDivisionsOfTheVolumeScale() {
        Radio volume = new Radio();

        int expected = 100;
        int actual = volume.getNumberOfDivisionsOfTheVolumeScale();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        ru.netology.Radio volume = new ru.netology.Radio(4);

        volume.setCurrentVolume(4);
        volume.setIncreaseVolume();

        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeGreaterMaxValue() {
        ru.netology.Radio volume = new ru.netology.Radio(4);

        volume.setCurrentVolume(100);
        volume.setIncreaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        ru.netology.Radio volume = new ru.netology.Radio(4);

        volume.setCurrentVolume(1);
        volume.setDecreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeLessMinValue() {
        ru.netology.Radio volume = new ru.netology.Radio(4);

        volume.setCurrentVolume(0);
        volume.setDecreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}