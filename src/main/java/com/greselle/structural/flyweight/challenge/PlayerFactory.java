package com.greselle.structural.flyweight.challenge;

import java.util.HashMap;

public class PlayerFactory {
    private static HashMap<String, Player> playerHashMap = new HashMap<>();

    public static Player getPlayer(String type) {
        Player player = null;

        if (playerHashMap.containsKey(type)) {
//            System.out.println("# Getting instance: " + robotType);
            player = playerHashMap.get(type);
        } else {
            switch (type) {
                case "Terrorist" -> {
                    System.out.println("*** Creating NEW Terrorist");
                    player = new Terrorist();
                    playerHashMap.put("Terrorist", player);
                }
                case "CounterTerrorist" -> {
                    System.out.println("*** Creating NEN CounterTerrorist");
                    player = new CounterTerrorist();
                    playerHashMap.put("CounterTerrorist", player);
                }
                default -> {
                    playerHashMap.put(type, new Terrorist());
                    System.out.println("Can only create Terrorist or CounterTerrorist");
                }
            }
        }
        return player;
    }

}
