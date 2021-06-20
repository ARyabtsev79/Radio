package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {


    @Test
    public void increaseVolume() {
        Radio radio = new Radio(0, 100, 5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeMin() {
        Radio radio = new Radio();
        radio.increaseVolume();

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio(0, 100, 100);
        radio.increaseVolume();

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void decreaseVolumeMin() {
        Radio radio = new Radio(0, 100, 0);
        radio.decreaseVolume();

        assertEquals(0, radio.getMinVolume());
    }


    @Test
    public void decreaseVolumeMax() {
        Radio radio = new Radio(0, 100, 100);
        radio.decreaseVolume();

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio(0, 100, 5);
        radio.decreaseVolume();

        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeMin() {
        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeMax() {
        Radio radio = new Radio(0, 100, 100);

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUnder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOver() {
        Radio radio = new Radio();
        radio.setCurrentVolume(115);

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio(10, 6);
        radio.nextRadioStation();

        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio(10, 6);
        radio.prevRadioStation();

        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationMin() {
        Radio radio = new Radio(10, 0);
        radio.prevRadioStation();

        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationMax() {
        Radio radio = new Radio(10, 10);
        radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationMax() {
        Radio radio = new Radio(10, 10);
        radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMin() {
        Radio radio = new Radio(10, 0);
        radio.prevRadioStation();

        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationUnder() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void setCurrentRadioStationOver() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(15);

        assertEquals(10, radio.getCurrentRadioStation());
    }
}