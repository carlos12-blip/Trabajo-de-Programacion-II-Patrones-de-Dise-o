package adapter_desing_pattern;
/**Integrantes del grupo: 
 * Dilan Méndez
 * Ivan Ortiz
 * Brayan Segura
 * Rayner Navarro 
 */
public class Adapter_Desing_Pattern_Demo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
