package com.Music;

public class OnlineStreaming {
	
	public void connectToService(String serviceName) {
        System.out.println("Connecting to online streaming service: " + serviceName);
    }

    public void startStreaming() {
        System.out.println("Streaming music from online service.");
    }

    public void stopStreaming() {
        System.out.println("Stopping online streaming.");
    }
}

class OnlineStreamingAdapter implements MusicSource {
    private OnlineStreaming streamingService;
    private String serviceName;

    public OnlineStreamingAdapter(String serviceName) {
        this.serviceName = serviceName;
        this.streamingService = new OnlineStreaming();
    }

    @Override
    public void play() {
        streamingService.connectToService(serviceName);
        streamingService.startStreaming();
    }

    @Override
    public void stop() {
        streamingService.stopStreaming();
    }
}
