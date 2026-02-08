package ui;

import core.Player;
import engine.GameEngine;

public class GameUI {
    private Player currentPlayer;
    private GameEngine gameEngine;
    
    public GameUI(Player player, GameEngine engine) {
        this.currentPlayer = player;
        this.gameEngine = engine;
    }
    
    public void displayVillage() {
        System.out.println("=== " + currentPlayer.getVillage() + " ===");
        // Display village information
    }
    
    public void displayBuildMenu() {
        System.out.println("=== Build Menu ===");
        System.out.println("1. Farm");
        System.out.println("2. Gold Mine");
        System.out.println("3. Archer Tower");
        // Display building options
    }
    
    public void displayAttackMenu() {
        System.out.println("=== Attack Menu ===");
        // Display attack options
    }
    
    public void handleUserInput() {
        // Handle user input for game actions
    }
}
