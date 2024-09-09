package com.Music;

public class VolumeControlDecorator extends MusicPlaybackDecorater{
	
	private int volumeLevel;

    public VolumeControlDecorator(MusicSource musicSource, int volumeLevel) {
        super();
        this.volumeLevel = volumeLevel;
    }

    public void play() {
        super.play();
        setVolume(volumeLevel);
    }

    private void setVolume(int volumeLevel) {
        System.out.println("Setting volume to level: " + volumeLevel);
    }

}
