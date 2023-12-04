public class Radio {
    private int currentStation;
    private int numberStation = 10;
    private int minStation = 0;
    private int maxStation = numberStation - 1;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public Radio(int numberStation) {
        this.maxStation = numberStation - 1;
    }

    public Radio() {

    }

    public void setCurrentStation(int anotherCurrentStation) {
        if (anotherCurrentStation < minStation) {
            return;
        }
        if (anotherCurrentStation > maxStation) {
            return;
        }
        this.currentStation = anotherCurrentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int thisCurrentVolume) {
        if (thisCurrentVolume < minVolume) {
            return;
        }
        if (thisCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = thisCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}
