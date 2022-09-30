package ru.netology.Homework_OOP_II;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldIncreaseNumberRadioStationAfterMax() {
        Radio radio = new Radio();

        radio.currentRadioStation = 9;

        int expected = 0;
        int actual = radio.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberRadioStationWithMin() {
        Radio radio = new Radio();

        radio.currentRadioStation = 0;

        int expected = 1;
        int actual = radio.nextRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberRadioStationAfterMin() {
        Radio radio = new Radio();

        radio.currentRadioStation = 0;

        int expected = 9;
        int actual = radio.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberRadioStationWithMax() {
        Radio radio = new Radio();

        radio.currentRadioStation = 9;

        int expected = 8;
        int actual = radio.prevRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWithMin() {
        Radio radio = new Radio();

        radio.currentVolume = 0;

        int expected = 1;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAfterMax() {
        Radio radio = new Radio();

        radio.currentVolume = 11;

        int expected = 10;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeWithMax() {
        Radio radio = new Radio();

        radio.currentVolume = 10;

        int expected = 9;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeAfterMim() {
        Radio radio = new Radio();

        radio.currentVolume = 0;

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}

//    @Test
//    public void shouldCurrentRadioStation() {
//        Radio radio = new Radio();
//
//        radio.setCurrentRadioStation(0);
//
//        int expected = 0;
//        int actual = radio.getCurrentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldCurrentRadioStation1() {
//        Radio radio = new Radio();
//
//        radio.setCurrentRadioStation(9);
//
//        int expected = 9;
//        int actual = radio.getCurrentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldRadioStationNextAfterMax() {
//        Radio radio = new Radio();
//
//        radio.setCurrentRadioStation(10);
//
//        int expected = 0;
//        int actual = radio.getCurrentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldRadioStationPreviousBeforeMin() {
//        Radio radio = new Radio();
//
//        radio.setCurrentRadioStation(-1);
//
//        int expected = 0;
//        int actual = radio.getCurrentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldCurrentVolume() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(6);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldVolumeNextAfterMax() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(9);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldVolumePreviousBeforeMin() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(-2);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
