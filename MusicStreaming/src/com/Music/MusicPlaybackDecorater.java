package com.Music;

public class MusicPlaybackDecorater implements MusicSource{
	
	protected MusicSource musicSource;

    public void MusicPlaybackDecorator(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    public void play() {
        musicSource.play();
    }

    public void stop() {
        musicSource.stop();
    }

}
