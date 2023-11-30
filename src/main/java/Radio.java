public class Radio {
    private int currentStation;
    private int currentVolume;

    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int thisCurrentVolume) {
        // if (thisCurrentVolume > 100) {
     //       return;
      //  }
      //  if (thisCurrentVolume < 0) {
      //      return;
      //  }
        currentVolume = thisCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
