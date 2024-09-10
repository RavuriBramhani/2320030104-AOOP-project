package com.Music;

public class Main {
	public static void main(String[] args) {
		MusicSource localMusic = new LocalFileAdapter("song.mp3");
        localMusic.play();
        localMusic.stop();

        System.out.println("----------------");

        MusicSource onlineMusic = new OnlineStreamingAdapter("Spotify");
        onlineMusic.play();
        onlineMusic.stop();

        System.out.println("----------------");

        MusicSource radioMusic = new RadioStationAdapter("98.3");
        radioMusic.play();
        radioMusic.stop();

        System.out.println("----------------");

        MusicSource enhancedOnlineMusic = new VolumeControlDecorator(new OnlineStreamingAdapter("Apple Music"), 75);
        enhancedOnlineMusic.play();
        enhancedOnlineMusic.stop();

	}

}
