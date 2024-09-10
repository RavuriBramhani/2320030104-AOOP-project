package com.Music;

public class EquilaizerDecorator extends MusicPlaybackDecorater{
	
	public EquilaizerDecorator(MusicSource musicSource) {
		super();
    }

	public void play() {
        super.play();
        applyEqualizer();
    }

    private void applyEqualizer() {
        System.out.println("Applying equalizer settings.");
    }

}
