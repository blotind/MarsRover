class State {

    private static Orientation orientation;
    private static int x;
    private static int y;

    private State() {
        throw new IllegalStateException("Utility Class");
    }

    static void rotateRight() {
        switch (orientation) {
            case NORTH:
                orientation = Orientation.EAST;
                break;
            case EAST:
                orientation = Orientation.SOUTH;
                break;
            case SOUTH:
                orientation = Orientation.WEST;
                break;
            case WEST:
                orientation = Orientation.NORTH;
                break;
            default:
                System.out.println("Orientation not valid for rotateRight");
                break;
        }
    }

    static void rotateLeft() {
        switch (orientation) {
            case NORTH:
                orientation = Orientation.WEST;
                break;
            case EAST:
                orientation = Orientation.NORTH;
                break;
            case SOUTH:
                orientation = Orientation.EAST;
                break;
            case WEST:
                orientation = Orientation.SOUTH;
                break;
            default:
                System.out.println("Orientation not valid for rotateLeft");
                break;
        }
    }

    static void move() {
        switch (orientation) {
            case NORTH:
                y++;
                break;
            case EAST:
                x++;
                break;
            case SOUTH:
                y--;
                break;
            case WEST:
                x--;
                break;
            default:
                System.out.println("Invalid Orientation for move");
                break;
        }
    }

    private static Orientation getOrientation() {
        return orientation;
    }

    public static void setOrientation(Orientation orientation) {
        State.orientation = orientation;
    }

    private static int getX() {
        return x;
    }

    public static void setX(int x) {
        State.x = x;
    }

    private static int getY() {
        return y;
    }

    public static void setY(int y) {
        State.y = y;
    }

    public static String getState()
    {
        return "X: " + getX() + " Y: " + getY() + " Orientation: " + getOrientation();
    }

}
