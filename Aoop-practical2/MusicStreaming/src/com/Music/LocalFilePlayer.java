package com.Music;

public class LocalFilePlayer {
	public void startPlaying(String filePath) {
        System.out.println("Playing local file: " + filePath);
    }

    public void stopPlaying() {
        System.out.println("Stopping local file playback.");
    }
}

class LocalFileAdapter implements MusicSource {
    private LocalFilePlayer localFilePlayer;
    private String filePath;

    public LocalFileAdapter(String filePath) {
        this.filePath = filePath;
        this.localFilePlayer = new LocalFilePlayer();
    }

    public void play() {
        localFilePlayer.startPlaying(filePath);
    }

    public void stop() {
        localFilePlayer.stopPlaying();

}
}
