package studio7;

class HockeyPlayer {
    private String name;
    private int jerseyNumber;
    private String shootingSide; // "left", "right", "either"
    private String handedness; // "left", "right"
    private int goals;
    private int assists;
    private int gamesPlayed;

    public HockeyPlayer(String name, int jerseyNumber, String shootingSide, String handedness) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.shootingSide = shootingSide;
        this.handedness = handedness;
        this.goals = 0;
        this.assists = 0;
        this.gamesPlayed = 0;
    }

    public void recordGame(int goals, int assists) {
        this.goals += goals;
        this.assists += assists;
        this.gamesPlayed++;
    }

    public int getPoints() {
        return goals + assists;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public String toString() {
        return name + " (#" + jerseyNumber + ") - Shoots: " + shootingSide + ", Handed: " + handedness +
                ", Goals: " + goals + ", Assists: " + assists + ", Points: " + getPoints() + ", Games: " + gamesPlayed;
    }

    public static void main(String[] args) {
        HockeyPlayer p1 = new HockeyPlayer("Alex", 87, "right", "left");
        p1.recordGame(2, 1);
        p1.recordGame(1, 2);
        System.out.println(p1);
    }
}