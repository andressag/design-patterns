package com.greselle.structural.flyweight.challenge;

import java.util.Random;

public class CounterStrike {
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapon = {"weapon1", "weapon2", "weapon3", "weapon4"};

    public static String getRandPlayerType() {
        Random random = new Random();
        int result = random.nextInt(playerType.length);
        return playerType[result];
    }

    public static String getRandWeapon() {
        Random random = new Random();
        int result = random.nextInt(weapon.length);
        return weapon[result];
    }

    public static void main(String[] args) {
        // creating 10 players
        for (int i = 0; i < 10; i++) {
            Player player = PlayerFactory.getPlayer(getRandPlayerType());
            player.assignWeapon(getRandWeapon());
            player.mission();
        }
    }
}
