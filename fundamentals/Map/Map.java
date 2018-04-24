import java.util.HashMap;

public class Map {
    public HashMap trackList() {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Time After Time", "If you're lost you can look--and you will find me. Time after time.");
        trackList.put("Take Me On", "Take on me, (take on me). Take me on, (take on me). I'll be gone in a day or two.");
        trackList.put("Here I Go Again", "Here I go again on my own. Goin' down the only road I've ever known.");
        trackList.put("Jump", "Ah, might as well jump (jump). Might as well jump! Go ahead an' jump (jump).");
        String song = trackList.get("Time After Time");
        System.out.println(song);
        trackList.forEach((key, val) -> System.out.println(key + ": " + val));
        return trackList;
    }
}