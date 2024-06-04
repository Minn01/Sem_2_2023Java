package finalPart2_6612012;

/*
Name : Min Thant
Section : 544
ID : 6612012
 */

public class TheDriverProgram {
    public static void main(String[] args) {
        Playable[] testPlay = {new Piano(), new Drum(), new Baseball(), new Basketball()};
        for (Playable each : testPlay) {
            each.play();
            if (each instanceof Hitable) {
                ((Hitable) each).hit();
            }
        }
    }
}
