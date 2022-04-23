package adapter_desing_pattern;

public class Adapter_Desing_Pattern implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public Adapter_Desing_Pattern(String audioType) {

        if (audioType.equalsIgnoreCase("vlc")) {

        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
