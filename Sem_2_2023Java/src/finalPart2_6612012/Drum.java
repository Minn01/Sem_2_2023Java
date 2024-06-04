package finalPart2_6612012;

/*
Name : Min Thant
Section : 544
ID : 6612012
 */

public class Drum extends Music implements Hitable {
    @Override
    public void play() {
        System.out.println("Play drum***");
    }

    @Override
    public void hit() {
        System.out.println("Hit surface of drum to make sound.");
    }
}
