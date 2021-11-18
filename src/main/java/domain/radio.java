package domain;

public class Radio {
    private int maxChanel;
    private int minChanel;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private int currentChanel;
    private int entChanel;

    public void setMaxChanel() {
        maxChanel = 9;
    }

    public void setMinChanel() {
        minChanel = 0;
    }

    public void setMaxVolume() {
        maxVolume = 10;
    }

    public void setMinVolume() {
        minVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            return;
        else if(currentVolume < maxVolume) {
                currentVolume = currentVolume +1;
            }
        }
    }
    public void loweringVolume(){
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        else if(currentVolume <= minVolume) {
                return;
            }
        }
    }
    public void increaseChanel(){
        if (currentChanel >= 9) {
            currentChanel = minChanel;
        else if (currentChanel < 9) {
                currentChanel = currentChanel +1;

            }
        }
    }
    public void loweringChanel(){
        if (currentChanel > 0 ) {
            currentChanel = minChanel;
        else if (currentChanel < 10) {
                currentChanel = currentChanel +1;

            }
        }

    }
    public void enterChanel(){
        if (entChanel>=minChanel && entChanel<= maxChanel){
            entChanel= entChanel;
        }
        else
            return;
    }
}


