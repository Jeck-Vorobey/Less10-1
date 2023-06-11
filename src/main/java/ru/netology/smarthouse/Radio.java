package ru.netology.smarthouse;

public class Radio {
    public int currentStation;      // номер текущей радиостанции
    public int volume;              // текущая громкость
    public int getCurrentStation() {        //возвращаем значение станции
        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {  //получаем значение станции
       if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        } else currentStation = newCurrentStation;

    }
    public int getVolume() {                 //возвращаем значение громкости
        return volume;
    }

    public void setVolume(int newVolume) {   //получаем значение громкости без применения метода Early exit
        if (newVolume > 10) {
            volume = 10;
        } else volume = newVolume;
        if (newVolume < 0) {
            volume = 0;
        }
    }

    // КАНАЛЫ


    public void next() {                    //переключение станции на 1 вверх
        if (currentStation > 8) {
            currentStation = 0;
        } else currentStation++;
    }

    public void prev() {                     //переключение станции на 1 вниз
        if (currentStation < 1) {
            currentStation = 9;
        } else currentStation--;

    }

    //ГРОМКОСТЬ

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
