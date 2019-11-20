

public class Main {

    public static void main(String[] args) {
        int xStart = 1;
        int yStart = 2;
        Orientation orientation = Orientation.EAST;
        String TuringTape = "MMLMRMMRRMML";

        State.setX(xStart);
        State.setY(yStart);
        State.setOrientation(orientation);

        System.out.println(State.getState());

        for (int i = 0; i < TuringTape.length(); i++) {
            System.out.println(TuringTape.charAt(i));
            switch (TuringTape.charAt(i)) {
                case 'M':
                    State.move();
                    System.out.println(State.getState());
                    break;
                case 'L':
                    State.rotateLeft();
                    break;
                case 'R':
                    State.rotateRight();
                    break;
                default:
                    System.out.println("Not a valid move!");
                    break;
            }
        }

        System.out.println(State.getState());
    }

}
