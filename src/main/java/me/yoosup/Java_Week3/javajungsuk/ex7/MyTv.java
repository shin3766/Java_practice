package me.yoosup.Java_Week3.javajungsuk.ex7;

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        this.isPowerOn = !isPowerOn;
    }

    void volumeUp() {
        if (this.volume < MAX_VOLUME) {
            this.volume += 1;
        }
    }

    void volumeDown() {
        if (this.volume > MIN_VOLUME) {
            this.volume -= 1;
        }
    }

    void channelUp() {
        this.channel += 1;

        if (this.channel > MAX_CHANNEL) {
            this.channel = MIN_CHANNEL;
        }
    }

    void channelDown() {
        this.channel -= 1;

        if (this.channel < MIN_CHANNEL) {
            this.channel = MAX_CHANNEL;
        }
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}
class ex6_19 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

//        t.setChannel(10);
//        System.out.println("CH:" + t.getChannel());
//        t.setVolume(20);
//        System.out.println("VOL:" + t.getVolume());

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
    }
}

