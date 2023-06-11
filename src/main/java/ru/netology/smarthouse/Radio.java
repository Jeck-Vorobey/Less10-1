package ru.netology.smarthouse;

public class Radio {
    public int currentStation;      // номер текущей радиостанции
    public int volume;              // громкость звука


    public int getCurrentStation() {        //возвращаем значение станции
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {  //получаем значение станции
        currentStation = newCurrentStation;
    }

    public int getVolume() {                 //возвращаем значение громкости
        return volume;
    }

    public void setVolume(int newVolume) {   //получаем значение громкости
        volume = newVolume;
    }

    // КАНАЛЫ

    public void currentStationNumber() {    // устанавливаем граничные значения радиостанции от 0 до 9
        if (currentStation < 0) {
            currentStation = 0;
        }
        if (currentStation > 9) {
            currentStation = 9;
        } else currentStation = currentStation;
    }

    public void next() {                    //переключение станции на 1 вверх
        if (currentStation > 8) {
            currentStation = 0;
        } else currentStation++;
    }

    public void prev() {           //переключение станции на 1 вниз
        if (currentStation < 1) {
            currentStation = 9;
        } else currentStation--;

    }

    //ГРОМКОСТЬ
    public void limitsVolume() {       //устанавливаем граничные значения громкости от 0 до 10
        if (volume > 10) {
            volume = 10;
        }
        if (volume < 0) {
            volume = 0;
        } else volume = volume;
    }

    public void volumeUp() {            //устанавливаем максимальную громкость 10
        if (volume < 10) {
            volume++;
        }
        if (volume >= 10) {
            volume = 10;
        }
    }

    public void volumeDown() {            //устанавливаем минимальную громкость 0
        if (volume > 0) {
            volume--;
        }
        if (volume <= 0) {
            volume = 0;
        }
    }
}
