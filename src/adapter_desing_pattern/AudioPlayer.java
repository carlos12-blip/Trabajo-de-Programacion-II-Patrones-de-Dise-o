package adapter_desing_pattern;

public class AudioPlayer implements MediaPlayer {

    Adapter_Desing_Pattern adapter_desing_pattern;

    @Override
    public void play(String audioType, String fileName) {
        //inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } //Adapter_Desing_Pattern is providing support to play other music files formats
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            adapter_desing_pattern = new Adapter_Desing_Pattern(audioType);
            adapter_desing_pattern.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + "format not supported");
        }
    }
}
