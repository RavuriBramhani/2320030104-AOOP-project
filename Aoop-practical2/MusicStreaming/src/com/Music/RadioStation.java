package com.Music;

public class RadioStation {

    public void tuneToStation(String frequency) {
        System.out.println("Tuning to radio station at " + frequency + " MHz.");
    }

    public void startRadio() {
        System.out.println("Playing music from radio station.");
    }

    public void stopRadio() {
        System.out.println("Stopping radio playback.");
    }
}

class RadioStationAdapter implements MusicSource {
    private RadioStation radioStation;
    private String frequency;

    public RadioStationAdapter(String frequency) {
        this.frequency = frequency;
        this.radioStation = new RadioStation();
    }

    public void play() {
        radioStation.tuneToStation(frequency);
        radioStation.startRadio();
    }

    public void stop() {
        radioStation.stopRadio();
    }
	
}
