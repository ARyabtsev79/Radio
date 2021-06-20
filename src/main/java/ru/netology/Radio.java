package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


  @AllArgsConstructor
  @NoArgsConstructor
  @Data
public class Radio {
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation;
    private int volume;
    private int minVolume = 0;
    private int maxVolume;

    public Radio(int currentRadioStation, int maxRadioStation, int volume, int maxVolume) {
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.volume = volume;
        this.maxVolume = maxVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void changeOnPreviousRadioStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }


    public void changeOnNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

    public void volumeUpForOne() {

        if (volume < maxVolume) {
            this.volume++;
        }
    }

    public void volumeDownForOne() {
        if (volume > minVolume) {
            this.volume--;
        }
    }

}