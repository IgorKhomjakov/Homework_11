package ru.netology.Homework_OOP_II;

public class Radio {
    public int minRadioStation = 0;
    public int maxRadioStation = 9;
    public int currentRadioStation;
    public int minVolume = 0;
    public int maxVolume = 10;
    public int currentVolume;

    public int nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
        return currentRadioStation;
    }

    public int prevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
        return currentRadioStation;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

}


//    public  int getCurrentRadioStation() { return currentRadioStation; }
//    public int setCurrentRadioStation(int newCurrentRadioStation) {
//        if (currentRadioStation < 0) {
//            return maxRadioStation;
//        }
//        if (currentRadioStation > 9) {
//            return minRadioStation;
//        }
//        return currentRadioStation = newCurrentRadioStation;
//    }
//
//
//    public int getCurrentVolume() { return currentVolume; }
//
//    public int setCurrentVolume(int newCurrentVolume) {
//        if (currentVolume < 0) {
//            return minVolume;
//        }
//        if (currentVolume > 10) {
//            return maxVolume;
//        }
//        return newCurrentVolume;
//    }
//}
//    public int currentRadioStation;
//
//    public void increaseRadioStation(int i) {
//        if (currentRadioStation < 9) {
//            currentRadioStation = currentRadioStation + 1;
//        }
//        if (currentRadioStation > 0) {
//            currentRadioStation = currentRadioStation -1;
//        }
//    }
//
//    public int currentVolume;



