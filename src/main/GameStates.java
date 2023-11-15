package main;

public enum GameStates {
    PLAYING,
    SETTINGS,
    UPGRADE;

    public static GameStates gameStates = PLAYING;
    public static void SetGameState(GameStates state){
        gameStates = state;
    }
}
